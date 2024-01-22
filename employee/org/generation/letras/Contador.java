package org.generation.letras;
/*Contador ; metodos para contar vocales, consonantes, numero y caracteres
 * Necesitamos establecer dos grupos de métodos;
 * Grupo 1 ; métodos booleanos para determinar si corresponde o no
 * Grupo 2 ; métodos que van a devolver el conteo de dichos simbolos
 * */
public class Contador {
	
	//Grupo 1
		public boolean esVocal(char caracter) {
			return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');
		}
		
		public boolean esNumero(char caracter) {
			//casting para poder utilizar la tabla ASCII (48-57)
			short codigoAscii = (short)caracter;
			return codigoAscii >= 48 && codigoAscii <= 57;
		}
		
		public boolean esConsonante(char caracter) {
			//casting para poder utilizar la tabla ASCII (65-90 o 97-122), con excepción de vocales (!)
			short codigoAscii = (short)caracter;
			return ((codigoAscii >= 65 && codigoAscii <= 90) || (codigoAscii >= 97 && codigoAscii <= 122)) && !esVocal(caracter);
		}
		
		public boolean esSimbolo(char caracter) {
			return !(esVocal(caracter) || esNumero(caracter) || esConsonante(caracter));
		}

}
