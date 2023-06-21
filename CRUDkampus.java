import java.io.*;
import java.sql.*;

public class CRUDkampus {
    static final String jdbcdriver = "org.sqlite.JDBC";
    static final String url = "jdbc:sqlite:D:/Latihan Program/Java/Pemrograman 2/data/kampus.db";
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    public static void main(String [] args) {
        try {
            Class.forName(jdbcdriver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            
            while(!conn.isClosed()) {
                showMenu();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    
    static void showMenu() {
        System.out.println("\n=========== MENU UTAMA ===========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Close");
        System.out.println();
        System.out.print("Pilih Menu : ");
        
        try {
            int pilih = Integer.parseInt(input.readLine());
            
            switch (pilih) {
                /*case 0:
                    System.exit(0);
                    break;*/
                case 1:
                    insertMahasiswa();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Yang Anda Masukkan Salah");
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    
    static void showData() {
        String sql = "SELECT * FROM mahasiswa";
        
        try {
            rs = st.executeQuery(sql);
            
            System.out.println("+------------------------------------+");
            System.out.println("|      DATA MAHASISWA UNIV. ABS      |");
            System.out.println("+------------------------------------+");
            
            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String jenkel = rs.getString("jenkel");
                String kota = rs.getString("kota");
                String nohp = rs.getString("nohp");
                int nilai = rs.getInt("nilai");
                
                System.out.println(String.format("%s\t %s\t %s\t %s\t %s\t %d", nim, nama, jenkel, kota, nohp, nilai));
            } 
        }catch (java.lang.Exception e) {
                System.out.println("Gagal Menampilkan Data..." + e.getMessage());
        }
    }
    
    static void insertMahasiswa() {
        try {
            System.out.print("NIM : ");
            String nim = input.readLine().trim();
            System.out.print("Nama : ");
            String nama = input.readLine().trim();
            System.out.print("Jenis Kelamin = ");
            String jenkel = input.readLine().trim();
            System.out.print("Kota : ");
            String kota = input.readLine().trim();
            System.out.print("No HP : ");
            String nohp = input.readLine().trim();
            System.out.print("Nilai : ");
            int nilai = Integer.parseInt(input.readLine().trim());
            
            String sql = "INSERT INTO mahasiswa VALUES ('"+nim+"','"+nama+"','"+jenkel+"','"+kota+"','"+nohp+"','"+nilai+"')";
            
            st.execute(sql);
            System.out.println("Data Berhasil Disimpan....");
        } catch(java.lang.Exception e) {
            System.out.println("Data Gagal Disimpan.... " + e.getMessage());
        }    
    }
    
    static void updateMahasiswa() {
        try {
            System.out.print("NIM yang ingin diubah : ");
            String nim = input.readLine();
            System.out.print("Nama : ");
            String nama = input.readLine().trim();
            System.out.print("Jenis Kelamin = ");
            String jenkel = input.readLine().trim();
            System.out.print("Kota : ");
            String kota = input.readLine().trim();
            System.out.print("No HP : ");
            String nohp = input.readLine().trim();
            System.out.print("Nilai : ");
            int nilai = Integer.parseInt(input.readLine().trim());
            
            String sql = "UPDATE mahasiswa SET nama='"+nama+"', jenkel='"+jenkel+"', kota='"+kota+"', nohp='"+nohp+"', nilai="+nilai+" WHERE nim='"+nim+"'";
            sql = String.format(sql, nim, nama, jenkel, kota, nohp, nilai);
            
            st.execute(sql);
            System.out.println("Data Berhasil Diubah....");
        }catch (java.lang.Exception e) {
            System.out.println("Data Gagal Diubah..." + e.getMessage());
        }
    }
    
    static void deleteMahasiswa() {
        try {
            System.out.print("NIM yang ingin dihapus : ");
            String nim = input.readLine();
            
            String sql = String.format("DELETE FROM mahasiswa WHERE nim='"+nim+"'", nim);
            
            st.execute(sql);
            System.out.println("Data Berhasil Dihapus...");
        }catch (java.lang.Exception e) {
            System.out.println("Data Gagal Dihapus..." + e.getMessage());
        }
    }
}
