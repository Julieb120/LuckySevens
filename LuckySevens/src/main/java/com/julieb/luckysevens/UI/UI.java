/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.luckysevens.UI;

/**
 *
 * @author julie
 */
public class UI {
    
    public void startPrompt(){
        System.out.println("Ready to play Lucky Sevens \n"
                + "How much money do you want to bet? ");
    }
    
    public void endPrompt(int totalRolls,double maxMoney,int rollsAtMax){
       System.out.printf("You ran out of money after %d \n"
               + "You should have quit after %d rolls when you had $%e ",
               totalRolls,rollsAtMax, maxMoney);
    }
}
