import java.util.Scanner;

public class tugasKelasMath {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        String jawab = "y";
        int pilih = 0;
        double hasil = 0, nilai = 0;
        int aksen = 0;
        
        System.out.println("Program Perhitungan Sin, Cos, Tan, Pangkat, dan Akar");
        while(jawab.equals("y")) {    
            System.out.println("\nPilihan : ");
            System.out.println("1. Sin\n2. Cos\n3. Tan\n4. Pangkat\n5. Akar");
            System.out.print("Masukkan pilihan Anda(angka) : ");
            pilih = s.nextInt();
            System.out.println();
            
            switch(pilih) {
                case 1 :
                    System.out.print("Masukkan nilai derajat : ");
                    nilai = s.nextDouble();
                    hasil = Math.sin(Math.toRadians(nilai));
                    break;
                
                case 2 :
                    System.out.print("Masukkan nilai derajat : ");
                    nilai = s.nextDouble();
                    hasil = Math.cos(Math.toRadians(nilai));
                    break;
                
                case 3 :
                    System.out.print("Masukkan nilai derajat : ");
                    nilai = s.nextDouble();
                    hasil = Math.tan(Math.toRadians(nilai));
                    break;
                
                case 4 :
                    System.out.print("Masukkan nilai yang ingin dipangkatkan : ");
                    nilai = s.nextDouble();
                    System.out.print("Masukkan nilai pangkatnya : ");
                    aksen = s.nextInt();
                    hasil = Math.pow(nilai, aksen);
                    break;
                
                case 5 :
                    System.out.print("Masukkan nilai yang ingin diakarkan : ");
                    nilai = s.nextDouble();
                    System.out.print("Masukkan nilai akarnya(2/3) : ");
                    aksen = s.nextInt();
                    if(aksen == 2) {
                       hasil = Math.sqrt(nilai); 
                    } else {
                        hasil = Math.cbrt(nilai);
                    }
                    break;
                }
                
            System.out.println("Hasil perhitungan : " + hasil);
            System.out.print("\nIngin melakukan perhitungan lagi?(y/n) : ");
            jawab = s.next();
        }
    }
}
