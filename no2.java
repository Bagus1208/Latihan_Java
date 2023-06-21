import java.util.Scanner;
public class no2{
    public static void main(String[] args){
     Scanner scan = new Scanner (System.in);
     
     String nama_pembeli, kue = "";
     int harga = 0;
     int kode, jmlh_beli, total_harga;
     
     System.out.println("Masukkan Nama Pembeli =");
     nama_pembeli = scan.nextLine();
     System.out.println("Masukkan Kode Barang (1).TART, 2).BOLU, 3).CAKE, pilih?=");
     kode = scan.nextInt();
     if (kode==1){
         kue = "TART";
         harga=200000;
     } else if (kode==2){
         kue = "BOLU";
         harga=100000;
     } else if (kode==3){
         kue = "Cake";
         harga=250000;
     }
     
     System.out.println("Masukkan Jumlah beli nya =");
     jmlh_beli = scan.nextInt();
     total_harga=harga*jmlh_beli;
     System.out.println("\nTOKO KUE : SEGAR MANIS BU JUJU");
     System.out.println("========================================================");
     System.out.println("\nPembeli : " +nama_pembeli);
     System.out.println("\nNama kue : " +kue);
     System.out.println("\nHarga Kue : " +harga);
     System.out.println("\nJumlah beli : " +jmlh_beli);
     System.out.println("========================================================");
     System.out.println("Total Harga = " +total_harga);
    }
}