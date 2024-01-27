package EjerciciosLiveCoding;
/*
 * Ana Karen Bailón Fernández
 * 5
 * 5
 * 5
 * 5
 * 5
 * 
 * */
import java.util.*;
public class liveCoding3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Frutas{
            private int mangos;
            private int naranjas;
            
            public Frutas(int mangos, int naranjas) {
                this.mangos = mangos;
                this.naranjas = naranjas;
            
            }
            
            private int calcularCajas() {
                int temp; 
                int a = this.mangos;
                int b = this.naranjas;
                while (b != 0) {
                    temp = b;
                    b = a % b;
                    a = temp;
                }
                
                return a;
            }
            
            public void imprimir() {
                int cajas = calcularCajas();
                int mangosCajita = mangos / cajas;
                int naranjasCajita = naranjas / cajas;
                
                System.out.println("El número de cajas es: " + cajas + " El número de mangos en una caja es: " + naranjasCajita +" El número de naranjas en una caja es: "+ mangosCajita);
                
            }
            
        }//Frutas
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduce el numero de Mangos");
        int mangos = scanner.nextInt();
        System.out.println("introduce el numero de Naranjas");
        int naranjas = scanner.nextInt();
        
        Frutas frutas = new Frutas(mangos, naranjas);
        
        frutas.imprimir();
        
        scanner.close();
    }

}
