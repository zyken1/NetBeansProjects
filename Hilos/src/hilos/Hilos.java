package hilos;

/**
 *
 * @author TOSHIBA
 */
public class Hilos {

   public static void main(String[] args) {
		// TODO Auto-generated method stub

		Proceso hilo1 = new Proceso("Hilo 1");
		Proceso hilo2 = new Proceso("Hilo 2");
		hilo1.setMensaje("Este es el mensaje del hilo 1");
		hilo2.setMensaje("Mensaje hilo 2");
		
		hilo1.start();
		hilo2.start();
	
	}
    
}
