/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adehkhoda
 */
public class PairDice {
  private Die d1;
  private Die d2;
  
 public PairDice()
 {
   d1 = new Die();
   d2 = new Die();
 }
 public PairDice(Die d1, Die d2)
 {
     this.d1 = d1; this.d2 = d2;
 }
 
 public int letComputerRollD1()
 {
    d1.rollDie();
    return d1.getFace();
 }
 public int letMeRollD2()
 {
   d2.rollDie();
   return d2.getFace();
 }
 public int getSumOfD1AndD2()
 {
  return   d1.rollDie().getFace() + d2.rollDie().getFace();
 //    d2.rollDie();
   //  return 0; //d1.getFace()+ d2.getFace()
     
 }
 
 
 public String toString()
 {
     return "d1 face is "+d1.getFace()+"\n"
            +"d1 Color is "+d1.getColor()+"\n"
            + "d2 face is "+d2.getFace()+"\n"
            +"d2 Color is "+d2.getColor()+"\n";
 }
 
}
