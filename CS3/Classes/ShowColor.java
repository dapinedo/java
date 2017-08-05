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
public class ShowColor extends JFrame implements ActionListener
{  
   private Container c;
   private JButton b1,b2,b3;
   
   public ShowColor()
   {
	  c = getContentPane();
      c.setLayout(new FlowLayout());

      b1 = new JButton("Red");
	  b1.addActionListener(this);
	  b2 = new JButton("Green");
	  b2.addActionListener(this);
      b3 = new JButton("Blue");
      b3.addActionListener(this);
      c.add(b1); c.add(b2); c.add(b3);

   } 
    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			c.setBackground(Color.RED);
		}else if(e.getSource()==b2)
		{
			c.setBackground(Color.GREEN);
			
		}else if(e.getSource()==b3)
		{
			
			c.setBackground(Color.BLUE);
		}
		else;
		
		//System.out.println("You press b1");
		
	}






   
	public static void main(String [] args)
	{
		
		ShowColor win = new ShowColor();
		win.setSize(300,500);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	   
	   
 }






