import java.util.Scanner;

public class tugasAkhirKelompok8 {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        
        
        //Jobdesk Raja Fathir Rakha Putra  
        System.out.println("||========================================================================================||");
        System.out.println("||                                     JURAGAN 88 TRAVEL                                ||");
        System.out.println("||========================================================================================||");
        
        System.out.println("\nSelamat datang di Juragan 88 Travel. Sahabat berlibur anda. Kepuasan Anda adalah" + 
        "\nprioritas kami. travel kami merupakan travel yang terbaik, terpercaya, dan sudah terdaftar" + 
        "\nresmi secara legal.");
        System.out.print("\nTravel kami merupakan travel yang menyediakan layanan paket pariwisata ke berbagai" + 
        "\ntempat wisata di berbagai daerah.  Kami sudah terdaftar legal di sektor industri. Maka dari" +
        "\nitu percayakanlah perjalanan anda pada Juragan 88 Travel. Kami menjamin bahwa tujuan" +
        "\ndan lokasi-lokasi pariwisata pilihan kami adalah yang terbaik dan paling menyenangkan di" + 
        "\ndaerah tujuan pariwisata anda.");
        
        System.out.println("\n\n============================================================================================");
        
        String Nama, Nope;
        int Umur, Orang = 0;
        
        System.out.println("Masukkan identitas diri dan rincian perjalanan");
        System.out.print("Nama/(Perwakilan) : "); Nama = s.nextLine();
        System.out.print("Umur              : "); Umur = s.nextInt();
        System.out.print("No. Telp(WA)      : "); Nope = s.next();
        System.out.print("Jumlah Orang      : "); Orang = s.nextInt();
        
        
        //Jobdesk Idham Basamalah dan M. Fadhil A. Fattah    
        String tujuan;
        String Destinasi_Wisata;
        
        System.out.println("==================================================================================================================");
        System.out.println("");
        System.out.println("\n                              PAKET TRAVEL PARIWISATA YANG TERSEDIA");
        System.out.println("");
        System.out.println("\n          Bandung                         Yogyakarta                           Bali                ");
        System.out.println("\n    1.Tangkuban Perahu                 1.Candi Borobudur                1.Pantai Kuta           ");
        System.out.println("\n    2.Orchid Forest Cikole             2.Goa Pindul                     2.Pura Tanah Lot      ");
        System.out.println("\n    3.Floating Market                  3.Malioboro                      3.Taman Budaya GWK Bali");
        System.out.println("");
        System.out.println("");
        System.out.println("================================================================================================================");
        System.out.print("\nTentukan tujuan perjalanan anda (Gunakan awalan kapital) : ");
        tujuan = s.next();
        System.out.println();
        
        switch(tujuan){
            case "Bandung":
                System.out.println("\nTempat Wisata Yang Akan Anda Kunjungi" + "\nTujuan           : Bandung" + "\nDestinasi Wisata : Tangkuban Perahu, Orchid Forest Cikole, dan Floating Market");
                break;              
            case "Yogyakarta":
                System.out.println("\nTempat Wisata Yang Akan Anda Kunjungi" +"\nTujuan         : Yogyakarta" + "\nDestinasi Wisata : Candi Borobudur, Goa Pindul, dan Malioboro");
                break;
            case "Bali":
                System.out.println("Tempat Wisata Yang Akan Anda Kunjungi" +"\nTujuan           : Bali" + "\nDestinasi Wisata : Pantai Kuta, Pura Tanah Lot, dan Taman Budaya GWK Bali");
                break;
        }
        
        
        //Jobdesk Bagus Ario Yudanto
        int pilih = 0, hargaPenginapan = 0,  biayaPenginapan = 0, kamar = 0;
        
        switch (tujuan) {
            case "Bandung" :
                System.out.println("\n===================================================================================================================");
                System.out.println("\nDaftar penginapan di " + tujuan +
                "\n1. The Trans Luxury Hotel Bandung...............................................................Rp. 1.200.000,-" + 
                "\n2. GrandMercure Bandung Setiabudi...............................................................Rp. 1.600.000,-" + 
                "\n3. InterContinental Bandung Dago Pakar..........................................................Rp. 2.000.000,-");
                break;
            
            case "Yogyakarta" :
                System.out.println("\n===================================================================================================================");
                System.out.println("\nDaftar penginapan di " + tujuan +
                "\n1. Hyatt Regency Yogyakarta.....................................................................Rp. 1.000.000/malam" + 
                "\n2. Hotel Santika Premiere Jogja.................................................................Rp. 1.300.000/malam" + 
                "\n3. Yogyakarta Marriott Hotel....................................................................Rp. 1.700.000/malam");
                break;
                
            case "Bali" :
                System.out.println("\n===================================================================================================================");
                System.out.println("\nDaftar penginapan di " + tujuan +
                "\n1. The Sankara Resort Ubud.....................................................................Rp. 1.300.000/malam" + 
                "\n2. Hard Rock Hotel Bali.........................................................................Rp. 1.700.000/malam" + 
                "\n3. Double-Six Luxury Hotel......................................................................Rp. 2.200.000/malam");
                break; 
        }
        System.out.println("\n===================================================================================================================");      
        System.out.print("\nTentukan Pilihan Penginapan (Angka): "); pilih = s.nextInt();
        
        if (Orang % 2 == 0) {
            kamar = Orang / 2;
        }
        else {
            kamar = (Orang + 1) / 2;
        }
        
        switch(tujuan) {
            case "Bandung" :
                switch(pilih) {
                    case 1 :
                        System.out.println("\nAnda memilih penginapan The Trans Luxury Hotel Bandung");                        
                        hargaPenginapan = 1200000;
                        biayaPenginapan = kamar * 1200000;
                        break;
                        
                    case 2 :
                        System.out.println("\nAnda memilih penginapan GrandMercure Bandung Setiabudi");
                        hargaPenginapan = 1600000;
                        biayaPenginapan = kamar * 1600000;
                        break;
                        
                    case 3 :
                        System.out.println("\nAnda memilih penginapan InterContinental Bandung Dago Pakar" );
                        hargaPenginapan = 2000000;
                        biayaPenginapan = kamar * 2000000;
                        break;
                    
                }            
                break;
        
            case "Yogyakarta" :
                switch(pilih) {
                    case 1 :
                        System.out.println("\nAnda memilih penginapan Hyatt Regency Yogyakarta" );
                        hargaPenginapan = 1000000;
                        biayaPenginapan = kamar * 1000000;
                        break;
                    
                    case 2 : 
                        System.out.println("\nAnda memilih penginapan Hotel Santika Premiere Jogja" );
                        hargaPenginapan = 1300000;
                        biayaPenginapan = kamar * 1300000;
                        break;
                    
                    case 3 :
                        System.out.println("\nAnda memilih penginapan Yogyakarta Marriott Hotel" );
                        hargaPenginapan = 1700000;
                        biayaPenginapan = kamar * 1700000;
                        break;
                }
                break;
        
            case "Bali" :
                switch(pilih) {
                    case 1 :
                        System.out.println("\nAnda memilih penginapan The Sankara Resort Ubud" );
                        hargaPenginapan = 1300000;
                        biayaPenginapan = kamar * 1300000;
                        break;
                        
                    case 2 :
                        System.out.println("\nAnda memilih penginapan Hard Rock Hotel Bali" );
                        hargaPenginapan = 1700000;
                        biayaPenginapan = kamar * 1700000;
                        break;
                        
                    case 3 :
                        System.out.println("\nAnda memilih penginapan Double-Six Luxury Hotel" );
                        hargaPenginapan = 2200000;
                        biayaPenginapan = kamar * 2200000;
                        break;
                }
            break;
        }
        System.out.println("\n===================================================================================================================");      
        
        
        //Jobdesk Marissa Auditia Khoironisa  
        int Transport = 0, biaya = 0, mobil = 0, elf = 0, bus30 = 0, bus50 = 0, pesawat = 0;
      
        if (tujuan.equals("Bandung"))
        {
          if (Orang >= 1 && Orang <=4)
          {
              mobil= 200000;
              biaya= 300000;
              // harga yang tertera adalah harga perOrang untuk 3N2D
              Transport = (mobil+biaya)*Orang;
            }
            else if (Orang >= 5 && Orang <=15)
            {
                elf=100000;
                biaya=80000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (elf+biaya)*Orang;
            }
            else if (Orang >= 16 && Orang <=30 )
            {
                bus30=85000;
                biaya=40000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (bus30+biaya)*Orang;
            }
            else if (Orang >= 50 && Orang <= 31 )
            { 
                bus50= 70000;
                biaya= 25000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (bus50+biaya)*Orang;
            }
        }
        else if (tujuan.equals("Yogyakarta"))
        {
            if (Orang >= 1 && Orang <=4)
            {
                mobil = 200000;
                biaya = 625000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (mobil+biaya)*Orang;
            }
            else if  (Orang >= 5 && Orang <=15)
            {
                elf= 100000;
                biaya= 170000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (elf+biaya)*Orang;
            }
            else if (Orang >= 16 && Orang <=30)
            {
                bus30 = 85000;
                biaya = 85000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport =(bus30+biaya)*Orang;
            }
            else if (Orang >= 50 && Orang <= 31 )
            {
                bus50 = 70000;
                biaya = 50000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (bus50+biaya)*Orang;
            }
        }
        else if (tujuan.equals("Bali"))
        {
            if (Orang >= 1 && Orang <=4)
            {
                pesawat= 1500000;
                mobil= 200000;
                biaya= 300000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (mobil+pesawat+biaya)*Orang;
            }
            else if  (Orang >= 5 && Orang <=15)
            {
        
                pesawat= 1500000;
                elf= 100000;
                biaya= 80000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (pesawat+elf+biaya)*Orang;
            }
            else if (Orang >= 16 && Orang <=30)
            {
                pesawat= 1500000;
                bus30 = 850000;
                biaya = 40000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (pesawat+bus30+biaya)*Orang;
            }
            else if (Orang >= 50 && Orang <= 31 )
            {
                pesawat = 1500000;
                bus50 = 70000;
                biaya = 25000;
                // harga yang tertera adalah harga perOrang untuk 3N2D
                Transport = (pesawat+bus50+biaya)*Orang;
            }
        }
        else 
        {
            System.out.println("Maaf, tujuan wisata yang Anda masukan belum tersedia");
        }
        
        
        //Jobdesk Aulia Amanda Putri  
        double pajak, grandTotal = 0;
    
        System.out.println();
        System.out.println("                                            RINCIAN PEMESANAN");
        System.out.println("\nIdentitas diri dan rincian perjalanan");
        System.out.println("Nama Pemesan   : " + Nama);
        System.out.println("Umur           : " + Umur);
        System.out.println("No. Telp       : " + Nope);
        System.out.println("Jumlah Orang   : " + Orang);
        
        System.out.println("\nRincian Harga");
        System.out.println("Paket Wisata "+ tujuan + " " + Orang + " x " + "Rp. 300.000" + "    : Rp. " + Orang * 300000);
        System.out.println("Konsumsi " + Orang + " x Rp. 120.000                : Rp. " + Orang * 120000);
        System.out.println("Transport                               : Rp. " + Transport);
        System.out.println("Penginapan " + kamar + " x " + hargaPenginapan + "                  : Rp. " + biayaPenginapan);
        pajak = 0.1 * ((Orang * 300000) + (Orang * 120000) + (Transport) + (biayaPenginapan));
        System.out.println("PPN 10%                                 : Rp. " + String.format("%.0f", pajak));
        grandTotal = (pajak + (Orang * 300000) + (Orang * 120000) + (Transport) + (biayaPenginapan));
        System.out.println("\nGrand Total                             : Rp. " + String.format("%.0f", grandTotal));
        
    }
}
