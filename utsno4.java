import java.util.Scanner;

public class utsno4 {
    public static void main(String []arg) {
        Scanner s = new Scanner(System.in);
        
        int status = 0;
        long gaji = 0;
        double pajak = 0;
        
        System.out.println("Status Kategori" + "\n1. Tidak kawin" + "\n2. kawin");
        System.out.print("Input status kategori : "); status = s.nextInt();
        System.out.print("Masukan pendapatan Anda dalam 1 tahun : ");
        gaji = s.nextLong();
        
            if (status == 1) {
                if (gaji < 70000000) {
                    pajak = 0.05 * gaji;
                }
                else if (gaji <= 270000000) {
                    pajak = 0.15 * gaji;
                }
                else if (gaji >270000000) {
                    pajak = 0.25 * gaji;
                }  
            }
            else if (status == 2) {
                if (gaji < 50000000) {
                    pajak = 0.05 * gaji;
                }
                else if (gaji <= 250000000) {
                    pajak = 0.15 * gaji;
                }
                else if (gaji >250000000) {
                    pajak = 0.25 * gaji;
                }  
            }
            
        System.out.println("Pajak Anda adalah sebesar : Rp." + pajak);
    }
}