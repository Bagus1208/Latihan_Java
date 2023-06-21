import java.util.Scanner;

public class Sisfo{
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int pilih = 0, jenis = 0, jumlah = 0;
    String jual = "", loop = "y";
    int [] jumlahBarang = new int[20];
    String [] namaBarang = new String[20];
    
    while(loop.equals("y")) {
        System.out.println("=====================Toko Makmur Jaya=====================\n");
        System.out.println("1. Pembelian barang\n2. Penjualan barang\n3. Info Barang\n4. Keluar Program");
        System.out.print("Masukkan pilihan Anda(angka) : ");
        pilih = s.nextInt();
        
        if (pilih == 1) {
            System.out.print("\nBerapa jenis barang? ");
            jenis = s.nextInt();
            
            for(int i = 0; i < jenis; i++) {
                System.out.print("Masukkan nama barang : ");
                namaBarang[i] = s.next();
                System.out.print("Masukkan jumlah barang : ");
                jumlahBarang[i] = s.nextInt();
                System.out.println();
            }
            loop = "y";
        } else if (pilih == 2) {
            System.out.println();
            
            if(namaBarang[0] == null) {
                System.out.println("Belum ada barang yang tersedia");
            } else {           
                for(int i = 0; i < jumlahBarang.length; i++){
                    if (namaBarang[i] == null ) {
                        break;
                    } else {
                        System.out.println((i+1) + ". " + namaBarang[i]);
                        System.out.println("Jumlah barang : " + jumlahBarang[i] + "\n");
                    }
                }
                System.out.print("Pilih barang yang ingin dijual : ");
                jual = s.next();
                System.out.print("Masukkan jumlah barang yang ingin dijual : ");
                jumlah = s.nextInt();
                
                for(int i = 0; i < jumlahBarang.length; i++) {
                    if(namaBarang[i] == jual) {
                        if(jumlahBarang[i] < jumlah) {
                            System.out.println("Jumlah barang kurang");
                        } else {
                            jumlahBarang[i] -= jumlah;  
                        }
                    }
                }
            }
            loop = "y";
        } else if(pilih == 3) {
            System.out.println();
            
            if(namaBarang[0] == null) {
                System.out.println("Belum ada barang yang tersedia");
            } else {
                for(int i = 0; i <= jumlahBarang.length; i++){
                    if (namaBarang[i] == null ) {
                        break;
                    } else{ 
                            System.out.println((i+1) + ". " + namaBarang[i]);
                            System.out.println("Jumlah barang : " + jumlahBarang[i] + "\n");              
                    }
                }
            }
            System.out.println("=====================================================");
            System.out.print("\nKembali ke menu utama?(y/t) ");
            loop = s.next();
        } else if(pilih == 4) {
            loop = "t";
        }
        System.out.println();
        
        if(loop.equals("t")) {
             System.out.println("\nSampai jumpa kembali......."); 
        }
    }
  }
}