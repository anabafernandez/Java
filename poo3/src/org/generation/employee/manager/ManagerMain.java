package org.generation.employee.manager;

public class ManagerMain {

	public static void main(String[] args) {
		manager Fernanda = new manager ("Fernanda Ramos", 136, 45365, "Manager", 2);
		System.out.println(Fernanda);

		//Método calcular salario
		double salarioFer = Fernanda.getSalarioBase();
		System.out.println("Ël salario de " + Fernanda.getNombreCompleto() + " con posici'n de " + 
		Fernanda.getPuesto() + " es de $" + salarioFer + " pero posee una antiguedad de " + Fernanda.getAntiguedad()+ ""
				+)
	}

}
