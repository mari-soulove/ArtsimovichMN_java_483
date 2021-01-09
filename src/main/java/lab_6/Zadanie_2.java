/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6;
/**
 *
 * @author Marina
 */
public class Zadanie_2 {
    public static void main (String[] args) {
 short temp;
 short[] array = new short[25];
 System.out.print("\nИсходный массив: ");
 for (int i=0;i<25;i++){
 array[i]=(short)Math.round(50*Math.random());
System.out.print(array[i]+", ");
 }
 System.out.print("\nМассив отсортированный: ");
 for(int i=0;i<24;i++){
 for(int j=24;j>i;j--){
 if(array[j-1]>array[j]){
 temp=array[j];
 array[j]=array[j-1];
array[j-1]=temp;
}
} 
System.out.print(array[i]+", ");
} } }