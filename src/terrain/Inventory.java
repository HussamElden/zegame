/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrain;

import project.s.classes.*;


/**
 *
 * @author Ahmed
 */
public class Inventory {
     public static PriceLists price=new PriceLists();
  //    PriceLists p=new PriceLists();
    private static int Food = 200, Wood = 230, Metal = 0, Gold = 200;
    private static int maxStorage;
    private static int currentStorage;

    public static int getFood() {
        return Food;
    }

    public static void setFood(int Food) {
        Inventory.Food = Food;
    }

    public static int getWood() {
        return Wood;
    }

    public static void setWood(int Wood) {
        Inventory.Wood = Wood;
    }

    public static int getMetal() {
        return Metal;
    }

    public static void setMetal(int Metal) {
        Inventory.Metal = Metal;
    }

    public static int getGold() {
        return Gold;
    }

    public static void setGold(int Gold) {
        Inventory.Gold = Gold;
    }

    public static int getMaxStorage() {
        return maxStorage;
    }

    public static void setMaxStorage(int maxStorage) {
        Inventory.maxStorage = maxStorage;
    }

    public static int getCurrentStorage() {
        return currentStorage;
    }

    public static void setCurrentStorage(int currentStorage) {
        Inventory.currentStorage = currentStorage;
    }
    
    public Inventory() {

    }

    
//    public void setFood(int FoodNum){
//    if (Food>=0)
//        Food=FoodNum;
//}
//   public int getFood(){
//       return Food;
//   }
//   public void setWood(int WoodNum){
//    if (Wood>=0)
//        Wood=WoodNum;
//}
//   public int getWood(){
//       return Wood;
//   }
//   public void setMetal(int MetalNum){
//    if (Metal>=0)
//        Metal=MetalNum;
//}
//   public int getMetal(){
//       return Metal;
//   }
//   public void setGold(int GoldNum){
//    if (Gold>=0)
//        Gold=GoldNum;
//}
//   public int getGold(){
//       return Gold;
//   }
//   public void setmaxStorage(int Maxstrg){
//    if (maxStorage>=0)
//        maxStorage=Maxstrg;
//}
//   public int getmaxStorage(){
//       return maxStorage;
//   }
//   public void setcurrentStorage(int crntstrg){
//    if (currentStorage>=0)
//        currentStorage=crntstrg;
//}
//   public int getcurrentStorage(){
//       return currentStorage;
//   }
   public void Decfood(int x){
   Food=Food-x;
   }
   public void Decwood(int x){
   Wood=Wood-x;
   }
   public void Decgold(int x){
   Gold=Gold-x;
   }
  public void Decmetal(int x){
   Food=Food-x;
   }
   
    int Max (){
        return maxStorage;
    }

}
