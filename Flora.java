package Project;

public class Flora extends Makhluk {
    public String Warna;
    public String Bentuk;
    public String Aroma;


    public Flora() {
        super.nama = "Embrasso Kontolia";
        super.umur = 130;
        super.jenis = "Irritability";
        super.type = "Flora";
        super.banyak = 1;
        this.Warna = "Coklat";
        this.Bentuk = "Panjang Melengkung, Berbatang Keras, Kepala Seperti Jamur";
        this.Aroma = "Harum Pandan";
    }
    
    public Flora(String t, int u, String j, String n, double b, String w, String B, String a) {
        super(t, u, j, n, b);
        this.Warna = w;
        this.Bentuk = B;
        this.Aroma = a;
    }

    public void display() {
        super.print();
        System.out.println("Warna: " + Warna);
        System.out.println("Bentuk: " + Bentuk);
        System.out.println("Aroma: " + Aroma);
        
    }
   
}
 







































































