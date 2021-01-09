/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6;

import java.util.Random;

/**
 *
 * @author Marina
 */
public class Zadanie_4 {
      public static void main (String[] args) {
       int[] a=new int[5];
        int c=0;
               int n = 0;
        Random rnd=new Random();
         
            
        for (int i=0; i < 5; i++) {
          a[i] = rnd.nextInt(100)+1;
            System.out.print(a[i] + " "); 
            if (a[i] % 2 == 0)
        {
          c +=a[i];
        }
        else
        {
          n +=a[i];
        }
      }
    
    System.out.println("\nСумма нечетных чисел " + n);
     System.out.println("Сумма четных чисел " + c);
  } }

           