import java.util.Scanner;

public class no3 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        String input,nilai;
        float ipk;
        int gaji;
        
        System.out.print("masukan IPK Mahasiswa(IPK YANG ADA koma,menggunakan KOMA(,) !!! ): ");
        input = s.nextLine();
        nilai = input.replaceAll(",",".");
        ipk = Float.parseFloat(nilai);
        
        System.out.println("----------------------");
        
        if (ipk > 3.25) {
            System.out.println("IPK MHS tinggi");
            System.out.println("----------------------");
            System.out.print("Masukan penghasilan Ortu Perbulan : ");
            gaji = s.nextInt();
            System.out.println("----------------------");
            
            if (gaji > 5000000) {
                System.out.println("\nMHS BERHAK Mendapatkan bantuan dana pendidikan sebesar 1 kali gaji orang tua");
            }
        }
        else if (ipk > 2.75) {
            System.out.println("IPK CUKUP");
            System.out.println("----------------------");
        }
        else if (ipk < 2.75) {
            System.out.println("IPK Rendah");
            System.out.println("----------------------");
        }
    }
}

 