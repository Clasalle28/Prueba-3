/**
 * 
 */
package cl.curso.java.prueba_tres.clasalle;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class TarjetaBip {

	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;

	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip() {
		this.numeroTarjeta = 11111111;
		this.saldo = 10000;
		this.viajes = viajes;
	}

	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta
	 *            the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * @param viajes
	 *            the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	/**
	 * "monto" representa la cantidad de dinero que pondremos en nuestra tarjeta
	 * con este proceso, cargaremos 'monto' a 'saldo'
	 * 
	 * @param monto
	 */
	public void recargar(int monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	/**
	 * este proceso muestra la forma de pago si no se encuentra el saldo
	 * necesario, arrojara una excepcion si el pago se puede realizar,
	 * descontara 'valorViaje' a 'saldo'
	 * 
	 * @param valorViaje
	 */
	public synchronized void pagarViaje(int valorViaje) {
		if (this.getSaldo() >= valorViaje) {
			this.setSaldo(this.getSaldo() - valorViaje);
			viajes.add(new Viaje(new Date(), this.getSaldo(), valorViaje));
		} else {
			throw new SinSaldoException("Saldo insuficiente.");
		}
	}

	/**
	 * Ordenara la lista mediante sus fechas correspondientes
	 */
	public void ordenarViajes() {
		Collections.sort(viajes, new Comparator<Viaje>() {

			public int compare(Viaje o1, Viaje o2) {
				return (o1.getFecha().compareTo(o2.getFecha()));
			}
		});
	}

	/**
	 * ordenaremos y luego imprimiremos la lista de viajes, usando el metodo
	 * printLn
	 */
	public void imprimir() {
		for (Viaje viaje : viajes) {
			System.out.println(viaje);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TarjetaBip [numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + ", viajes=" + viajes + "]";
	}

}
