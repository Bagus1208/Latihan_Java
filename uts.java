import java.util.Scanner;

public class uts {
    public static void main(String [] arg) {
        int menit = 0;
        int hari = 0;
        int tahun = 0;
        int sisa = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Program Konversi Menit ke Hari dan Tahun");
        System.out.print("\nInput jumlah menit : "); menit = s.nextInt();
        
        hari = menit/1440;
        tahun = hari/365;
        hari -= (365*(tahun));  
        
        
        //System.out.println(sisa + " " + hari); 
        
        System.out.println(menit + " menit = " + tahun + " tahun " + hari + " hari");
        //System.out.println(menit + " menit = " + tahun " tahun " + hari " hari");
    }
}