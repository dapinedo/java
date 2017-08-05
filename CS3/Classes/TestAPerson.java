import java.awt.*;
import java.awt.HeadlessException;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestAPerson
{
	public static void main(String [] args)
	{
		
		APerson p2 =
		new APerson("Jack","Smith","234-45-6789",45,"Jack@haven");
		//System.out.println(p2);
		
		APerson p4 =
		new APerson("Marry","Smith","234-45-6789",45,"Marry@haven");
		//System.out.println(p2);
		p2.marriedTo(p4);
		String out = "";
		out+= p4.toString()+ p2.toString();
		MyIO.display(out);
		
		
		Student st = new Student("Susan","JSmith","222-45-6789",45,"Joe@haven",3.2,"7777");
		//
		//System.out.println(p2);
		
		p2.marriedTo(st);
		MyIO.display(st.toString());
		
		
		/*
		APerson p3 = st;
		if(p3 instanceof Student)
		{
			
			System.out.println("======>"+((Student)p3).getGpa());
		}
		
		
		
		
		
		System.out.println(st.toString());
		*/
	}
	
	
}
//////////////////////////

 class APerson implements Driver
{
	private String fName;
	private String lName;
	private String sSN;
	private int age;
	private String eMail;
	private APerson hw;
	
	public APerson(){
		
	}
	public APerson(String fN,String lN, String s,int a,String e)
	{
		fName = fN; lName=lN;sSN=s;age=a; eMail = e;
		
	}
	public void setFName(String fN)
	{
		fName=fN;
	}
	public String getFName()
	{
		return fName;
	}
	
	public void setLName(String fN)
	{
		lName=fN;
	}
	public String getLName()
	{
		return lName;
	}
	public void setSSN(String fN)
	{
		sSN=fN;
	}
	public String getSSN()
	{
		return sSN;
	}
	public void setEmail(String fN)
	{
		eMail=fN;
	}
	public String getEmail()
	{
		return eMail;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	public int getAge()
	{
		return age;
	}
	
	public void marriedTo(APerson p)
	{
		if (this.isMarried()|| p.isMarried())
		{
		System.out.println("You are already married....");	
		}
		else
		{
		   this.hw = p;
           p.hw = this;		   
			
		}
		
	}
	
	
	
	public String howAmIDriving()
	{
		return "";
	}
	public boolean isMarried()
	{
		return hw!=null;
		
	}
	
	
	
		
	public String toString()
	{
		return "First Name:"+fName+"\n"
		      +"Last  Name:"+lName+"\n"
			  +"Age="+age+"\n"
			  +"Email:"+eMail+"\n"
		      +"Marital Status:"+((isMarried())? "M and Spouse:"+hw.getFName():"Available")+"\n"
			  +"Status of Driving:"+((isMarried())? "Drives Carefully":"Drives recklesly")+"\n";
	}
	
	
}


class Student extends APerson
{
	private String iD;
	private double gpa;
	
	
	public Student()
	{
		
	}
	public Student
	(String fN,String lN, String s,int a,String e,double g,String iD)
	{
		super(fN,lN,s,a,e);
		gpa=g; this.iD = iD;
		
	}
	
	public void setID(String fN)
	{
		iD=fN;
	}
	public String getID()
	{
		return iD;
	}
	public void setGpa(double g)
	{
		gpa=g;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public String toString()
	{
		return super.toString()+"ID:"+iD+"\n"+"GPA:"+gpa+"\n";
		
	}
	
	
	
	
}

////////////////////////

interface Driver{
	
	public String howAmIDriving();
	
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adehkhoda
 */
class MyIO {
     public static int getInt(String s)
    {
        String strNum=JOptionPane.showInputDialog(s);
        int n1 = Integer.parseInt(strNum);
        return n1;
    }
public static void display(String s, Color bc, Color fc)
   {
       Font f = new Font("times new roman",
       Font.BOLD+Font.ITALIC,38);
       
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









