package Project;

public class kuda extends Fauna {

    public kuda() {
        super.setUmur(30);
        super.setJenis("Herbivora");
        super.setNama("Kuda");
        super.setBanyak(60000000);
        super.setHabitat("Padang Rumput Terbuka dan Stepa");
        super.setCiri("Berkaki empat, memiliki ekor panjang, dan memiliki surai di lehernya");
    }

    public kuda(String t, int u, String j, String n, double b, String h, String c) {
        super(t, u, j, n, b, h, c);
    }

    public void print() {
        super.print();
    }
    
} 
