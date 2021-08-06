import java.util.Scanner;

import java.util.Scanner;

public class SistemaPresupuestos {
	
	
	public static Scanner entrada = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("****BIENVENIDO A SISTEMA DE PRESUPUESTO******");
		System.out.println("Ingresa tu nombre:");
		var nombre = entrada.nextLine();
		System.out.println("Ingresa tu edad:");
		int edad = entrada.nextInt();
		boolean esMayor = validarEdad(edad);

		if (esMayor) {
			validacionVidaCrediticia();
		} else {
			System.out.println("No puedes continuar el proceso debido a que eres menor de edad ");
		}

	}

	
	public static void validacionVidaCrediticia() {
		
		
		
		System.out.println("¿Tienes vida crediticia? escribe true o false (en minuscula) segun tu estado");
		boolean vidaCrediticia = entrada.nextBoolean();
		
		if(vidaCrediticia) {
			
			System.out.println("FELICITACIONES puedes adquirir cualquier moto gracias a que tienes vida crediticia");
			
			
		}else {
			System.out.println("Ingresa tu presupuesto:");
			float presupuesto = entrada.nextFloat();
			System.out.println("con tu presupuesto puedes adquirir estas motos:");
			catalogoMotoSinvidaCrediticia(presupuesto);
		}
			
			

	}

	//este metodo se encarga de valdiar la edad del usuario
	public static boolean validarEdad(int edad) {

		boolean esMayor = false;

		if (edad >= 18) {

			System.out.println("Puedes continuar con el proceso");
			esMayor = true;

		}

		return esMayor;

	}
	
	// ESTE METODO SE ENCARGA DE MOSTRAR EL CATALOGO DE LAS MOTOS QUE PUEDE COPRAR EL USUARIO SOLO CON SU PRESUPUESTO
	public static void catalogoMotoSinvidaCrediticia( float presupuesto)  {
		 
	    
		if ( presupuesto >=5000000 && presupuesto <= 6000000 ) {
			
			System.out.println("la moto que puedes comprar es la  TVS Max 125 modelo 2022");
			
		}
		 
		else if (presupuesto > 6000000 && presupuesto <= 7000000) {
			
			System.out.println("la moto que puedes comprar es la Apache RTR 160 4v");
		
		}
		
		else if (presupuesto > 7000000 ) {
			
			System.out.println("la moto que puedes comprar es la Apache RTR 310 ");
			
		}
		
		else {
			System.out.println("tu presupuesto no alcanza para nuestars motos ");
		}
		}
	
	
}
