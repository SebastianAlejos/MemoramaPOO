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
  /*  public void mezcla(){
		Random ran=new Random();
		int posA;
		Naipe tmp;
		for(int i=0;i<this.cartas.length;i++){
			posA=ran.nextInt(52);
			tmp=this.cartas[i];
			this.cartas[i]=this.cartas[posA];
			this.cartas[posA]=tmp;
        }*/
    
}