package CodigoDeOtros;
/*
 * Ana Karen Bailón Fernández
 * 5
 * 5
 * 5
 * 5
 * 5
 * 
 * */

import java.util.Scanner;


public class CodigoDeOtros6 {

// vamos a agregar el metodo main

		public static void main(String[] args) {
			// se mueven las variables al inicio
			int[] numeros = new int[20];// utilizamos la palabra new, refactorizamos n 
									
			int opcion = 0;
			int multiplo = 0;
			Scanner scan = new Scanner(System.in);
			
			// pedimos la opcion primero
			System.out.println("\n¿Qué números quiere resaltar? ");// falta n
			System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
			opcion = Integer.parseInt(scan.nextLine());// Agregamos parentesis
			multiplo = (opcion == 1) ? 5 : 7; // el formato esta al reves la forma correcta es tipoVariable nombreVariable =
												// condicion ? opcionVerdadero : opcionFalso;

			GenerarNumerosAleatorios(numeros);// Creamos una funcion para generar numeros aleatorios

			compararMultiplos(numeros, multiplo);// Creamos un metodo para comparar los multiplos que reciben como
													// parametros un array de tipo int y un int
		}

		private static void compararMultiplos(int[] numeros, int multiplo) {
			for (int numero : numeros) {// estamos trabajando con un tipo int no char, en java se utiliza for() en lugar
										// de foreach(), la distincion se hace en los argumentos que se le colocan al
										// for, refactorizamos e->numero
				if (numero % multiplo == 0) {
					System.out.print("[" + numero + "] ");
				} else {// sacamos el else de dentro del if
					System.out.print(numero + " ");// queremos mostar un mensaje en la terminar, por lo que es 'out' no 'in'
				}
			}
		}

		private static void GenerarNumerosAleatorios(int[] numeros) {
			for (int i = 0; i < numeros.length; i++) {// la forma de incrementar el valor a una variables es utiliando ++,
														// quitamos el numero fijo de la condicion del if, por uno que se
														// adecue al tamaño del parametro que recibe
				numeros[i] = (int) (Math.random() * 381) + 20;
				System.out.print(numeros[i] + " ");// System.out.print, falto coloar el out
			}
			System.out.println();//Agregamos un salto de linea vacio, para dar una mejor vicibilidad en consola
			
			
		}

	

}

