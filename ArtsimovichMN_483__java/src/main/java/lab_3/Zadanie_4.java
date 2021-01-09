package lab_3;
/**
 *
 * @author Marina
 */
public class Zadanie_4 {
   public static final Double G=9.8;

//public static double vis(double h){
//double t= Math.sqrt(2*h/G);
//return t;
//}
public static double vrem(double t){
double h= (t*t*G)/2;
return (h);
}
public static void main(String[] args) {
//System.out.println(vis(100));
System.out.println(vrem(4.51));
} 
}
