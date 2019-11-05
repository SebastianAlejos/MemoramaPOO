import javax.swing.JFrame;
public class Ventana extends JFrame {
    public Ventana(){
        super("Memorama POO");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Tablero tab=new Tablero();
        this.add(tab);
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        Ventana ventana= new Ventana();
    }
}