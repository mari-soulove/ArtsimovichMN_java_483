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

public class Zadanie_3 {
  public static void main (String[] args) {
       int[] a=new int[20];
        double avarage;
        int sum = 0;
        Random rnd=new Random();
        for (int i=0; i < a.length; i++) {
            a[i] = rnd.nextInt(100)+1;
            System.out.print(a[i] + " ");
            sum +=a[i];
        }
        System.out.println("\nСумма всех значений = " + sum);
        System.out.println("Длина массива = " + a.length);
        System.out.println("Среднее значение = " + sum /(float)a.length);
    } }
