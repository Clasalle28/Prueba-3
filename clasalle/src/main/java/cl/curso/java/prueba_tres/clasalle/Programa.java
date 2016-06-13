/**
 * 
 */
package cl.curso.java.prueba_tres.clasalle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class Programa {

	public static void main(String[] args) throws InterruptedException {

		List<Viaje> listaViajes = new ArrayList<Viaje>();
		TarjetaBip tarjeta = new TarjetaBip(44444444, 5000, listaViajes);
		PagarViaje pgvj1 = new PagarViaje(tarjeta, 660);
		PagarViaje pgvj2 = new PagarViaje(tarjeta, 640);
		PagarViaje pgvj3 = new PagarViaje(tarjeta, 740);
		PagarViaje pgvj4 = new PagarViaje(tarjeta, 660);

		System.out.println(tarjeta);

		pgvj1.start();
		pgvj2.start();
		pgvj3.start();
		pgvj4.start();

		pgvj1.join();
		pgvj2.join();
		pgvj3.join();
		pgvj4.join();

		tarjeta.ordenarViajes();
		tarjeta.imprimir();

	}

}
