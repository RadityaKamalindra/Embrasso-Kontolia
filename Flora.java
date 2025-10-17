package Project;

public class Flora extends Makhluk {
    
    public Flora() {
        super.setType("Flora");
        super.setUmur(10);
        super.setJenis("irritability");
        super.setNama("Embrasso Kontolia");
        super.setBanyak(2);
    }
    
    public Flora(String t, int u, String j, String n, double b) {
        super(t, u, j, n, b);
    }

    public void display() {
        super.print();
    }
   
}
 







































































