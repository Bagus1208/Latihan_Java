import java.util.Scanner;

public class upm3 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int angka = 0, genap = 0, ganjil = 0;
        
        System.out.print("Input batasan angka : ");
        angka = s.nextInt();
        
        System.out.println("\nAngka-angka yang merupakan kelipatan 3 atau 5 adalah :");
        
        for(int i = 1; i < angka; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                
                if(i % 2 == 0) {
                    genap += 1;
                }
                else {
                    ganjil += 1;
                }
            }
        }
        
        System.out.println("\n\nJumlah angka genap : " + genap);
        System.out.println("Jumlah angka ganjil : " + ganjil);
    }
}