import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Carta extends JPanel implements MouseListener {
	private String 	nombre;
    private Image 	frente, 
                    dorso;
					
	private boolean encontrada,
					estado;
	private Image img;
	private Tablero tab;

	public Carta(String nombre, Image img, Tablero tab){
		super();
		this.nombre=nombre;
        this.frente=new ImageIcon(img).getImage();
        this.dorso=new ImageIcon("bla.jpg").getImage();
		this.encontrada=false;
		this.estado=false;
		this.setPreferredSize(new Dimension(300,200));
		this.addMouseListener(this);
		this.tab=tab;
    }

    public void paintComponent(Graphics g){
		super.paintComponent(g);
        this.pintaCarta(g);
    }

	public void pintaCarta(Graphics g) {
		g.drawImage(this.estado ? this.frente : this.dorso, 0, 0, 300, 200 ,this);
	}
	
	public String getNombre(){
		return this.nombre;
	}
    
	public boolean equals(Carta carta) {
		return (this.nombre.equals(carta.getNombre())) ? true : false;
    }
    
	public boolean abrir() {
		if(this.estado==false) {
			this.estado=true; 
			this.repaint();
			return this.estado;
		}else {
			this.repaint();
			return false;
		}
    }
    
	public boolean cerrar() {
		if(this.estado && !this.encontrada) {
			this.estado=false;
			this.repaint();
			return true;
		}else {
			this.repaint();
			return false;
		}
    }
    
	public void parEncontrado() {
		this.encontrada=true;
    }
    
	public String toString() {
		return this.nombre;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(this.tab.getCarta1()==null){
			this.tab.setCarta1(this);
			this.abrir();
		}else if(this.tab.getCarta2()==null){
				this.tab.setCarta2(this);
				this.abrir();
		}else{
			this.tab.comparaCartas();
			this.tab.setCarta1(null);
			this.tab.setCarta2(null);
			this.abrir();
			this.tab.setCarta1(this);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	
}
