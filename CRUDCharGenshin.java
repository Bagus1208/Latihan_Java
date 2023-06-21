import java.io.*;
import java.sql.*;

public class CRUDCharGenshin {
    static final String jdbcdriver = "org.sqlite.JDBC";
    static final String url = "jdbc:sqlite:D:/Latihan Program/Java/Pemrograman 2/data/charGenshin.db";
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
        System.out.println("\n=========== Main Menu ===========");
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
                    insertCharacter();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateCharacter();
                    break;
                case 4:
                    deleteCharacter();
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
        String sql = "SELECT * FROM charGenshin";
        
        try {
            rs = st.executeQuery(sql);
            
            System.out.println("+------------------------------------+");
            System.out.println("|      karakter Genshin Impact      |");
            System.out.println("+------------------------------------+");
            
            while (rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("Gender");
                String region = rs.getString("Region");
                String element = rs.getString("Element");
                String weapon = rs.getString("Weapon");
                
                System.out.println(String.format("%s. %s. %s. %s. %s", name, gender, region, element, weapon));
            } 
        }catch (java.lang.Exception e) {
                System.out.println("Gagal Menampilkan Data..." + e.getMessage());
        }
    }
    
    static void insertCharacter() {
        try {
            System.out.print("Nama : ");
            String name = input.readLine().trim();
            System.out.print("Jenis Kelamin : ");
            String gender = input.readLine().trim();
            System.out.print("Region : ");
            String region = input.readLine().trim();
            System.out.print("Elemen : ");
            String element = input.readLine().trim();
            System.out.print("Senjata : ");
            String weapon = input.readLine().trim();
            
            String sql = "INSERT INTO charGenshin VALUES ('"+name+"','"+gender+"','"+region+"','"+element+"','"+weapon+"')";
            
            st.execute(sql);
            System.out.println("Data Berhasil Disimpan....");
        } catch(java.lang.Exception e) {
            System.out.println("Data Gagal Disimpan.... " + e.getMessage());
        }    
    }
    
    static void updateCharacter() {
        try {
            System.out.print("Nama karakter yang ingin diubah : ");
            String name = input.readLine().trim();
            System.out.print("Jenis Kelamin = ");
            String gender = input.readLine().trim();
            System.out.print("Region : ");
            String region = input.readLine().trim();
            System.out.print("Elemen : ");
            String element = input.readLine().trim();
            System.out.print("Senjata : ");
            String weapon = input.readLine().trim();
            
            String sql = "UPDATE charGenshin SET Gender='"+gender+"', Region='"+region+"', Element='"+element+"', Weapon='"+weapon+"' WHERE Name='"+name+"'";
            sql = String.format(sql, name, gender, region, element, weapon);
            
            st.execute(sql);
            System.out.println("Data Berhasil Diubah....");
        }catch (java.lang.Exception e) {
            System.out.println("Data Gagal Diubah..." + e.getMessage());
        }
    }
    
    static void deleteCharacter() {
        try {
            System.out.print("Nama Karakter yang ingin dihapus : ");
            String name = input.readLine();
            
            String sql = String.format("DELETE FROM charGenshin WHERE Name='"+name+"'");
            
            st.execute(sql);
            System.out.println("Data Berhasil Dihapus...");
        }catch (java.lang.Exception e) {
            System.out.println("Data Gagal Dihapus..." + e.getMessage());
        }
    }
}
