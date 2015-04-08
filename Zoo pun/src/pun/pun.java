package pun;
import java.applet.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

public class pun<DrawPanel> extends Applet
{
	
	JFrame frame;
	Image horsetrace;
	DrawPanel drawPanel;
	int imgn=1;
	int x = 0;
	int y = 0;
	int width = 0;
	int height = 0;
	public void init()
	{
		  try {                
	          horsetrace = ImageIO.read(new File("horsetraced.png"));
	          System.out.println("got it bro");
	       } catch (IOException ex) {
	            // handle exception...
	    	   System.out.println("You got an error" + ex);
	       }
		// TODO Auto-generated method stub
		//g.setColor(Color.BLUE);
		//g.fillRect(500,500,500,500);
		//horsetrace=getImage(getDocumentBase(), "zoo.jpg");
	}
		
		public void paint(Graphics g)
		{
			//g.drawImage(horsetrace, 0,0, this);
			
			//int width = horsetrace.getWidth(this);
			//int height = horsetrace.getHeight(this);
			
			//g.drawImage(horsetrace, 50,50, width/2,height/2, this);
			g.drawImage(horsetrace, 0, 0, null);
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
	
		}
