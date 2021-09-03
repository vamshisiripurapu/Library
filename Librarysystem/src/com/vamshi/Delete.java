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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JOptionPane;

class Delete extends Frame{
	TextField J1;
	public Delete() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setBackground(Color.ORANGE);
		setLayout(null);
		setSize(300, 300);
		J1=new TextField("");
		J1.setBounds(250, 260, 150, 40);
		add(J1);
		Button button=new Button("hitit");
		button.setBounds(150, 170, 70, 70);
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
				
					String sq="Delete From ADDing where bookname =?";
					PreparedStatement preparedStatement=connection.prepareStatement(sq);
					String jm=J1.getText();
					preparedStatement.setString(1, jm);
					int is=preparedStatement.executeUpdate();
					JOptionPane.showMessageDialog(null, "deleted sucessfully");
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
		new Delete();
	}
}