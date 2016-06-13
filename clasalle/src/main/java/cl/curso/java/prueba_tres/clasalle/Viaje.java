/**
 * 
 */
package cl.curso.java.prueba_tres.clasalle;

import java.util.Date;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class Viaje {

	private Date fecha;
	private int saldo;
	private int valorViaje;

	/**
	 * @param fecha
	 * @param saldo
	 * @param valorViaje
	 */
	public Viaje() {
		this.fecha = fecha;
		this.saldo = 10000;
		this.valorViaje = 660;
	}

	/**
	 * @param fecha
	 * @param saldo
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldo, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldo = saldo;
		this.valorViaje = valorViaje;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}

	/**
	 * @param valorViaje
	 *            the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	@SuppressWarnings("null")
	public void compareTo(Viaje viaje) {
		Comparable<Viaje> comparable = null;
		comparable.compareTo(viaje);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Viaje [fecha=" + fecha + ", saldo=" + saldo + ", valorViaje=" + valorViaje + "]";
	}

}
