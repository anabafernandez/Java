package org.generation.employee.Developer;

public class DeveloperMain {

	public static void main(String[] args) {
		Developer Ana ("Ana Fernandez", 419005, 18632, "Programador" "Java");
		System.out.println(Ana);
		
		Ana.calcularSalario(); //Método de superclase
		Ana.codear();//Método de la subclase
		
	}

	

}
