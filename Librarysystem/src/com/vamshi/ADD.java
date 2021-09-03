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
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class ADD extends Frame {
	TextField field;
		TextField field1;
		String st,sl;
	public ADD() {
		setVisible(true);
		setBackground(Color.ORANGE);
		setLayout(null);
		setSize(600, 600);
		
		field=new TextField("enter book");
		field.setBounds(200, 120, 60, 20);
		add(field);
		 field1=new TextField("book author");
		field1.setBounds(200, 150, 60, 20);
		add(field1);
		
	Button button=new Button("submit");
		button.setBounds(250, 200, 50, 30);
		add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource().equals(button)) {
				Properties p=new Properties();
				try {
					FileInputStream fileInputStream=new FileInputStream("db.Properties");
					p.load(fileInputStream);
					String url=p.getProperty("url");
					String user=p.getProperty("user");
					String pass=p.getProperty("pass");
					Connection connection =DriverManager.getConnection(url,user,pass);
					st=field.getText();
					 sl=field1.getText();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into ADDing values(?,?)");
				preparedStatement.setString(1, st);
					
				preparedStatement.setString(2, sl);
				//	java.sql.Statement statement=connection.createStatement();
				//	String sal="insert into ADDing values(field,field1)";
				//	int x=statement.executeUpdate(sal);
				int in=preparedStatement.executeUpdate();
				
				String result=st;
				JOptionPane.showMessageDialog(field, "values entered","Message",JOptionPane.ERROR_MESSAGE);;
				System.out.println("enterd values="+st+" "+sl);
						
						
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
new ADD();
	}

}
