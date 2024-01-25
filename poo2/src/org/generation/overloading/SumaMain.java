package org.generation.overloading;

import java.math.BigDecimal;

public class SumaMain {
	
	public static void main(String[] args) {
		
		//Invocamos el metodo de tipo static mediante su clase y no m ediante la instancia de un objeto
		
		int suma1 = Suma.sumar(8, 5);
		double suma2 = Suma.sumar(4.3, 6.26);
		
		double suma3 = Suma.sumar(4.3, 6.26);
		
		//Para imprimir BigDecimal, debemos guardar los valores de los parametros y asignarlos como argumentos de String de cada nueva instancia
		BigDecimal num1 = new BigDecimal ("4.3"); //Primer objeto instanciado
		BigDecimal num2 = new BigDecimal ("6.26"); //Segundo objeto instanciado
		
		//Mando a llamar los objetos instanciados de BigDecimal como los parametros del método
		BigDecimal Suma3 = Suma.sumar(num1, num2);
		
		
		System.out.println("La suma de enmteros me da " + suma1);
		System.out.println("La suma de decimales me da " + suma2);
	}

}

//BigDecimal 
