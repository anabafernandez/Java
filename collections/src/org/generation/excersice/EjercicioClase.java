package org.generation.excersice;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioClase {

    public static void main(String[] args) {
      //* Modificar nuestro programa para permitir salir con las palabras 'Salir' o 'salir'.
	//* Agreguar la opción que permite que el usuario elimine un estudiante después de haberlo agregado y muestre la lista actualizada después de la eliminación (.remove();).
        ArrayList<String> estudiantes = new ArrayList<String>();

      
        try (Scanner scanner = new Scanner(System.in)) {
            
            String nombreEstudiante;

            do {
                System.out.println("Ingresa el nombre del estudiante. Escribe 'salir' para finalizar o 'eliminar' para eliminar un estudiante:");
                nombreEstudiante = scanner.nextLine();

                if (nombreEstudiante.equalsIgnoreCase("salir")) {
                    break; 
                } else if (nombreEstudiante.equalsIgnoreCase("eliminar")) {
                  
                    System.out.println("** Lista de estudiantes:");
                    for (String estudiante : estudiantes) {
                        System.out.println(estudiante);
                    }

                   
                    System.out.println("Ingresa el nombre del estudiante que deseas eliminar:");
                    String estudianteEliminar = scanner.nextLine();

                    if (estudiantes.remove(estudianteEliminar)) {
                        System.out.println("Estudiante eliminado exitosamente.");
                    } else {
                        System.out.println("Estudiante no encontrado en la lista.");
                    }
                } else {
                   
                    estudiantes.add(nombreEstudiante);
                }

            } while (true);
        }

       
        System.out.println("** Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}