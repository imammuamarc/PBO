
package Config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private String database = "admin";
    private String url = "jdbc:mysql://localhost/"+database;
    private String username = "root";
    private String password = "";
    private Connection kon;
    private Statement stm;
    
    public Koneksi(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
            kon =DriverManager.getConnection(url, username, password);
            stm = kon.createStatement();
            
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal!! "+e.getMessage());
        }
           
            
         
        
    }

    public Connection getKon() {
        return kon;
    }

    public Statement getStm() {
        return stm;
    }


    }

