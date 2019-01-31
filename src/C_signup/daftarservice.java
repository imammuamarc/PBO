/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_signup;

import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imamm
 */

public class daftarservice implements daftarinterface{
    String sql = "";
    private DefaultTableModel dtm;

    Koneksi koneksi = new Koneksi();
    PreparedStatement ps;
    ResultSet rs;
   

    @Override
    public void daf(daftar daftar) {
        sql = "insert into user values(?,?)";

        try {
            ps = koneksi.getKon().prepareStatement(sql);
             ps.setString(1, daftar.getNama());
            ps.setInt(2, daftar.getPass());
           
            

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
