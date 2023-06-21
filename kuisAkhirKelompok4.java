import java.util.Scanner;
public class kuisAkhirKelompok4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        String Lanjut;
        int pilihNomor;
        
        System.out.println("Silahkan tentukan pilihan menu yang mau anda kerjakan");
        System.out.print("Mulai Tentukan Pilihan Anda [y/t] ? ");
        Lanjut = s.next();
        while(Lanjut.equals("y")) {
            if (Lanjut.equals("y")){
                System.out.print("Pilihan:\n1 : Pilih Tarif Sewa Kendaraan\n2 : Pilih Bintang Besar ke Kecil\n3 : Pilih Bintang Piramida\n4 : Pilih Data Penjualan Gamis\n");
                System.out.print("\nMasukkan pilihan Anda : ");
                pilihNomor= s.nextInt();
                if(pilihNomor == 1){
                        int Kendaraan = 0, Biaya = 0, Tarif= 0, Potongan= 0, JumlahTotal=0, Lama= 0, Jumlah = 0;
                        String Nama;
                        
                        System.out.println("----------------------------------------");
                        System.out.println("");
                        System.out.println("MENGHITUNG TARIF SEWA KENDARAAN");
                        System.out.println("");
                        System.out.println("----------------------------------------");
                        System.out.println("Promo IDUL ADHA");
                        System.out.println("");
                        System.out.println("# Kendaraan >= 3 #");
                        System.out.println("- Lama sewa >= 3 hari, Potongan Rp. 200.000");
                        System.out.println("- Lama sewa >= 2 hari, Potongan Rp. 100.000");
                        System.out.println("");
                        System.out.println("# Kendaraan <= 2 #");
                        System.out.println("- Lama sewa >= 3 hari, Potongan Rp. 50.000");
                        System.out.println("- Lama sewa <= 2 hari, Tidak dapat potongan");
                        System.out.println("");
                        System.out.print("Masukan Nama Penyewa Kendaraan  : ");
                        Nama = s.next();
                        System.out.print("Masukan Jumlah Kendaraan Sewa   : ");
                        Jumlah = s.nextInt();
                        System.out.print("Masukan Lama Sewa (Hari)   : ");
                        Lama = s.nextInt();
                        
                        if (Jumlah >= 1 && Jumlah <= 2)
                         {
                            Kendaraan = 200000;
                            //harga yang tertera adalah harga seperti yang dicontohkan di pdf
                            JumlahTotal = (Kendaraan)*Jumlah;
                            
                            if(Lama >=1 && Lama <=2)
                            {
                                Potongan = 0;
                                System.out.println("Anda Tidak Dapat Potongan");
                                Tarif = (JumlahTotal * Lama) - Potongan;
                            }    
                            else if (Lama == 3 && Lama >=3)
                            {
                                Potongan = 50000;
                                //harga yang tertera adalah harga seperti yang dicontohkan di pdf
                                Tarif = (JumlahTotal * Lama) - Potongan;
                            }
                        }        
                        else if (Jumlah == 3 && Jumlah >=3)
                        { 
                            Kendaraan = 200000;
                            //harga yang tertera adalah harga seperti yang dicontohkan di pdf
                            JumlahTotal = (Kendaraan)*Jumlah;
                                if(Lama >=1 && Lama <=2)
                                {
                                    Potongan = 100000 ;
                                    //harga yang tertera adalah harga seperti yang dicontohkan di pdf
                                    Tarif = (JumlahTotal * Lama) - Potongan;
                                }
                                else if (Lama == 3 && Lama >=3)
                                {
                                    Potongan = 200000;
                                    //harga yang tertera adalah harga seperti yang dicontohkan di pdf
                                    Tarif = (JumlahTotal * Lama) - Potongan     ;
                                }
                        }
                        else
                        {
                            System.out.println("Maaf, Inputan Anda Salah");
                        }
                    //Rincian Pemesanan
                    System.out.println("");
                    System.out.println("==================================================================================================================");
                    System.out.println("");
                            System.out.println("                                            RINCIAN PEMESANAN");
                            System.out.println("");
                            System.out.println("Nama Penyewa             : " + Nama);
                            System.out.println("Harga Kendaraan          : " + JumlahTotal);
                            System.out.println("Anda dapat potongan      : " + Potongan);
                            System.out.println("Tarif Yang Anda Bayar    : " + Tarif ); 
                    System.out.println("");
                    System.out.println("==================================================================================================================");
                                            
                } else if (pilihNomor==2){
                    System.out.println("---------------------------------------------");
                    System.out.println("* MEMBUAT SEGITIGA SIKU-SIKU KANAN *");
                    System.out.println("---------------------------------------------");
                    System.out.print("MASUKAN NILAI PERULANGAN: ");
                    int angka = s.nextInt();
                    
                    for (int i=1; i<=angka; i++) {
                        for (int j=1; j<i; j++){
                            System.out.print("  ");
                        }
                       for (int j=i; j<=angka; j++){
                      System.out.print("* ");
                        }
                        System.out.println();
                    }    
                    
                } else if (pilihNomor==3){
                    System.out.println("---------------------------------------------");
                    System.out.println("* MEMBUAT BINTANG PIRAMIDA *");
                    System.out.println("---------------------------------------------");
                    System.out.print("Masukan Tinggi Piramida: ");
                    int tinggi = s.nextInt();
                    
                    for(int i=1; i<=tinggi; i++){
                        
                        for(int j=i; j<=tinggi; j++){
                            System.out.print(" ");
                        }
                        
                        for(int k=0; k<=(i*2)-2; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    
                } else if (pilihNomor==4){
                    double [] harga = new double[10];
                    String [] kodeBarang = new String[10];
                    String nama;
                    int pesanan = 0;
                    double total = 0, untung = 0, pendapatanBersih = 0;
                    
                    System.out.println("---------------------------------------------");
                    System.out.println("    == Data Pemesanan Gamis/Serimbit ==");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    
                    System.out.print("Masukkan nama penjaga       : "); 
                    nama = s.next();
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
            } else if (Lanjut.equals("t")){
                System.out.print("Selesai");
            } else{
                System.out.print("Salah Pilih");
            }
            System.out.print("\nInput pilihan lagi [y/t] ? ");
            Lanjut = s.next();
            System.out.println();
        }
    }
}