package EjerciciosOperadores;

public class Operador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int anios = 5;
		
		boolean esInfante = true; 
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque " + costoInfante);

		
		//or
		
		String cliente = "cliente123";
		String credenciales = "anabafernandez123";
				
		boolean credencialCorrecta = cliente.equals("cliente123")&& credenciales.equals("anabafernandez123");
		
		System.out.println("Las creden si son validas" + credencialCorrecta);
		
		// or
		
		double costoPasaje = 380.50;
		int edad  = 58;
		boolean credenInapam =false; 
		
		boolean descuentoAdultoMayor = edad >= 60 || credenInapam;
		
		System.out.println("Tiene descuento? " + costoPasaje);
		
		//! not 
		
		
		boolean asientosDisponibles = true;
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		
		
		
		System.out.println("Tenemos asientos con descuento " + asientosConDescuento);
		
		
		package ejecicioAutobus;

		public class autobusOaxaca {

			public static void main(String[] args) {
				
				String destino = "Oaxaca";
				double costoPasaje = 350;	
				int asientosTotal = 62;
				int asientosInapam = 4;
				int asientosEstudiante = 6;
				
				// Datos de pasajero 
				int edad = 35;
				boolean credenInapam=false;
				boolean credencialEstudiante=true;
				
				
				//Evaluar deescuentos
				boolean descuentoInapam = edad >= 60 && credenInapam ;
				boolean descuentoEstudiante = edad < 60 && credencialEstudiante;
				
				
				System.out.println("El destino es "+destino);
				System.out.println("El costo del pasaje entero es " + costoPasaje);
				System.out.println("La capacidad total de pasajeros es de " + asientosTotal + " pesonas");
				
				//DecimalFormat  = new DecimalFormat("#.##");
				
				//Aplicar a deescuentos
				if (descuentoInapam && (asientosInapam >=1)) {
					System.out.println("El descuento de INAPAM es del 35%");
					System.out.println(String.format("El total a pagar es %.2f",(costoPasaje*0.65)));
					System.out.println("Asientos INAPAM disponibles: "+(asientosInapam-1));
					
				}
				if (descuentoEstudiante && (asientosEstudiante >=1)) {
					System.out.println("El descuento de estudiante es del 30%");
					System.out.println(String.format("El total a pagar es %.2f",(costoPasaje*0.7)));
					System.out.println("Asientos para estudiantes disponibles: "+(asientosEstudiante-1));
				}
				
			
			
	}

}