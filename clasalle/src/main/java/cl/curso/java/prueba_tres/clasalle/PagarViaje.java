/**
 * 
 */
package cl.curso.java.prueba_tres.clasalle;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class PagarViaje extends Thread {

	private TarjetaBip tarjetaBip;
	private int valorViaje;

	/**
	 * @param tarjetaBip
	 * @param valorViaje
	 */
	public PagarViaje() {
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = 640;
	}

	/**
	 * @param tarjetaBip
	 * @param valorViaje
	 */
	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}

	/**
	 * @return the tarjetaBip
	 */
	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}

	/**
	 * @param tarjetaBip
	 *            the tarjetaBip to set
	 */
	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
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

	@Override
	public synchronized void run() {
		getTarjetaBip().pagarViaje(valorViaje);
		super.run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PagarViaje [tarjetaBip=" + tarjetaBip + ", valorViaje=" + valorViaje + "]";
	}

}
