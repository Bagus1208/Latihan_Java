import java.util.Scanner;
import java.sql.*;

public class CRUDBagus {
    static final String jdbcdriver = "org.sqlite.JDBC";
    static final String url = "jdbc:sqlite:D:/Latihan Program/Java/Pemrograman 2/data/Bagus.db";
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    static Scanner s = new Scanner(System.in);
    
    public static void main(String [] args) {
        
        String NPM, Nama, Kelas, Grade="";
        double Rerata = 0;
        
        try {
            Class.forName(jdbcdriver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            
            
            System.out.println("========================================================================================");
            System.out.println("                        DATA NILAI PEMROGRAMAN");
            System.out.println("========================================================================================");
            System.out.print("\tMasukkan kata kunci pencarian : ");
            String input = s.nextLine();
            System.out.println("========================================================================================");
            System.out.println("Hasil pencarian : ");
            System.out.println("\n----------------------------------------------------------------------------------------");
             System.out.println("NPM\t\t\tNama\t\tKelas\t\tRata-rata\t\tGrade");
            System.out.println("----------------------------------------------------------------------------------------");
                
            rs = st.executeQuery("SELECT NPM, Nama, Kelas, Rerata FROM mahasiswa WHERE NPM LIKE'%"+input+
            "%' OR Nama LIKE '%"+input+"'");
                
            while(rs.next()) {
                NPM = rs.getString("NPM");
                Nama = rs.getString("Nama");
                Kelas = rs.getString("Kelas");
                Rerata = rs.getDouble("Rerata");
                    
                if(Rerata>=85) {
                    Grade = "A";
                } else if(Rerata>=70) {
                    Grade = "B";
                } else if(Rerata>=56) {
                    Grade = "C";
                } else if(Rerata>=45) {
                    Grade = "D";
                } else if(Rerata>=0) {
                    Grade = "E";
                } 
                    
                System.out.println(NPM+"\t\t"+Nama+"\t\t"+Kelas+"\t\t"+Rerata+"\t\t\t"+Grade);
                System.out.println("----------------------------------------------------------------------------------------");
            }
            
        } catch(java.lang.Exception e) {
            System.out.println("Gagal mencari data"+e.getMessage());
        }
    }
}