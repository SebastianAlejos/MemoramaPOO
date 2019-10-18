package Proyecto;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Carta extends JPanel implements MouseListener {
	private String 	nombre;
	private Image 	img;
					
	private boolean encontrada,
							  estado;
	
	public Carta(String nombre, Image img){
		super();
		this.nombre=nombre;
		this.img=new ImageIcon(img).getImage();
		this.encontrada=false;
		this.estado=false;
		
		this.setPreferredSize(new Dimension(100,200));
		
		
		this.addMouseListener(this);
		
	}
	public boolean abrir() {
		if(this.estado==false) {
			return this.estado=true;
		}else {
			return false;
		}
		
	}
	public boolean cerrar() {
		if(this.estado==true&&this.encontrada==false) {
			this.estado=false;
			return true;
		}else {
			return false;
		}
		
		
	}
	public void parEncontrado() {
		this.encontrada=true;
	}
	public void pintaCarta(Graphics g) {
		Image dorso=new ImageIcon("dorso.jpg").getImage();
		Image frente=new ImageIcon("jolteon.png").getImage();
		super.paintComponent(g);
		if(this.estado==false) {
			g.drawImage(dorso, 0, 0, this.getWidth(), this.getHeight(), this);
		}else {
			g.drawImage(frente, 0, 0, this.getWidth(), this.getHeight(), this);
		}
		
	}
	public boolean equals(Carta carta) {
		
		if(this.nombre==carta.nombre&&this.img==carta.img) {
			return true;
		}else {
			return false;
		}
		
		
	}
	public String toString() {
		return this.nombre;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
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
