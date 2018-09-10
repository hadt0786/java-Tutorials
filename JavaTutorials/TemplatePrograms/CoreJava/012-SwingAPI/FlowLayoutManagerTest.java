package com.emertxe;

/**
 * Program Description:  The program is to show the implementation of the FlowLayoutManager
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac FlowLayoutManagerTest.java
 * Execution: java FlowLayoutManagerTest
 * Output:
 */

import java.awt.*;
import javax.swing.*;

public class FlowLayoutManagerTest {

	private JFrame f;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;

	public FlowLayoutManagerTest() {

		f = new JFrame("GUI example");
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");

	}

	public void launchFrame() {

		// FlowLayout class is present inside java.awt package
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {

		FlowLayoutManagerTest flmt = new FlowLayoutManagerTest();
		flmt.launchFrame();

	}

}
