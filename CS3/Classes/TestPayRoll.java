import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestPayRoll
{
	
	public static void main(String [] args)
	{
		Programmer pg = new Programmer();
		Manager mg = new Manager();
		
		System.out.println("Programmers gets:"+PayRoll.computeSal(pg));
		System.out.println("Manager gets:"+PayRoll.computeSal(mg));
		
		
	}
	
	
}
interface Employee
{
	public double getSal();
	public double getBonus();
}
class Programmer implements Employee
{
	private double sal=60000.0;
	private double bonus=10000;
	
	
	
public double getSal()
{
	return sal;
}

public double getBonus()
{
	return bonus;
}	

}
class Manager implements Employee
{
	private double sal=40000.0;
	//private double bonus=10000;
	
	
	
public double getSal()
{
	return sal;
}

public double getBonus()
{
	return 0;
}	

}

class PayRoll
{
	
	public static double computeSal(Employee  e)
	{
	/*	double m = 0.0;
		if(e instanceof Programmer)
		   m = ((Programmer)e).getBonus();	
		*/
		return e.getSal()+e.getBonus();
		
		
	}
	
	
	
	
}





