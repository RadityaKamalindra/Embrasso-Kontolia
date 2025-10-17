package Project;

public class Fauna extends Makhluk {
    public String habitat;
    public String ciri;

    public Fauna() {
        super.setType("Fauna");
        this.habitat = "Darat";
        this.ciri = "Berkaki Empat"; 
    }

    public Fauna(String t, int u, String j, String n, double b, String h, String c) {
        super(t, u, j, n, b);
        this.habitat = h;
        this.ciri = c;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getCiri() {
        return ciri;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setCiri(String ciri) {
        this.ciri = ciri;
    }
    
    public void print() {
        super.print();
        System.out.println("Habitat: " + habitat);
        System.out.println("Ciri-ciri: " + ciri);
    }
}
