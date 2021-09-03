package com.vamshi;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.FileInputStream;;

public class Dummystudent extends Frame {
	TextField tx;
	public Dummystudent() {
		setVisible(true);
		setBackground(Color.GREEN);
		setLayout(null);
		setSize(300, 300);
		tx=new TextField();
		tx.setBounds(150, 100, 100, 50);
		add(tx);
		Button button=new Button("student name ");
		button.setBounds(250, 200, 50, 30);
		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource().equals(button)) {
					Properties p=new Properties();
					FileInputStream fileInputStream;
					try {
						fileInputStream = new FileInputStream("db.Properties");
						p.load(fileInputStream);
						String url=p.getProperty("url");
						String user=p.getProperty("user");
						String pass=p.getProperty("pass");
						Connection connection =DriverManager.getConnection(url,user,pass);
						String mnt="select * from student where studentname=?";
						PreparedStatement pt=connection.prepareStatement(mnt);
						String snt=tx.getText();
						pt.setString(1, snt);
						ResultSet amn=pt.executeQuery();
						while(amn.next()) {
						System.out.println(amn.getString("studentname"));
						System.out.println("record fetched");}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		});
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dummystudent();
	}

}
