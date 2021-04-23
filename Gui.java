//Java How to create a frame*****************************************************************************************************************************************
//We can Also instead of puting this in main we can create a class which extends JFrame then call it in the main class
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

 public static void main(String[] args) {

  // JFrame = a GUI window to add components to
  
  JFrame frame = new JFrame(); //creates a frame
  frame.setTitle("JFrame title goes here"); //sets title of frame
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
  frame.setResizable(false); //prevent frame from being resized
  frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
  frame.setVisible(true); //make frame visible
  
  ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
  frame.setIconImage(image.getImage()); //change icon of frame
  frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
    
 }
}

//Java Label*************************************************************************************************************************************************************
// You might want to add frame.setVisible(true) to be the very last line. 
//Sometimes with Mac, the components won't appear until you resize the window

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("dude.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
			
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null); // When using set bounds
		frame.setVisible(true);	 
		frame.add(label);
		frame.pack(); //Pack set size of label and frame automaticaly
	}
}

//Java Panels********************************************************************************************************************************************************
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("thumbsup.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
		//label.setBounds(100, 100, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);	
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}

//Java Buttons****************************************************************************************************************************************************

public class Main{

	public static void main(String[] args) {

		// JButton = a button that performs an action when clicked on
			
		new MyFrame();

	}
}
//**************************************************
import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("point.png");
		ImageIcon icon2 = new ImageIcon("face.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I'm a button!");
		
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("poo");
			button.setEnabled(false);
			label.setVisible(true);
		}	
	}
}

//Java Border Layout*************************************************************************************************************************************************
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main{

	public static void main(String[] args) {

		// Layout Manager = Defines the natural layout for components within a container
		
		// 3 common managers
		
		// BorderLayout = 	A BorderLayout places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER. 
		//					All extra space is placed in the center area.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel5.setLayout(new BorderLayout());
				
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(150,100));
		panel3.setPreferredSize(new Dimension(150,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//------------- sub panels --------------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout());
				
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
	
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		//------------- sub panels --------------------
	
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
	}
}

//Java FlowLayout*************************************************************************************************************************************************
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main{

	public static void main(String[] args) {

		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
	}
}
//Java GridLayout******************************************************************************************************************************************************
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main{

	public static void main(String[] args) {

		// Layout Manager = Defines the natural layout for components within a container
		
		// GridLayout = 	places components in a grid of cells. 
		//					Each component takes all the available space within its cell, 
		//					and each cell is the same size. 

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,0,0));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);

	}
}
//Java LayerdPane******************************************************************************************************************************************************