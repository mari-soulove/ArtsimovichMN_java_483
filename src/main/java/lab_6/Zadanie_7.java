package lab_6;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class Zadanie_7 {
    public static void ch_string (String[] array){
        if (array [3]==array [4]){
            array [0]+=array [1];
        } else {
            array [0]+=array [2];
    } }
 public static void main(String[] args) {
String[] myArrayString = new String[5];
      Scanner sc=new Scanner(System.in); 
     for (int i=0; i<myArrayString.length; i++){
        myArrayString[i]=sc.nextLine();
     }
      System.out.print ("Массив строк\n");
      for (int i=0; i<myArrayString.length; i++)
        System.out.print (myArrayString[i]+" ");
        ch_string(myArrayString);
         System.out.println();
      System.out.print ("Результат слияния строк\n");
       for (int i=0; i<myArrayString.length; i++){
         System.out.print (myArrayString[i]+" ");  
     } } }
     
  
  /*      if (s4.equals(s5)){
System.out.print("\nРезультат сложения строк \""+s1+"\" и "+"\""+s2+"\": ");
 s1+=" "+s2;
 } else {
 System.out.print("\nРезультат сложения строк \""+s1+"\" и "+"\""+s2+"\": ");
 s1+=" "+s3;
 }
 return s1;
 }*/