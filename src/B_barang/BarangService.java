package B_barang;

import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BarangService implements BarangInterface {

    String sql = "";
    private DefaultTableModel dtm;

    Koneksi koneksi = new Koneksi();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void create(Barang barang) {
        sql = "insert into barang values(?,?,?)";

        try {
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, barang.getNama_barang());
            ps.setInt(3, barang.getJumlah());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void read(JTable jTable) {
        String kolom[] = {"kode", "Nama Barang", "Jumlah"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM barang";
        try {
            rs = koneksi.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[4];
                o[0] = rs.getString("idbarang");
                o[1] = rs.getString("namabarang");
                o[2] = rs.getString("harga");

                dtm.addRow(o);
            }
            jTable.setModel(dtm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void update(int id, Barang barang) {
        sql = "update gudang set nama_barang='" + barang.nama_barang + "',jumlah='" + barang.getJumlah() + "' where kode ='" + barang.getKode()+"'";
        try {
            koneksi.getStm().execute(sql);

            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        sql = "delete from gudang where kode = ?";

        try {
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void find(JTable jTable, String key) {

    }

    @Override
    public void update(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
