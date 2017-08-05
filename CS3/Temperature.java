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


public class Temperature extends JFrame 
{  
   private Container c;
   private JButton b1;
   private JTextField t1,t2;
   private JTextArea jt;
  

  public Temperature()
   {
	  c = getContentPane();
      c.setLayout(new FlowLayout());
      JLabel cLab = new JLabel("Enter Centigrade:");
	  c.add(cLab);
	  t1 = new JTextField(8);
	  c.add(t1);
	  c.add(new JLabel("Enter Fahrenheit:"));
	  t2 = new JTextField(8);
	  c.add(t2);
	  Handler h = new Handler();
      b1 = new JButton("PushMe");
	  b1.addActionListener(h);
	  c.add(b1);
	  jt = new JTextArea(10,25);
	  c.add(jt);
	  c.setBackground(Color.YELLOW);
	  
	  
	  
	  
	  
	  
	  
	  
	  

   } 
   
   class Handler implements ActionListener
   {
	     public void actionPerformed(ActionEvent e)
	{
	     //JOptionPane.showMessageDialog(null,"That was hard");
		 String strNum = t1.getText();
		 int cc= Integer.parseInt(strNum);
		 
		 double f = 1.8 * cc + 32.0;
		 
		 t2.setText(""+f);
		 
		 String mess = cc + " in cetigrade is:"+f+" in Fahrenheit\n";
		 
		 jt.append(mess);
		 
		 
	   
	}  
   }
   
   
   
    
   
	public static void main(String [] args)
	{
		
	    Temperature win = new Temperature();
		win.setSize(400,600);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	   
	   
 }


