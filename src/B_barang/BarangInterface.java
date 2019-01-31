
package B_barang;

import javax.swing.JTable;

public interface BarangInterface {
   
  public void create(Barang barang);
  public void read(JTable jTable);
  public void update(int kode, Barang barang);
  public void delete(int kode);
  public void find(JTable jTable, String key);
  
  

    public void update(Integer valueOf);
  

}


