package Electro;

/**
 * 
 * @author carlos
 *
 */
public class Lavadora extends Electrodomesticos{


	/**
	 * Atributo 
	 */
	private int carga ;


	/**
	 * Constructores
	 */

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
		this.carga = 5 ;  
	}

	public Lavadora(int precioBase, int peso, int carga) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.carga = 5; 
	}

	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.carga = carga; 
	}


	/**
	 * Gett carga , asi podremos obtener el valor de la carga. 
	 * @return
	 */
	public int getCarga() {
		return carga;
	}


	
	
	/**
	 * Precio final aumentado segun la carga 
	 */
	public double precioFinal() {
	double precio = super.precioFinal(); 
	
	if (carga > 30 ) {
	precio += 50 ; 
	}
return   precio; 

}








}







