
package ejercicio14;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Hilos extends Thread{
    private static Semaphore sem= new Semaphore (3);
    int espera=0;
    public Hilos(){
    }
    
    public void run(){
            try {
                sem.acquire();
                if (sem.tryAcquire()) {
                   if (sem.tryAcquire(2, TimeUnit.SECONDS)) {
                        System.out.println("Soy el cliente "+this.getName()+" y he conseguido sitio");
                        espera=(int) (Math.random()*2000+500);
                        System.out.println("Tarda "+espera+" en cortarse el pelo");
                        System.out.println("El cliente "+this.getName()+" se ha ido");
                        sleep(espera);
                        sem.release();
                    }
                    else{
                    System.out.println("El cliente "+this.getName()+" no quiso cortarse el pelo");
                    }
                espera=(int) Math.random()*500;
                sleep(espera);
                }
                
            } catch (InterruptedException ex) {
                System.out.println("Error en "+ex);
            }
    }
    
}
