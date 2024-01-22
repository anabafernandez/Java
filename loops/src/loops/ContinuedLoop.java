package loops;

public class ContinuedLoop {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		//Con continue, ejjecutando la sentencia condicional, pero cumpliendo la condicion del bucle for.
		
		for (int cliente = 1; cliente <= 20; cliente ++) {
			if(cliente == 5) {
				System.out.println("Cliente numero " + cliente "! Ganaste");
				continue;
		}
			
		}

	}

}
