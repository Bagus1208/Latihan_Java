import javax.swing.JOptionPane;

public class Coffe_Shop {
    public static void main(String[] arg) {
        String nama, menu, rincian;
        int jumlah;
        int harga = 0;
        int tambahan = 0;
        JOptionPane.showMessageDialog(null,"Selamat datang di Busta Coffe Shop");
        
        menu = JOptionPane.showInputDialog
        ("||========================||" +
        "\n||       Daftar Menu dan Harga      ||" + 
        "\n||========================||" +
        "\n||1. Espresso..................Rp.20k   ||" +
        "\n||2. Macchiato.................Rp.22k   ||" +
        "\n||3. Latte...........................Rp.24k  ||" +
        "\n||4. Cappucino.................Rp.24k  ||" +
        "\n||5. Mocha........................Rp.25k  ||" +
        "\n||========================||" +
        "\n\nMau pesan apa kak?");
        
        if (menu.equalsIgnoreCase("Espresso")) { 
            harga=20000; 
        } else if (menu.equalsIgnoreCase("Macchiato")) { 
            harga=22000; 
        } else if (menu.equalsIgnoreCase("Latte")) { 
            harga=24000; 
        } else if (menu.equalsIgnoreCase("Cappucino")) { 
            harga=24000; 
        } else if (menu.equalsIgnoreCase("Mocha")) { 
            harga=25000; 
        } else {
            JOptionPane.showMessageDialog(null,"Pesanan Anda tidak ada di menu");
        }
        
        jumlah = Integer.parseInt(JOptionPane.showInputDialog("Mau pesan berapa kak?"));
        
        rincian = JOptionPane.showInputDialog(menu + " nya mau panas atau dingin kak?\n\nNote : Jika dingin ada tambahan biaya 2K");
        
        if (rincian.equalsIgnoreCase("panas")) {
            tambahan = 0;
        } else if (rincian.equalsIgnoreCase("dingin")) {
            tambahan = 2000;
        } else {
            JOptionPane.showMessageDialog(null,"Maaf inputan kakak salah");
        }
        
        nama = JOptionPane.showInputDialog("Pesanannya atas nama siapa kak?");
        
        JOptionPane.showMessageDialog(null,"Pesanannya yaitu " + jumlah + " " + menu + " " + rincian + " atas nama "+ nama);
        JOptionPane.showMessageDialog(null,"Ditunggu sebentar ya kak.");
        JOptionPane.showMessageDialog(null,"Ini pesanannya kak.");
        JOptionPane.showMessageDialog(null, 
        "||==============================||" + 
        "\n||                   Rincian Pesanan                  ||" + 
        "\n||==============================||" + 
        "\n||   Menu                Jumlah            Total    ||" +
        "\n|| " + menu + "                  " + jumlah + "                " + (harga*jumlah)  +"  ||" +
        "\n||-------------------------------------------------------||" +
        "\n|| Tambahan                                      " + tambahan + " ||" +
        "\n||-------------------------------------------------------||" +
        "\n|| Total harga                                   " + ((harga*jumlah) + tambahan) + " ||" + 
        "\n||==============================||");
        JOptionPane.showMessageDialog(null,"Selamat menikmati.");
    }
}