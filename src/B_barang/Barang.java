
package B_barang;

public class Barang  {
    
    int kode;
    String nama_barang;
    int jumlah;
    double harga, cash, total;

    public Barang(int kode, String nama_barang, int jumlah, double harga, double cash, double total) {
        this.kode = kode;
        this.nama_barang = nama_barang;
        this.jumlah = jumlah;
        this.harga = harga;
        this.cash = cash;
        this.total = total;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
public  void hitung(){
    total=getHarga()*getJumlah();
}
   
}
