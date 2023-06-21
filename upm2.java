import java.util.Scanner;

public class upm2 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int angka = 0, i = 1;
        
        System.out.print("Input sebuah angka : ");
        angka = s.nextInt();
        
        System.out.println("\nAngka yang dapat membagi 30 tanpa sisa adalah : ");
        do {
            if(angka % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= angka);
    }
}