/* 
Dikerjakan oleh :
1. Aulia Amanda Putri
2. Bagus Ario Yudanto
3. Marissa Auditia Khoironisa
*/

import javax.swing.*;

public class delapan_R2P_soalkedua {
    public static void main(String []arg) {
        int jumlah = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Angka"));
        
        for(int i = 1; i <= jumlah; i++) {
            while(i % 2 == 0) {
                System.out.print("          "); 
                break;
            }
            System.out.println(i);
        } 
    }
}

