package Electro;
/**
 * 
 * @author carlos
 *
 */

public class Television extends Electrodomesticos{

	
/**
 * Atributos 
 */
	private int resolucion; 
	private boolean sintonizador;
	
	
	
	/**
	 * Constructores , donde por defecto se asignan valores a los atributos de la clase. 
	 */
	
	public Television() {
		super();
		// TODO Auto-generated constructor stub
		this.resolucion = 20 ; 
		this.sintonizador = false ;
	}
	public Television(int precioBase, int peso, int resolusion, boolean sintonizador) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = 20 ;
		this.sintonizador = false ;
	}
	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolusion, boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = resolusion ;
		this.sintonizador = sintonizador ;
		
		
		
		
		
		/**
		 * Getters , asi podremos extraer el valor de la variable. 
		 */
	}
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizador() {
		return sintonizador;
	} 
	
	
	
	/**
	 * Precio Final aumentado segun la resolucion y el sintonizador.
	 */

	public double precioFinal() {
		double precio = super.precioFinal(); 

		if (resolucion > 40 ) {
			precio += getPrecioBase()*0.3 ; 
		}
		if (sintonizador ) {
			precio += 50; 
		}
	 return precio; 
	}



}




