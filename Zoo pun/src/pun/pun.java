package pun;
import java.applet.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.PanelUI;

import java.awt.BorderLayout;
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
	private JButton reg;
	private JButton custom;
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
			
			int width = horsetrace.getWidth(this);
			int height = horsetrace.getHeight(this);
			
			g.drawImage(horsetrace, 0,0, width/2,height/2, this);
			//g.drawImage(horsetrace, 0, 0, null);
		}
		
		public static class Class1 {

			private JFrame frmClass;

			/**
			 * Launch the application.
			 */
			public static void NewScreen() {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Class1 window = new Class1();
							window.frmClass.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			/**
			 * Create the application.
			 */
			public Class1() {
				initialize();
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				frmClass = new JFrame();
				frmClass.setTitle("Class1");
				frmClass.setBounds(100, 100, 450, 300);
				frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmClass.getContentPane().setLayout(null);
				
				JButton btnBear = new JButton("Bear");
				btnBear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnBear.setBounds(48, 39, 89, 23);
				frmClass.getContentPane().add(btnBear);
			}
		}

			
			

		
	
		//public static void main (String[] args){
			
		//	JFrame frame = new JFrame("Test");
			//frame.setVisible(true);
			//frame.setSize(200,200);
			//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	//	reg = new JButton("Bear");
	//	addJButton;
		
		
			
			
			
			
			
		
		
		
		
		
		
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

	
	

