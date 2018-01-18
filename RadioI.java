/**
 * 
 */

/**
 * @author CHEW, TRUJILLO
 *
 */
public interface RadioI {
	//Esta clase es la acordada en el laboratotio de estructura de datos 

	public String frecAdelante();
	public String frecAtras();
	public boolean prender();
	public boolean apagar();
	public String cambioFrecuencia();
	public void guardarFrec(float frec, int pos);
	public String mostrarEstacion();
}
