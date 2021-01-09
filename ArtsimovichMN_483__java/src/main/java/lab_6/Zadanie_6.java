package lab_6;

/**
 *
 * @author Marina
 */
public class Zadanie_6 {
    public static short minX(){
        short x=0;
        short[] array = new short[10];
        System.out.print("Исходный массив: ");
        for (int i=0;i<10;i++){
         array[i]=(short)Math.round(50*Math.random());
            System.out.print(array[i]+", ");
        }
        x=array[0];
        for(int i=1;i<10;i++){
            if(x>array[i]){
                x=array[i];
            }
        }
        return x;
        }
      public static short maxX(){
        short x=0;
        short[] array = new short[10];
        System.out.print("Исходный массив: ");
        for (int i=0;i<10;i++){
         array[i]=(short)Math.round(50*Math.random());
            System.out.print(array[i]+", ");
        }
        x=array[0];
        for(int i=1;i<10;i++){
            if(x<array[i]){
                x=array[i];
            }
        }
        return x;  
    }
    public static void sort(){
        short temp;
        short[] array = new short[10];
         System.out.print("\nИсходный массив: ");
         for (int i=0;i<10;i++){
        array[i]=(short)Math.round(50*Math.random());
        System.out.print(array[i]+", ");
        }
        System.out.print("\nМассив отсортированный: ");
        for(int i=0;i<9;i++){
            for(int j=9;j>i;j--){
                if(array[j-1]>array[j]){
                 temp=array[j];
                 array[j]=array[j-1];
                 array[j-1]=temp;
}
 }
 System.out.print(array[i]+", ");
 }
 }
 public static void main(String[] args) {

System.out.println("\nМинимальный элемент: "+minX());
System.out.print("\nМаксимальный элемент: "+maxX());
sort();
 }}
 