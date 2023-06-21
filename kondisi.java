import java.util.Scanner;

class kondisi {
    public static void main(String [] args) {
        int nilai;
        String nama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("======Program Penilaian======");
        System.out.println("\n");
        
        System.out.print("Masukkan nama Anda = "); nama = input.nextLine();
        System.out.print("Masukkan nilai Anda = "); nilai = input.nextInt();
        
        if ((nilai < 0) && (nilai > 100)) {
            System.out.println("Batasan nilai terlampaui");}
        else if ( nilai >= 85) {
            System.out.println("Anda mendapat nilai huruf A");}
        else if (nilai >= 75)  {
            System.out.println("Anda mendapat nilai huruf B");}
        else if (nilai >= 55) {
            System.out.println("Anda mendapat nilai huruf c");}
        else if (nilai >= 45) {
            System.out.println("Anda mendapat nilai huruf D");}
        else {
            System.out.println("Anda mendapatkan nilai huruf E");}
    }
}
       