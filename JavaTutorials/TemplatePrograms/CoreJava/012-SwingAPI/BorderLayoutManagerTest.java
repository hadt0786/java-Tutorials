package com.emertxe;

/**
 * Program Description: This program is to show the implementation of BorderLayoutManager in java
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac BorderLayoutManagerTest.java
 * Execution: java BorderLayoutManagerTest
 * Output:
 */

import java.awt.*;
import javax.swing.*;

public class BorderLayoutManagerTest {

	private JFrame f;
	private JButton bn, bs, bw, be, bc;

	public BorderLayoutManagerTest() {

		f = new JFrame("Border Layout");
		bn = new JButton("Button 1");
		bc = new JButton("Button 2");
		bw = new JButton("Button 3");
		bs = new JButton("Button 4");
		be = new JButton("Button 5");
	}

	public void launchFrame() {

		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setSize(400, 200);
		f.setVisible(true);
	}

	public static void main(String[] args) {

		BorderLayoutManagerTest blmt = new BorderLayoutManagerTest();
		blmt.launchFrame();

	}

}
