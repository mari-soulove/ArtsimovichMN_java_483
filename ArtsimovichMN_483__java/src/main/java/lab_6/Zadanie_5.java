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
public class Zadanie_5 {
         public static void main (String[] args) {
       int[][] a=new int[3][5];
        Random rnd=new Random();
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 5; j++) {
          a[i][j] = rnd.nextInt(10);
            System.out.print(a[i][j] + " "); 
  }
            System.out.println();
  } }
}
