package threads;

import java.util.Random;
import mostradores.Mostrador;


public class Productor extends Thread{
	private Mostrador m;
	
    public Productor(Mostrador m) {
        super();
        this.m = m;
    }

    @Override
    public void run() {
        Random rnd = new Random(System.currentTimeMillis());
        int numeroCreado = rnd.nextInt(1001);
        m.setNumero(numeroCreado);
        System.out.println("El numero creado fue: " + numeroCreado);

    }
    
}
