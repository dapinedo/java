import java.awt.*;
import java.awt.HeadlessException;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.*;

public class ShowMouse extends JFrame implements MouseListener
{  
   private Container c;
   private JButton b1,b2,b3;
   private Color temp;
   private JTextField x,y;
   
   public ShowMouse()
   {
	  c = getContentPane();
      c.setLayout(new FlowLayout());
      addMouseListener(this);  
	  c.setBackground(Color.ORANGE);
	  x = new JTextField(5);
	  y = new JTextField(5);
	  JLabel xLab = new JLabel("X:");
	  JLabel yLab = new JLabel("Y:");
	  c.add(xLab);
	  c.add(x);
	  c.add(yLab);
	  c.add(y);
	  
	  

   } 
   public void mouseClicked(MouseEvent e)
   {
	   System.out.println("I am in mouseClicked");
	   int xPos = e.getX();
	   int yPos = e.getY();
	   x.setText(""+xPos);
	   y.setText(""+yPos);
   }
   public void mouseReleased(MouseEvent e)
   {
	   System.out.println("I am in mouseReleased");
   }
   public void mousePressed(MouseEvent e)
   {
	   System.out.println("I am in mousePressed");
   }
   public void mouseEntered(MouseEvent e)
   {
	     temp = c.getBackground();
		 
	   c.setBackground(Color.GREEN);
	   System.out.println("I am in mouseEntered");
   }
  public void mouseExited(MouseEvent e)
   {   //c.setBackground(Color.YELLOW);
   
      c.setBackground(temp);
	   System.out.println("I am in mouseExited");
   }
   
	public static void main(String [] args)
	{
		
		ShowMouse win = new ShowMouse();
		win.setSize(300,500);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	   
	   
 }


