package Electro;


public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Electrodomesticos listaelectrodomesticos[]= new Electrodomesticos[10];
	
	listaelectrodomesticos[0]= new Electrodomesticos();
	listaelectrodomesticos[1]= new Lavadora();
	listaelectrodomesticos[2]= new Television();
	listaelectrodomesticos[3]= new Electrodomesticos();
	listaelectrodomesticos[4]= new Lavadora();
	listaelectrodomesticos[5]= new Television();
	listaelectrodomesticos[6]= new Electrodomesticos();
	listaelectrodomesticos[7]= new Lavadora();
	listaelectrodomesticos[8]= new Television();
	listaelectrodomesticos[9]= new Electrodomesticos();
	

	double sumaelectrodomesticos = 0 ;
	double sumalavadora = 0 ;
	double sumatelevision = 0 ; 
	

	for ( int i = 0 ; i < listaelectrodomesticos.length;i++){
	
	if( listaelectrodomesticos[i] instanceof Electrodomesticos) {
		sumaelectrodomesticos +=  listaelectrodomesticos[i].precioFinal();
	}
	if( listaelectrodomesticos[i] instanceof Lavadora) {
		sumalavadora +=  listaelectrodomesticos[i].precioFinal();
	}
	if( listaelectrodomesticos[i] instanceof Television) {
		sumatelevision +=  listaelectrodomesticos[i].precioFinal();
	}
	
	System.out.println("La suma de electrodomesticos es :" +sumaelectrodomesticos);
	System.out.println("La suma de Lavadora es : "+sumalavadora);
	System.out.println("La suma de televison es : " + sumatelevision);
	
	
	
	
	}	
	
	}
}
