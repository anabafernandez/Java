package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Ciclo Do While, evalua la expresión en la parte inferior del ciclo
		 * Por tanto, las declaraciones dentro del bloque "do" siempre se ejecutgan al menos una vez
		 * 
		 */
		
		//Cuenta del 1 a 20
		int cuenta = 1; 
		do {
			System.out.println("cuenta " +cuenta);
	cuenta++;
	
		}while(cuenta <0); //Output 1 ya se ejecuto al menos 1 vez
		//////////////////////////////////////////////////////
		
		/*
		 * Crear un programa para un cajero bancariop
		 * El PROGRAMA MOSTRARA 4 OPCIONES
		 * 1. Consultar saldo
		 * 2. Ingresar Dinero
		 * 3.Retirar Dinero
		 * 4.Salir
		 * -Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija otra opcion
		 * -El usuario puede salir del programa escribiendo 4 (salir)
		 * 
		 * 
		 */
		
		System.out.println("Bienvenido al banco City Generation, elija algunas de nuestras opciones disponibles");
		
		System.out.println("1.Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Salir");
		
		Scanner scr = new Scanner (System.in);
		int opcion;
		
		do {
			opcion = scr.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("Consultasr saldo");
			break;
			case 2: System.out.prinln("Ingresar dinero");
			break;
			case 3: System.out.prinln("Retirar dinero");
			break;
			case 4: System.out.prinln("Salir");
			
			break;
				
			default;
					System.out.println("Poir favor elija una opcion valida, de nuestro menu");
					break;
					
		
			}
		

	}while (opcion != 4);
	
		scr.close();


