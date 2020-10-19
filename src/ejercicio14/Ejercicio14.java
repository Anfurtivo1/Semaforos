
package ejercicio14;

/**
 *
 * @author Andres
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Hilos hilo1 = new Hilos();
        Hilos hilo2 = new Hilos();
        Hilos hilo3 = new Hilos();
        Hilos hilo4 = new Hilos();
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
    
}
