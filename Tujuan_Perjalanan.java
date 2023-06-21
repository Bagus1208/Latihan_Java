import java.util.Scanner;
public class Tujuan_Perjalanan{
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    String tujuan;
    String ya = "Y";
System.out.println("\nSelamat datang di DuoDul Travel, travel kami merupakan travel yang terbaik, terpercaya, dan sudah terdaftar resmi secara legal");
System.out.println("\nKami sudah terdaftar legal di sektor industri. Maka dari itu percayakanlah perjalanan anda pada DuoDul Travel");     
System.out.println("\nTravel kami merupakan travel yang menyediakan layanan paket pariwisata ke berbagai tempat wisata di daerah pilihan anda.");
System.out.println("\nKami menjamin bahwa tujuan dan lokasi-lokasi pariwisata pilihan kami adalah yang terbaik dan paling menyenangkan");
System.out.println("\ndi daerah tujuan pariwisata anda");
System.out.println("");
System.out.println("==================================================================================================================");
System.out.println("");
System.out.println("\n                              PAKET TRAVEL PARIWISATA YANG TERSEDIA");
System.out.println("");
System.out.println("\n          BANDUNG                            JOGJA                           BALI                ");
System.out.println("\n    1.Tangkuban Perahu                 1.Candi Borobudur                1.Pantai Kuta           ");
System.out.println("\n    2.Orchid Forest Cikole             2.Goa Pindul                     2.Pura Tanah Lot      ");
System.out.println("\n    3.Floating Market                  3.Malioboro                      3.Taman Budaya GWK Bali");
System.out.println("");
System.out.println("");
System.out.println("================================================================================================================");
System.out.println("\nTentukan tujuan perjalanan anda (Gunakan awalan kapital) ");
tujuan = in.nextLine();
    switch (tujuan) {
        case "Bandung":
            System.out.print("\nTempat Wisata yang akan anda kunjungi adalah Tangkuban Perahu, Orchid Forest Cikole, dan Floating Market");
            break;              
        case "Jogja":
            System.out.println("\nTempat Wisata yang akan anda kunjungi adalah Candi Borobudur, Goa Pindul, dan Malioboro");
            break;
        case "Bali":
            System.out.println("Tempat Wisata yang akan anda kunjungi adalah Pantai Kuta, Pura Tanah Lot, dan Taman Budaya GWK Bali");
        break;
        

    }
}
}


 

