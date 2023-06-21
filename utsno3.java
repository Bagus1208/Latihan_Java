import java.util.Scanner;

public class utsno3 {
    public static void main(String [] arg) {
       Scanner s = new Scanner(System.in);
       
       int angka = 0;
       
       System.out.print("Input sebuah angka : "); angka = s.nextInt();
       
       if (angka % 5 != 0) {
           if (angka % 4 != 0) {
               System.out.println(angka + " tidak dapat dibagi oleh angka 4 dan 5");
           }
           else {
               System.out.println(angka + " dapat dibagi salah satu dari 4 atau 5, tetapi tidak keduanya");
            } 
       }
       
       else if (angka % 4 != 0) {
           if(angka % 5 != 0) {
               System.out.println(angka + " tidak dapat dibagi oleh angka 4 dan 5");
           } 
           else{
               System.out.println(angka + " dapat dibagi oleh salah satu dari 4 atau 5 tetapi tidak keduanya");
           }
       }
       else {
           System.out.println(angka + " dapat dibagi oleh angka 4 dan 5");
       }
    }
}