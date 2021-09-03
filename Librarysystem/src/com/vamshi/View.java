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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JOptionPane;

public class View extends Frame{
	TextField J1,J2;
	public View() {
		// TODO Auto-generated constructor stub
	
	setVisible(true);
	setBackground(Color.GREEN);
	setLayout(null);
	setSize(300, 300);
	Button button=new Button("Seeit");
	button.setBounds(250, 200, 50, 30);
	add(button);

	J1=new TextField("");
	J1.setBounds(250, 260, 150, 40);
	add(J1);
	J2=new TextField("");
	J2.setBounds(250, 320, 150, 40);
	add(J2);
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Properties p=new Properties();
			FileInputStream fileInputStream;
			try {
				fileInputStream = new FileInputStream("db.Properties");
				p.load(fileInputStream);
				String url=p.getProperty("url");
				String user=p.getProperty("user");
				String pass=p.getProperty("pass");
				Connection connection =DriverManager.getConnection(url,user,pass);
				Statement st=connection.createStatement();
				String sq="select * from ADDing";
				ResultSet rst=st.executeQuery(sq);
				while(rst.next()) {
					J1.setText(rst.getString(1));
					J2.setText(rst.getString(2));
				}
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
new View();
	}

}
