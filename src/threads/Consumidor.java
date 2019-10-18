package threads;

import mostradores.Mostrador;

public class Consumidor extends Thread{

    private Mostrador m;
    
    public Consumidor(Mostrador m) {
        super();
        this.m = m;
    }

    @Override
    public void run() {
        System.out.println("El objeto recibido fue: " + m.getNumero());
    }
    
}
