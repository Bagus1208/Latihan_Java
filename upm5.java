import java.util.Scanner;

public class upm5 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int [] angka = new int[5];
        
        for(int i = 0; i < angka.length; i++) {
            System.out.print("Input bilangan ke-" + (i+1) + " : ");
            angka[i] = s.nextInt();
        }
        
        System.out.print("\nData yang diinput adalah : " );
        
        for(int j = 0; j < angka.length; j++) {
            System.out.print(angka[j] + " ");
        }
    }
}