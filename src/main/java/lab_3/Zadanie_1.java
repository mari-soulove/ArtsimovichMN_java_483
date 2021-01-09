
package lab_3;

/**
 *
 * @author Marina
 */
import java.util.Scanner;
public class Zadanie_1 {
     public static void main(String[] args)  {
  Scanner sc = new Scanner(System.in);
      System.out.println("Введите число n:");
         int rez=1, n= sc.nextInt();
         double a;
  sc.close();
for (int i = 0; i< n; i++) {
    System.out.println(rez *= 2);
}  
/**if (i<0)
    a=1/rez;
System.out.println(rez *= 2);*/
for (int i = 0; i> n; i--) {
    rez *= 2;
    a= 1.0/rez;
    System.out.println(a);
}  
}
}
