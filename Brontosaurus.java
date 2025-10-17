package Project;

public class Brontosaurus extends Fauna {
    public String Periode;
    public String Ukuran;

    public Brontosaurus() {
        super.setUmur(70);
        super.setJenis("Herbivora");
        super.setNama("Brontosaurus");
        super.setBanyak(225000);
        super.setHabitat("Amerika Serikat Bagian Barat");
        super.setCiri("Leher dan ekornya yang sangat panjang, tubuhnya yang besar dan berkaki empat, kepala yang kecil dibandingkan dengan tubuhnya, serta tulang-tulangnya yang memiliki rongga udara");
        this.Periode = "Jura Akhir";
        this.Ukuran = "23 meter x 20 Ton";
    }

    public Brontosaurus(String t, int u, String j, String n, double b, String h, String c) {
        super(t, u, j, n, b, h, c);
    } 

    public void print() {
        super.print();
        System.out.println("Periode: " + Periode);
        System.out.println("Ukuran: " + Ukuran);
    }
}