import java.util.Scanner;

public class tryexception {
    public static void main(String [] args) {
        
        /*try {
            int [] angka = {32, 12, 50, 33};
            
            System.out.println(angka[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Elemen array tidak ditemukan");
        }*/
        Scanner masuk = new Scanner(System.in);
        
        float a, b, hasil = 0;
        
        System.out.print("Bilangan Penyebut : ");
        a = masuk.nextFloat();
        
        System.out.print("Bilangan Pembilang : ");
        b = masuk.nextFloat();
        
        try {
            hasil = a / b;
        }catch(ArithmeticException e) {
            System.out.println("Angka Tersebut Tidak Bisa Dibagi Dengan Nol");
        }catch(Exception e) {
            System.out.println(e.toString());
        }finally {
            System.out.println("Hasil : " + hasil);
        }
    }  
}