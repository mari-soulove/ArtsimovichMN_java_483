package main.java.lab_5;
 
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class Zadanie_1 {

     public static void main(String[] args)  {
         double a;
        Scanner sc = new Scanner(System.in); {
             System.out.println("Введите целое число от 0 до 9:");  
             a = sc.nextDouble();
             if ((a%1 !=0) || (a>9) || (a<0))
             {
        System.out.println("Вы ввели что-то не то");
             }
             else {
                 var n=(int)a;
             switch (n) {
case 0: System.out.println("Ноль");
break;
case 1: System.out.println("Один");
break;
case 2: System.out.println("Два");
break;
case 3: System.out.println("Три");
break;
case 4: System.out.println("Четыре");
break;
case 5: System.out.println("Пять");
break;
case 6: System.out.println("Шесть");
break;
case 7: System.out.println("Семь");
break;
case 8: System.out.println("Восемь");
break;
case 9: System.out.println("Девять");
 break;
}  }
   
    
     }
     }
}