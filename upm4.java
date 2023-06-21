import java.util.Scanner;

public class upm4 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int baris, kolom;
        
        System.out.print("Input jumlah baris : "); 
        baris = s.nextInt();
        System.out.print("Input jumalh kolom : ");
        kolom = s.nextInt();
        System.out.println();
        
        for(int i = 1; i <= baris; i++) {
            for(int j = 1; j <= kolom; j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        System.out.print("X ");
                    } 
                    else {
                        System.out.print("O ");
                    }
                } else {
                    if(j % 2 == 0) {
                        System.out.print("O ");
                    } 
                    else {
                        System.out.print("X ");
                    }
                }
            }
            System.out.println();
        }
    }
}