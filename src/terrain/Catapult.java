/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import project.s.classes.PriceLists;

/**
 *
 * @author Ahmed
 */
public class Catapult extends Movables implements  Ibehavior {
    private int Range;
    private Throwable Stone=new Throwable();

JLabel[] lbl = new JLabel[3];
public Catapult(String nation)
    {
                setName("Catapult");
                 Nation = nation;

        lbl[0]=new JLabel(nation+" Catapult");
          
      if(nation.equals("Human Hunters"))
      {
      lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Catapult_HumanHunters.png").getImage().getScaledInstance(99,85 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Catapult_HumanHunters.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
      else
      {
       lbl[1]=new JLabel(new ImageIcon(new ImageIcon("Pics//Catapult_NightElves.png").getImage().getScaledInstance(99,85 ,Image.SCALE_DEFAULT)));
      lbl[2]=new JLabel(new ImageIcon(new ImageIcon("Pics//Catapult_NightElves.png").getImage().getScaledInstance(10,15 ,Image.SCALE_DEFAULT)));
      }
    price.setWood(125);
    price.setGold(80);
     setHealth(70);
     Stone.setDamage(15);
     Stone.setSpeed(1);
     setattackSpeed(0.96);
     
     Range=7;
}
    
  
  
public void setRange (int cataRange)
{
    if (Range > 0)
        Range=cataRange;
}
public int getRange ()
{
    return Range;
}
     
     
     public void Throw(){}
     @Override
     public String move(Point XY){
     return"Catapult is moving";
     }
      @Override
     public String attack(){
     return "Catapult is Attacking";
     };
    @Override
      public String toString() { 
         return "Catapult";
      } 
    }

