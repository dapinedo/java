

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adehkhoda
 */  
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyIO {
    
    private MyIO()
    {
        
    }
    
     public static int getInt(String s)
    {
        boolean ok = false;
        String strNum="";
        int n1= 0;
        
        while( ! ok)
        {
            try{
                strNum=JOptionPane.showInputDialog(s);
                n1 = Integer.parseInt(strNum);
                ok = true;
            }catch (Exception ex)
            {
              JOptionPane.showMessageDialog(null,strNum+" it is not integer try again" ); 
            }
            
            
        }
        
        
        
        return n1;
    }
    public static void display(String s, Color bc, Color fc , int size)
    {
       Font f = new Font("times new roman",
       Font.BOLD+Font.ITALIC,size);
       
       JTextArea jt = new JTextArea(15,20);
       jt.setBackground(bc);
       jt.setForeground(fc);
       jt.setFont(f);
       jt.setText(s);
       
       JScrollPane sr = new JScrollPane(jt);
       JOptionPane.showMessageDialog(null,sr);
       
       
   }

   public static void display(String s)
   {
       Font f = new Font("times new roman",
       Font.BOLD+Font.ITALIC,38);
       
       JTextArea jt = new JTextArea(15,20);
       jt.setBackground(Color.BLACK);
       jt.setForeground(Color.WHITE);
       jt.setFont(f);
       jt.setText(s);
       
       JScrollPane sr = new JScrollPane(jt);
       JOptionPane.showMessageDialog(null,sr);
       
       
   }






}

    
    
    

