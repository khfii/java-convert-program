package KonversiSuhu;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import javax.swing.JOptionPane;

/**
 *
 * @author Kahfi
 */
public class koneksi {
       private static Connection mysql_koneksi; 
    public static Connection koneksi_db(){
            if (mysql_koneksi==null) {
                try {
                    String db ="jdbc:mysql://localhost:3306/perhitungan";
                    String user = "root"; 
                    String pass = ""; 
                    
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    mysql_koneksi = (Connection) DriverManager.getConnection(db, user, pass); 
                    System.out.println("Berhasil terhubung ke database");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal Terkoneksi Ke Database");
                    
                }
                
                
            } 
                
                return mysql_koneksi; 
    
}
    
    public static void main(String[] args) {
        koneksi_db(); 
    }
    
   
}
