package Project; 

public class DriverClass {
    public static void main(String[] args) {
        System.out.println("================================");

        Makhluk Unknown = new Makhluk();
        Unknown.print();

        System.out.println("================================");

        Flora Elkontolia = new Flora();
        Elkontolia.display();

        System.out.println("================================"); 

        Fauna prototype = new Fauna();
        prototype.print();

        System.out.println("================================");

        Brontosaurus Dino = new Brontosaurus();
        Dino.print();

        System.out.println("================================");

        kuda Jaran = new kuda();
        Jaran.print();

        System.out.println("================================");
    }
}
