/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test1;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author DD
 */
public class Test {
    public static void main(String[] args){
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.print("hello ");
        System.out.flush();
        System.out.print("hello2");
        //String next=scan.nextLine();
        //System.out.println("your input is "+next);
        
        String.format("%f", 16.1);
        */
        DecimalFormat myFormatter = new DecimalFormat("###,###");
       // System.out.println(myFormatter.format(11000));
        StringBuilder myStr = new StringBuilder();
        for(int i=1;i<7;i++){
            myStr.append(String.format("%-12d", i));
        }
        System.out.println(myStr);
        myStr=new StringBuilder();
        for(int i=1;i<7;i++)
            myStr.append(String.format("%s %2d%-2s",myFormatter.format(10001),16,"%"));
        System.out.println(myStr);
        
        
  
    }
}
