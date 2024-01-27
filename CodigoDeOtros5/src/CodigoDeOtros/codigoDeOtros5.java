package CodigoDeOtros;
/*
 * Ana Karen Bailón Fernández
 * 5
 * 5
 * 5
 * 5
 * 5
 * 
 * */

import java.util.Scanner;

public class codigoDeOtros5 {

	public static void main(String[]args) {
		
		    Scanner scanner = new Scanner(System.in);//falta el sis in
		    System.out.print("Introduzca un número: "); // la comilla estaba mal
		    int ni = scanner.nextInt();
		    int c = ni; //Se agrego parse Int
		    
		    int afo = 0;
		    int noAfo = 0;
		    
		    while (c > 0) {
			  int digito = c % 10; //reemplace por c
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++; 
				ni /= 10; //subimos el ni para que no fuera infinito
		      } else {
				noAfo++;
			  
			  ni /= 10;
		    }
		    if (afo > noAfo) {
		      System.out.println("El " + c + " es un número afortunado."); //falta una t
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		    }
		    
		    scanner.close();//cerramos scanner
		    
		  }
		  
	}
	}// se agrego una llavesita