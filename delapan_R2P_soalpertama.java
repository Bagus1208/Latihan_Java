/*
Dikerjakan oleh :
1. Idham Basalamah
2. M Fadhil A Fattah
3. Raja Fathir Rakha Putra  

*/

import java.util.Scanner;
public class delapan_R2P_soalpertama{
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Masukkan Jumlah Baris: ");
            int baris = s.nextInt();
            for (int i = 1; i <= baris; i++){
                for (int j = baris; j > i; j--){
                    System.out.print(' ');
                }
                for (int k = 1; k <= i; k++){
                    System.out.print("x");
                    }
                System.out.println();
            }
    }
}