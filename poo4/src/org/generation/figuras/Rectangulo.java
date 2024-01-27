package org.generation.figuras;

/************Clase Rectangulo ***********/
public class Rectangulo extends Figura {
	//Atributos que se definen para Rectangulo y que podemos crear gracias a la abstracción
	private double base;
	private double altura;
	
	//Constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//Implementando el método abstracto de Figura. Una buena práctica es indicar que el método es heredado utiliznado la anotación @Override
	@Override
	public double calcularArea() {
		return base * altura;
	}
}
