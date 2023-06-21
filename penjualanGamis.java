import java.util.Scanner;
import java.text.DecimalFormat;

public class penjualanGamis{
    public static void main(String [] args) {
        
        
        
        Scanner s = new Scanner(System.in);
        
        double [] harga = new double[10];
        String [] kodeBarang = new String[10];
        String nama;
        int pesanan = 0;
        double total = 0, untung = 0, pendapatanBersih = 0;
        
        System.out.println("---------------------------------------------");
        System.out.println("    == Data Pemesanan Gamis/Sarimbit ==");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.print("Masukkan nama penjaga       : "); 
        nama = s.nextLine();
        System.out.print("Masukkan banyaknya Pesanan  : ");
        pesanan = s.nextInt();
        
        for(int i = 0; i < pesanan; i++) {
            System.out.print("Pesanan ke " + (i+1) + "                : Rp. ");
            harga[i] = s.nextDouble();
            System.out.print("Kode Barang                 : ");
            kodeBarang[i] = s.next();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        for(int j = 0; j < pesanan; j++){
            total += harga[j];
        }
        
        untung = 0.1*(total);
        pendapatanBersih = total - untung;
        
        System.out.println(" Hasil Total Pendapatan     : Rp. " + total);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Keuntungan " + pesanan + " Barang        : Rp. " + untung);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Pendapatan Bersih          : Rp. " + pendapatanBersih);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
}
