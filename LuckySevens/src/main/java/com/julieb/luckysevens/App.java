/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.luckysevens;
import com.julieb.luckysevens.Objects.Dice;
import com.julieb.luckysevens.UI.UI;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julie
 */
public class App {
    public static void main(String[] args){
       UI ui = new UI();
       Scanner input = new Scanner(System.in);
       
       ui.startPrompt();
       double money = input.nextDouble();
       
       Dice dice1=new Dice();
       Dice dice2=new Dice();
       
       //tracking variables 
       int totalRolls=0;
       double maxMoney=0;
       int rollsAtMax=0;
       
       
       ///Start loop for rolling dice 
       while (money > 0){
           //Start thread for dice
           dice1.start();
           dice2.start();
           
          
           
           try {
               dice1.join();
               dice2.join();
           } catch (InterruptedException ex) {
               Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           totalRolls++;
           //win or lose
           if (dice1.getValue() == 7 && dice1.getValue() == 7){
               money += 4;
           }
           else{
               money -= 1;
           }
           
           
           
           //Find max amount of money and rolls at max
           if (money>maxMoney){
               maxMoney = money;
               rollsAtMax = totalRolls;
           }    
       }
       
       ui.endPrompt(totalRolls, maxMoney,rollsAtMax);
    
    
    
    
    }
}
