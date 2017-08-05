
import java.awt.Color;


//import javafx.scene.paint.Color;


/**
 *
 * @author adehkhoda
 */
public class DiceDemo {
    
 public static boolean isMatch(Die [] x, Die [] y)
 {
     boolean ok=true;
     for(int i = 0; i < x.length; i++)
     {
         ok = x[i].getFace()==y[i].getFace()&&
                 x[i].getColor().equals(y[i].getColor());
         if(!ok) return false;
     }
     return true;
     
 }
  public static int sumOfFace(Die [] x) 
  {
      int sum = 0;
      for(Die a : x)
          sum+=a.getFace();
      
    return sum;  
      
  }
    
 public static void main(String [] args)
 {
  String out1="State of ard1\n";  String out2="State of ard2\n";
  Die  []   ard1   = new Die[100];
  Die  []   ard2   = new Die[100];   
  for(int i=0; i < ard1.length; i++)
  {
    ard1[i] = new Die();  
    ard2[i] = new Die();
    ard1[i].rollDie();
    ard2[i].rollDie();
    out1+=ard1[i].toString();
    out2+=ard2[i].toString();
  }
  out1+="Total Face are:"+sumOfFace(ard1);
  out2+="Total Face are:"+sumOfFace(ard2);
  System.out.println(" both arrays are identical: "+isMatch(ard1,ard2));
  
  
  MyIO.display(out1);
  MyIO.display(out2);  
     
     
     
   /*  
     PairDice pr= new PairDice();
     
     int sumd = pr.getSumOfD1AndD2();
     switch(sumd)
     {
         case 7 : case 11 : MyIO.display("you won in first throw");break;
         case 2: case 3: case 12 :  MyIO.display("you lost in first throw");break;   
        default: int point = sumd;
                 do{
                     sumd = pr.getSumOfD1AndD2();
                     
                 }while(point!= sumd && sumd!= 7 );
                 if (sumd == 7)
                     MyIO.display("you lost with points");
                 else
                     MyIO.display("you won with points");
     
     }
     
     
     
     
     String out = "Play with computer\n";
     
     
     out+= "Computer gets:"+pr.letComputerRollD1();
     out+= "=========I get:"+ pr.letMeRollD2()+"\n";
     out+= pr.toString();
     
     MyIO.display(out,Color.GREEN,Color.BLUE,30);
     
     
     
    // pr.rollD1();
    
     out+= pr.toString();
     
     MyIO.display(out);
     
    */ 
     
     
   
 }
 public static void Sample2()
 {
    Die   []  ard  = new Die[5];
     String out = "List of throw Dice\n";
   for(int i = 0 ; i < ard.length; i++)
   {
       ard[i]= new Die();
       ard[i].rollDie();
       ard[i].setColor("Red"+(i+1));
       out+=ard[i].toString();
   }
     
     MyIO.display(out,Color.GREEN,Color.BLACK,32);
      
 }
 
 
 
 public static void Sample()
 {
     String out ="Result of throwing die 1000 times\n";
     int n1,n2,n3,n4,n5,n6;
     n1=n2=n3=n4=n5=n6= 0;
     
     Die d1 = new Die("Red");
     d1.rollDie();
     Die d2 = new Die("Blue");
     d2.rollDie();
     System.out.println("Face of d1 now m is:"+d1.getFace());
     
     System.out.println("Face of d2 now is:"+d2.getFace());
    
     if(d1.getFace() > d2.getFace())
     {
         System.out.println("d1 > d2");
         
     }else if (d1.getFace() < d2.getFace())
     {
         System.out.println("d1 < d2");
     }
     else 
     { System.out.println("d1 == d2");
         
     }
     
     for(int i = 0 ; i < 1000; i++)
     {
         // throw a die now
         d1.rollDie();
         
         int f = d1.getFace();
         
         switch (f)
         {
             case 1 : n1++; break; 
             case 2 : n2++; break; 
             case 3 : n3++; break; 
             case 4 : n4++; break; 
             case 5 : n5++; break;     
             case 6 : n6++; break;
             default : ;
                 
         }
       
     }
     
     
     out+="Occureces of 1's are:"+n1+"\n";
     out+="Occureces of 2's are:"+n2+"\n";
     out+="Occureces of 3's are:"+n3+"\n";
     out+="Occureces of 4's are:"+n4+"\n";
     out+="Occureces of 5's are:"+n5+"\n";
     out+="Occureces of 6's are:"+n6+"\n";
     MyIO.display(out);
     MyIO.display(out,Color.YELLOW,Color.BLUE,30);
      
     
     
 }
 }
 

