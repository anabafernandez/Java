package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Ciclo Do While, evalua la expresión en la parte inferior del ciclo
		 * Por tanto, las declaraciones dentro del bloque "do" siempre se ejecutgan al menos una vez
		 * 
		 */
		
		//Cuenta del 1 a 20
		int cuenta = 1; 
		do {
			System.out.println("cuenta " +cuenta);
	cuenta++;
	
		}while(cuenta <0); //Output 1 ya se ejecuto al menos 1 vez
	}
		

	}

}
