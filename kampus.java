import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class kampus {
    static final String jdbcdriver = "org.sqlite.JDBC";
    static final String url = "jdbc:sqlite:D:/Latihan Program/Java/Pemrograman 2/data/kampus.db";
    static Connection koneksi;
    static Statement st;
    static ResultSet rs;
    
    public static void main(String [] args) {
        try {
            Class.forName(jdbcdriver);
            koneksi = DriverManager.getConnection(url);
            st = koneksi.createStatement();
            String sql = "SELECT * FROM mahasiswa;";
            rs = st.executeQuery(sql);
            
            while(rs.next()) {
                System.out.println("NIM           : "+ rs.getString("nim"));
                System.out.println("Nama          : "+ rs.getString("nama"));
                System.out.println("Jenis Kelamin : "+ rs.getString("jenkel"));
                System.out.println("Kota          : "+ rs.getString("kota"));
                System.out.println("No HP         : "+ rs.getString("nohp"));
                System.out.println("Nilai         : "+ rs.getInt("nilai"));
                System.out.println();
            }
            
            st.close();
            koneksi.close();
        } catch (Exception e) {
            System.out.println("Data Gagal Dibaca " + e.getMessage());
        }
    }
    
}
