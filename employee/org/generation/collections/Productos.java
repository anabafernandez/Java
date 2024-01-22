package org.generation.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Productos {

	public static void main(String[] args) {
		Map<Integer, String> productos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Nombre: ");
                    productos.put(id, scanner.next());
                    break;
                case 2:
                    System.out.println("Lista de productos: " + productos);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

		
		

	}


