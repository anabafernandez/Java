package org.generation.letras;

public class Letras {

	public static void main(String[] args) {
		//Instanciar objetos (Letras y contador)
		Letras letras = new Letras();
		letras.mostrarMensaje("escribe un texto y te mostraré el numero de vocales, consonantes, simbolos y numeros");
		String palabra = letras.leerEntrada(); //Guardamos el texto introducido por el usuario en una variable
		
		//Invocar los metodos que me permitan contar los caracteres
		
		Contador contador = new Contador ();
		
		int totalVocales = contador.contarVocales(palabra);
		System.out.prinln("Hay + totalVocales + "vocales");
	
		int totalVocales = contador.contarVocales(palabra);
		System.out.prinln("Hay + totalNumeros + "vocales");
	
		
		int totalVocales = contador.contarVocales(palabra);
		System.out.prinln("Hay + totalConsonantes + "vocales");"
				
		int totalVocales = contador.contarVocales(palabra);
		System.out.prinln("Hay + totalVariables + "vocales");
	
	)
	
	}

}
