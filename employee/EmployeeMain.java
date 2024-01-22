
public class EmployeeMain {

	public static void main(String[] args) {
		//Instanciar los objetos
		Employee Daniel = new Employee();
		Employee Abigail = new Employee();
		Employee Arturo = new Employee();
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		
		//Aplicando metodos definidos previamente (trabajar, calcularSalario, capacitarse, infoGeneral
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		
		//Utilizar informacion especializada
		//Usando getter
		
		System.out.println(Daniel.getNombre("") + Daniel.getApellido() + "Ocupa el puesto de" + Daniel.getPuesto());
		
		Arturo.setSalasrio(97897834875);
		Arturo.calcularSalario();
		
		
		
	}

}
