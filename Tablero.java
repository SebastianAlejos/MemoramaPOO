import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
public class Tablero extends JPanel {
   // private Carta[] cartas;
   /* private Carta carta1,
                          carta2;*/
    private Jugador[] jugadores;
    private int paresEncontrados;

    public Tablero(){
        super();
        this.setLayout(new GridLayout(3,4));  
        this.setSize(300,400);  
        this.setVisible(true);  
    }
}