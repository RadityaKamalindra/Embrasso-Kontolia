package Project;

public class Brontosaurus extends Fauna {
    public String Periode;
    public String Ukuran;
    public int berat; 

    public Brontosaurus() {

        super.setNama("Brontosaurus");
        super.setUmur(150);
        super.setJenis("Herbivora");
        super.setHabitat("Darat");
        super.setCiri("Leher Panjang dan Berbadan Besar");
        super.setKingdom("Animalia");
        super.setBanyak(0);
        this.Periode = "Jura Akhir";
        this.Ukuran = "23 meter x 20 Ton";
        this.berat = 20000;
    }

    public Brontosaurus(String t, String c, int b) {
        super();
        this.Periode = t;
        this.Ukuran = c;
        this.berat = b;

    }

    public void print() {
        super.print();
        System.out.println("Periode: " + Periode);
        System.out.println("Ukuran: " + Ukuran);
        System.out.println("Berat: " + berat + " kg");
    } 
}
