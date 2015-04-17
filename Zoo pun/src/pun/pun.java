package pun;
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
		 JButton button1 = new JButton();
		 button1.setLabel("Bear");
		 ImageIcon icon = new ImageIcon("bear.png");
		 add(button1);
		 JButton button2 = new JButton();
		 button2.setLabel("Penguin");
		 ImageIcon icon1 = new ImageIcon("bear.png");
		 add(button2);
		 JButton button3 = new JButton();
		 button3.setLabel("Sponge");
		 ImageIcon icon2 = new ImageIcon("bear.png");
		 add(button3);
		 JButton button4 = new JButton();
		 button4.setLabel("Stingray");
		 ImageIcon icon3 = new ImageIcon("bear.png");
		 add(button4);
		 JButton button5 = new JButton();
		 button5.setLabel("Jellyfish");
		 ImageIcon icon4 = new ImageIcon("bear.png");
		 add(button5);
		 
		
		  try {                
	          horsetrace = ImageIO.read(new File("horsetraced.png"));
	          
	       } catch (IOException ex) {
	            // handle exception...
	    	   System.out.println("You got an error" + ex);
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
	
		

	
	

