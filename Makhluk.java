package Project;
 
public class Makhluk {
    String type;
    int umur;
    String jenis;
    String nama;
    double banyak;

    public Makhluk() {
        this.type = "Unknown";
        this.umur = 0;
        this.jenis = "Unknown";
        this.nama = "Unknown";
        this.banyak= 0;
    }

    public Makhluk(String t, int u, String j, String n, double b) {
        this.type = t;
        this.umur = u;
        this.jenis= j;
        this.nama = n;
        this.banyak = b;
    }

    public String getType() { 
        return type;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public double getBanyak() {
        return banyak;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBanyak(double banyak) {
        this.banyak = banyak;
    }

    public void print() {
        System.out.println("Type: " + type);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis: " + jenis);
        System.out.println("Nama: " + nama);
        System.out.println("Banyak: " +    banyak );
    }
}
