/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

/**
 *
 * @author Marina
 */
public class Zadanie_2 {
    public static int fac(int n){

int result = 1;
for (int i = 1; i <= n; i++) {
result *= i;
}
System.out.println(result);
return(result);
}
public static void main (String[] args) {
fac(6);
}
}