import java.util.Scanner;

public class upm1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int angka = 0, i = 1, hasil = 0, sisa = 0;
        
        
        System.out.print("Input sebuah angka : ");
        angka = s.nextInt();
        System.out.println();
        
        while(i <= 10) {
            hasil = angka / i;
            sisa = angka % i;
            System.out.println(angka + " : " + i + " = " + hasil + " sisa " + sisa);
            i++;
        }
    }
}