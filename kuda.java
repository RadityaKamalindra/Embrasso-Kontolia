package Project;

public class kuda extends Fauna {
    public String kecepatan;
    public String kekuatan;

    public kuda() {
        super.setNama("Kuda");
        super.setUmur(30);
        super.setJenis("Herbivora");
        super.setHabitat("Darat");
        super.setCiri("Berkaki Empat dan Berbulu");
        super.setKingdom("Animalia");
        super.setBanyak(500000000);
        this.kecepatan = "88 km/jam";
        this.kekuatan = "Menendang dengan kekuatan 1.000 pound per inci persegi";
    }

    public kuda(int u, String h, String a) {
    
    }

    public void print() {
        super.print();
    }
    
}  
