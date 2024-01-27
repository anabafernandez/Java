package org.generation.figuras;

/************Clase Circulo ***********/
public class Circulo extends Figura {
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
	
	//Instanciando un objeto de tipo rectangulo
	public static void main (string{[] args) {
		Rectangulo rectangulo = new Rectangulo(5,3) }
		//Instanciando un objeto de tipo Rectangulo
		public static void main(String[] args) {
			Rectangulo rectangulo = new Rectangulo(5, 3);
			System.out.println("El área del rectángulo es " + rectangulo.calcularArea() + " metros cuadrados");
			
			rectangulo.infoFigura();
		};
	
}