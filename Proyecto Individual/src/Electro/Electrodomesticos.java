package Electro; 


/**
 * 
 * @author carlos
 *
 */

public class Electrodomesticos {

	private double precioBase; 
	private String color;
	private char consumoEnergetico;
	private int peso;
	


	/**
	 * Contructor por defecto 
	 */

	public Electrodomesticos() {
		this.precioBase =100;
		this.color = "Blanco" ;
		this.consumoEnergetico = 'F'; 
		this.peso = 5; 	
	}

	/**
	 * Contructor con parametros de precio base y Peso. 
	 * @param precioBase
	 * @param peso
	 */
	Electrodomesticos(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.color= "Blanco"; 
		this.consumoEnergetico ='F' ;
		this.peso = peso;
	}
	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */

	public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}


	/**
	 * Getters de los Atributos para poder mostrar los elementos. 
	 * @return
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	} 






	public void comprobarConsumoEnergetico () {
		char letra [] = new char [5];
		letra[0]='a';
		letra[1]='b';
		letra[2]='c';
		letra[3]='d';
		letra[4]='e';
		letra[5]='f';

		if ( consumoEnergetico == 'a' )
			System.out.println('a');
		else { 
			if (consumoEnergetico == 'b')
				System.out.println('b');
			else {
				if (consumoEnergetico == 'c')
					System.out.println('c');
				else {
					if(consumoEnergetico == 'd')
						System.out.println('d');
					else {
						if(consumoEnergetico == 'e') {
							System.out.println('e');
						}
						else {
							System.out.println('F');
						}
					}
				}
			}
		}
	}


	public void comprobarColor(String color) {
		String Color [] = new String [4];
		Color[0]="Blanco";
		Color[1]="Negro";
		Color[2]="Rojo";
		Color[3]="Azul";
		Color[4]="Gris";


		if ( color == "Blanco" ) {
			System.out.println("Blanco");
		}else { 
			if (color == "Negro") {
				System.out.println("Negro");
			}else {
				if (color == "Rojo") {
					System.out.println("Rojo");
				}else {
					if(color ==  "Azul") {
						System.out.println("Azul");
					}else {
						if(color  == "Gris") {
							System.out.println("Gris");
						}else {
							System.out.println("Blanco");
						}
					}
				}
			}
		}
	}	


	
	
	public double precioFinal() {
		 double precio  = 0 ; 
		
		switch (consumoEnergetico ) { 

		case 'a' : precio +=  100; break ; 
		case 'b' : precio +=  80; break ; 
		case 'c' : precio +=  60; break ;  
		case 'd' : precio += 50; break ; 
		case 'e' : precio += 30; break ; 
		case 'f' : precio += 10; break ; 
		default  : precio += 10; break ; 
		}
		
		
		if ( peso >= 0 && peso <= 19 ) {
			precio += 10;
		}else if (peso > 19 && peso <= 49){
				precio += 50 ;
		}else if (peso > 50 && peso <= 79 ){
					precio += 80;
		}else if(peso >80){
					precio += 100; 
		}
			
		
		return precioBase + precio ;


	}	
}
			
			
			
			
			
			
			