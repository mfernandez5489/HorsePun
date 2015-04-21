package pun;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JApplet;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.PanelUI;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

public class pun<DrawPanel> extends  Applet 
{
	
	Image horsetrace;
	DrawPanel drawPanel;
	int icon=1; 
	int x = 0;
	int y = 0;
	int width = 20;
	int height = 20;
	public void init()
	{
		 JButton button1 = new JButton(new ImageIcon("bear.png"));
		 ImageIcon icon1 = new ImageIcon("bear.png");
		 button1.setIcon((Icon) icon1);
	 		add(button1);
		 
		 JButton button2 = new JButton(new ImageIcon("stingray.png"));
		 ImageIcon icon2 = new ImageIcon("stingray.png");
		 	button2.setIcon((Icon) icon2);
		 		add(button2);
		 		
		 		
		 JButton button3 = new JButton(new ImageIcon("dinosoar.png"));
		 ImageIcon icon3 = new ImageIcon("dinosoar.png");
		 button1.setIcon((Icon) icon1);
		 		add(button3);
		 		
		 		
		 JButton button4 = new JButton(new ImageIcon("hippo.png"));
		 ImageIcon icon4 = new ImageIcon("hippo.png");
		 button1.setIcon((Icon) icon1);
		 		add(button4);
		 			
		 JButton button5 = new JButton(new ImageIcon("jellyfish.png"));
		 ImageIcon icon5 = new ImageIcon("jellyfish.png");
		 button1.setIcon((Icon) icon1);
		 add(button5);
		 
		 JButton button6 = new JButton(new ImageIcon("jellyfish2.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon6 = new ImageIcon("jellyfish2.png");
		 add(button6);
		 
		 JButton button7 = new JButton(new ImageIcon("koala.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon7 = new ImageIcon("koala.png");
		 add(button7);
		 
		 JButton button8 = new JButton(new ImageIcon("nahrwhal.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon8 = new ImageIcon("nahrwhal.png");
		 add(button8);
		 
		 JButton button9 = new JButton(new ImageIcon("penguin.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon9 = new ImageIcon("penguin.png");
		 add(button9);
		 
		 JButton button10 = new JButton(new ImageIcon("penguin2.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon10 = new ImageIcon("penguin2.png");
		 add(button10);
		 
		 JButton button11 = new JButton(new ImageIcon("pig.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon11 = new ImageIcon("pig.png");
		 add(button11);
		 
		 JButton button12 = new JButton(new ImageIcon("puma.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon12 = new ImageIcon("puma.png");
		 add(button12);
		 
		 JButton button13 = new JButton(new ImageIcon("shark.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon13 = new ImageIcon("shark.png");
		 add(button13);
		 
		 JButton button14 = new JButton(new ImageIcon("spongs.png"));
		 button1.setIcon((Icon) icon1);
		 ImageIcon icon14 = new ImageIcon("spongs.png");
		 add(button14);
		 
		 
		
		  try {                
	          horsetrace = ImageIO.read(new File("horsetraced.png"));
	          
	       } catch (IOException ex1) {
	            // handle exception...
	    	   System.out.println("You got an error" + ex1);
	       }
			  }
		 
	
		// TODO Auto-generated method stub
		public void paint(Graphics g)
		{
			//g.drawImage(horsetrace, 0,0, this);
			
			int width = horsetrace.getWidth(this);
			int height = horsetrace.getHeight(this);
			
			g.drawImage(horsetrace, 0,0, width/2,height/2, this);
			//g.drawImage(horsetrace, 0, 0, null);
		

		}
	

}

		
		//if (x <= 0 - width) {
			//if(imgn==1){
		//		imgn=0;
	//		}
	//		x = (int) super.getWidth() - 5;
	//	} else if (x >= (int) super.getWidth() + width) {
	//		x = 0 + 5;
	//		if(imgn==1){
		//		imgn=0;
		//	}
			
	//	} else if (y <= 0 - height) {
	//		y = (int) super.getHeight();
			
	//	} else if (y >= (int) super.getHeight() + height) {
	//		y = height;
	//	}

	//	BufferedImage img = null;
	//	try {
	//		if(imgn==1){
	//			img = ImageIO.read(new File("res/horsetrace.png"));
	//		}
	//	} catch (IOException e) {
//			e.printStackTrace();
	//	}
		  
//		g.drawImage(img, 0, 0, super.getWidth(), super.getHeight(), null);
//	}
//	BufferedImage img = null;
//	{
//		try {
//		img = ImageIO.read(new File("res/horsetrace.jpg"));
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	}
//		public void Pain() {
//			setPreferredSize(new Dimension(600, 800));
	//		setEnabled(true);
	//		setVisible(true);
	
		

	
	

