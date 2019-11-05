import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.util.Random;

public class Tablero extends JPanel {
   private Carta[] cartas;
   private Carta carta1,
                 carta2;
    //private Jugador[] jugadores;
    private int paresEncontrados;


    public Tablero(){
        super();
        this.setLayout(new GridLayout(4,3));  
        this.setPreferredSize(new Dimension(1000,1000));
        this.setVisible(true); 
        this.cartas= new Carta[12];
        for (int i=0; i<this.cartas.length; i++) { 
            this.cartas[i] = new Carta("Carta"+(i+1)%6, new ImageIcon((i+1)%6 + ".jpg").getImage(),this); //Crea la carta
        }
        Random ran=new Random();
		int posA;
		Carta tmp;
		for(int i=0;i<this.cartas.length;i++){
			posA=ran.nextInt(12);
            tmp=this.cartas[i];
			this.cartas[i]=this.cartas[posA];
            this.cartas[posA]=tmp;
        }
        for (int i = 0; i < cartas.length; i++) {
            this.add(this.cartas[i]);
        }
    }

    public void setCarta1(Carta carta1){
        this.carta1=carta1;
    }

    public void setCarta2(Carta carta2){
        this.carta2=carta2;
    }

    public Carta getCarta1() {
        return this.carta1;
    }

    public Carta getCarta2() {
        return this.carta2;
    }

    public void comparaCartas(){
       if(this.carta1.equals(this.carta2)){
           this.carta1.parEncontrado();
           this.carta2.parEncontrado();
       }
       this.carta1.cerrar();
       this.carta2.cerrar();
    }
}