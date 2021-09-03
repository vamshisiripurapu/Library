package com.vamshi;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Adminlog extends Frame{
	
public Adminlog() {
	// TODO Auto-generated constructor stub
	setVisible(true);
	setBackground(Color.magenta);
	setLayout(null);
	setSize(600, 600);
	Button button=new Button("ADD");
	button.setBounds(120, 60, 180, 100);
	add(button);
	Button button1=new Button("view");
	button1.setBounds(120, 180, 180, 100);
	add(button1);
	Button button2=new Button("Delete");
	button2.setBounds(120, 300, 180, 100);
	add(button2);
	Button button3=new Button("Logout");
	button3.setBounds(120, 420, 180, 100);
	add(button3);
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ADD add=new ADD();
			add.setVisible(true);
		}
	});
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			View view=new View();
			view.setVisible(true);
		}
	});
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Delete delete=new Delete();
			delete.setVisible(true);
		}
	});
	button3.addActionListener(new ActionListener() {
		
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
new Adminlog();
	}

}
