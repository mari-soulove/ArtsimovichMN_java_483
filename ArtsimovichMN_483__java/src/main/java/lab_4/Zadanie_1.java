package lab_4;
/**
 *
 * @author Marina
 */
import java.math.BigInteger;
import java.util.ArrayList;
public class Zadanie_1 {
     private static ArrayList<BigInteger> numBox = new ArrayList<>(100);
 
    private static void fillBox(final int pow) {
        for (int i = 1; i < 101; i++) {
            numBox.add(new BigInteger(i+"").pow(pow));
        }
    }
 
    private static void printNumsEquFerma(final int pow) {
        BigInteger a, b, c;
        fillBox(pow);
       
        System.out.printf("Ищем числа для уравнения Ферма степени %d%n", pow);
       // if (1<numBox.size()<100 & numBox.size()>2) {
            if (numBox.size()<=2) {
        for (int i = 0; i < numBox.size(); i++) {
            a = numBox.get(i);
            for (int j = i; j < numBox.size(); j++) {
                b = numBox.get(j);
                c = a.add(b);
                if (numBox.contains(c))
                    System.out.printf("%d + %d = %d%n", a, b, c);
                
            }
        } 
        
         //else System.out.printf("Нет натуральных решений"); //numBox.clear();
    }
   else System.out.printf("Нет натуральных решений");     
 }
    public static void main(String[] args) {
        printNumsEquFerma(2);
    }
}
    

