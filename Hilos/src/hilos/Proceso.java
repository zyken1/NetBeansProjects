
package hilos;

public class Proceso extends Thread{
	
	String mensaje;
	public Proceso(String msg)
	{
		super(msg);
	}
	
	public void run()
	{
		for(int i=0;i<=155;i++)
		{
			System.out.println(mensaje);
		}
		System.out.println("Este proceso ha terminado:"+this.getName());
	}
	
	public void setMensaje(String msj)
	{
		this.mensaje = msj;
	}

} 

