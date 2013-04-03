package com.blogspot.magazsa.simpletest.gui;

import java.awt.CardLayout;

import javax.swing.JFrame;


public class TestsFrame extends JFrame {

	private static final long serialVersionUID = -769882017800775476L;

	private CardLayout layout;
	
	public TestsFrame() {
		setTitle("Simple Tests");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		layout = new CardLayout();
		setLayout(layout);
		
		

		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		new TestsFrame().setVisible(true);
	}
}
