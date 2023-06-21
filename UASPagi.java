import java.util.Scanner;
class UASPagi {
    public static void main (String [] args) {
        Scanner abc = new Scanner (System.in);
        System.out.print("Digit terakhir NIM Anda : "); int npm = abc.nextInt();
        System.out.println(npm+"\t"+pagi(npm));
    }
    
    static int pagi (int b) {
        if (b==0) return 3;
        else return 2*pagi(b-1)-1;
    }
}


/*import java.io.*;

public class test {
    public static void main(String [] args) {
        String pembatas = "--------------------------------------------------------------";
        String x, nama;
        double jarak, waktu, kecepatan;
        
        try {
            FileInputStream input = new FileInputStream("D:/Latihan Program/Java/jarak.txt");
            DataInputStream dataInput = new DataInputStream(input);
            
            System.out.println("Nama\t\tJarak(km)\tWaktu(menit)\tKecepatan");
            System.out.println(pembatas);
            
            while(dataInput.available()!=0) {
                x=dataInput.readLine();
                nama=x.substring(9);
                jarak=Double.parseDouble(x.substring(0,4));
                waktu=Double.parseDouble(x.substring(5,8));
                kecepatan=jarak/(waktu/60);
                System.out.println(nama+"\t"+jarak+"\t\t"+String.format("%.0f", waktu)+"\t\t"+String.format("%.2f", kecepatan)+" km/jam");
            }
        } catch (Exception e) {
            System.err.println("File input error");
        }
        System.out.println(pembatas);
    }
}*/



/*Scanner s = new Scanner(System.in);
        System.out.print("NPM\t: "); String npm = s.next();
        System.out.print("Nama\t: "); String nama = s.next();
        
        String sore = npm.substring(9).concat(nama);
        System.out.println(sore);
        for(int x=sore.length(); x>0; x--) {
            System.out.println(sore.substring(x-1,x));
        }*/
        
/*try {
            FileOutputStream out = new FileOutputStream("D:/Latihan Program/Java/jarak.txt");
            PrintStream p = new PrintStream(out);
            
            p.println("38.3|060|Emily   ");
            p.println("16.2|042|Arabella");
            p.println("86.4|160|Daniel  ");
            p.println("21.8|042|Zachry  ");
            p.println("43.2|066|Rose    ");
            p.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Selesai menulis ke File");*/        