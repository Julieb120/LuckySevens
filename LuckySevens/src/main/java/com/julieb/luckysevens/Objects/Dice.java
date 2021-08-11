/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.luckysevens.Objects;

import java.util.Random;

/**
 *
 * @author julie
 */
public class Dice extends Thread {
    volatile int value;
    
    Random random = new Random();
    
    public void rollDice(){
        this.value =  random.nextInt(7-1)+1;   
    }
    
    public int getValue(){
        return this.value;
    }
    
    @Override
    public void run(){
        System.out.println("Running");
        rollDice();
    }
}
