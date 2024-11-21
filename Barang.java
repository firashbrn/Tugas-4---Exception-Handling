public class Barang{
  private String KodeBarang;  
  private String NamaBarang;
  private double HargaBarang;

  // Konstruktor
  public Barang(String KodeBarang, String NamaBarang, double HargaBarang) 
  {
    if (KodeBarang == null || KodeBarang.isEmpty()) {
        throw new IllegalArgumentException("Kode barang tidak boleh kosong");
    }
    if (NamaBarang == null || NamaBarang.isEmpty()) {
        throw new IllegalArgumentException("Nama barang tidak boleh kosong");
    }
    if (HargaBarang <= 0) {
        throw new IllegalArgumentException("Harga barang tidak boleh minus");
    }
    this.KodeBarang = KodeBarang;
    this.NamaBarang = NamaBarang;
    this.HargaBarang = HargaBarang;
}

// Getter dan Setter
public String getKodeBarang() {
    return KodeBarang;
}

public String getNamaBarang() {
    return NamaBarang;
}

public double getHargaBarang() {
    return HargaBarang;
}

@Override
public String toString() {
    return "Kode: " + KodeBarang + "\nNama Barang: " + NamaBarang + "\nHarga: Rp." + HargaBarang;
}
}


