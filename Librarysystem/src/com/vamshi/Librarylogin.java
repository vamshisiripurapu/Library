package com.vamshi;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Librarylogin extends Frame {
	public Librarylogin() {
		setVisible(true);
		setBackground(Color.pink);
		setLayout(null);
		setSize(600, 700);
		Button button=new Button("ADD");
		button.setBounds(120, 60, 180, 100);
		add(button);
		Button button1=new Button("view");
		button1.setBounds(120, 180, 180, 100);
		add(button1);
		Button button2=new Button("Issuebook");
		button2.setBounds(120, 300, 180, 100);
		add(button2);
		Button button3=new Button("viewissuedbook");
		button3.setBounds(120, 420, 180, 100);
		add(button3);
		Button button4=new Button("returnbook");
		button4.setBounds(120, 550, 180, 100);
		add(button4);
		Button button5=new Button("Logout");
		button5.setBounds(120, 550, 180, 100);
		add(button5);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Ladd ladd=new Ladd();
				ladd.setVisible(true);
			}
		});
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Lview lview=new Lview();
				
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			issuebook issuebook=new issuebook();	
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				viewissuedbook viewissuedbook=new viewissuedbook();
			}
		});
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				returnbook rt=new returnbook();
			}
		});
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nt=JOptionPane.showConfirmDialog(null, "are u sure",
						 null, JOptionPane.YES_NO_CANCEL_OPTION);
						if(nt==JOptionPane.YES_OPTION){
							dispose();
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
new Librarylogin();
	}

}
