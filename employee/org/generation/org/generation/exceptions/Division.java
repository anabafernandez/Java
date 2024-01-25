package org.generation.exceptions;

public class Division {
	
	//Método para dividir
	
	public static int dividir (int num1, int num2) {
		return num1 / num2;
		
	}

	public static void main(String[] args) {
		/*
		 * La clase Exception nos permite manejar cualquier caso excepcional con nuestro código, es el
		 * equivalente a los errores
		 *  - try. envualve el codigo que puede generar una excepcion y lo evalua
		 * - catch contiene el codigo que se ejecutra cuasndo se lanza la excepcion
		 * 	Sintaxis 
		 * 	try {
		 * } catch (ExceptionName e) {
		 * 	//Bloque de excepción
		 * }
		 * 
		 * -finally : siempre se ejecuta, y se utiliza para mostrar y prescindir de finally
		 */
		
		//Exception que se arroja si un numero se divide entre 0
		try {
			int resultado = dividir (10, 2);
			System.out.println("el resultado de la division es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: no puedes dividir entre 0");
		} finally {
			System.out.println("Programa finalizado");
		}
		
	}
}

		


