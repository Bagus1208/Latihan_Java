import javax.swing.*;

public class forbersarang {
    public static void main(String []arg) {
        
        int jumlah = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Angka"));
        
        for(int i = 0; i < jumlah ; i++) {
            for(int j = i; j < (jumlah-1); j++) {
                System.out.print(" ");
            }
            
            for(int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}