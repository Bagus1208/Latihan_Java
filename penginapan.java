import java.util.Scanner;

public class penginapan {
    public static void main(String [] arg) {
        String pilih;
        String tujuan;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukan tujuan Anda : "); tujuan = s.nextLine();
        
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
                "\n1.  The Sankara Resort Ubud.....................................................................Rp. 1.300.000/malam" + 
                "\n2. Hard Rock Hotel Bali.........................................................................Rp. 1.700.000/malam" + 
                "\n3. Double-Six Luxury Hotel......................................................................Rp. 2.200.000/malam");
                break; 
        }
        System.out.println("\n===================================================================================================================");      
        System.out.print("\nTentukan Pilihan Penginapan (Angka): "); pilih = s.nextLine();
        System.out.println("\n===================================================================================================================");      
        
        switch(tujuan) {
            case "Bandung" :
                switch(pilih) {
                    case "1" :
                        System.out.println("\nAnda memilih penginapan The Trans Luxury Hotel Bandung");
                        break;
                        
                    case "2" :
                        System.out.println("\nAnda memilih penginapan GrandMercure Bandung Setiabudi");
                        break;
                        
                    case "3" :
                        System.out.println("\nAnda memilih penginapan InterContinental Bandung Dago Pakar" );
                        break;
                    
                }            
                break;
        
            case "Yogyakarta" :
                switch(pilih) {
                    case "1" :
                        System.out.println("\nAnda memilih penginapan Hyatt Regency Yogyakarta" );
                        break;
                    
                    case "2" : 
                        System.out.println("\nAnda memilih penginapan Hotel Santika Premiere Jogja" );
                        break;
                    
                    case "3" :
                        System.out.println("\nAnda memilih penginapan Yogyakarta Marriott Hotel" );
                        break;
                }
                break;
        
            case "Bali" :
                switch(pilih) {
                    case "1" :
                        System.out.println("\nAnda memilih penginapan The Sankara Resort Ubud" );
                        break;
                        
                    case "2" :
                        System.out.println("\nAnda memilih penginapan Hard Rock Hotel Bali" );
                        break;
                        
                    case "3" :
                        System.out.println("\nAnda memilih penginapan Double-Six Luxury Hotel" );
                        break;
                }
            break;
        }
        
        
        
    }
}

