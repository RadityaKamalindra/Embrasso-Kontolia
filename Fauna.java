package Project;

public class Fauna extends Makhluk {
    public String habitat;
    public String ciri;
    public String Kingdom;
 

    public Fauna() {
        super.setType("Fauna");
        this.habitat = "Darat";
        this.ciri = "Berkaki Empat"; 
        this.Kingdom = "Animalia";
       
    }

    public Fauna(String t, int u, String j, String n, double b, String h, String c, String K) {
        super(t, u, j, n, b);
        this.habitat = h;
        this.ciri = c;
        this.Kingdom = K;
    }

    public String getHabitat() {
        return habitat; 
    }

    public String getKingdom() {
        return Kingdom;
    }

    public void setKingdom(String Kingdom) {
        this.Kingdom = Kingdom;
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
        System.out.println("Kingdom: " + Kingdom);                      
    }
}
