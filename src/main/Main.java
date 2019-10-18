package main;

import java.applet.Applet;
import java.awt.*;

import mostradores.Mostrador;
import threads.*;

public class Main extends Applet{
    
	
	private static final long serialVersionUID = 1554119310077614846L;

	public void main(String[] args) {

	       
    }
	
     public void paint(Graphics g) {
         Mostrador m = new Mostrador();
     	 Productor p = new Productor (m);
         p.start();
         Consumidor c = new Consumidor(m);
         c.start();
         g.drawString("El numero generado fue:", 30, 50);
         g.drawString(String.valueOf(m.getNumero()),30,100);
         
     }
}
