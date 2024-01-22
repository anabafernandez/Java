package org.generation.excersice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Programa que permite que un usuario agregue nombres de matriculados en una universidad, posteriormente muestra la lista de los estudiantes agregados
 * -- Requerimentos:
 * 	>Utilizar ArrayList (de tipo string)
 *  >Scanner para interactuar con el usuario
 *  > Ciclo loop para permitir que se agreguen varios estudiantes (do-while)
 *  >Mostrar lista de estudio (for=each)
 *  >
 * 
 */

public class SistemaEscolar {

    public static void main(String[] args) {
        // Inicializar un ArrayList para guardar a los estudiantes
        ArrayList<String> estudiantes = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        try {
            // Loop para permitir agregar usuarios
            String nombreEstudiante;
            
        	//Si no quiero que se muestre la palabra "salir" voy a agregar una nueva condional.

            do {
                System.out.println("Ingresa el nombre del estudiante. Escribe 'salir' para finalizar");
                nombreEstudiante = scanner.nextLine(); // Invocado de manera local
                estudiantes.add(nombreEstudiante);

            } while (!nombreEstudiante.equalsIgnoreCase("salir")); // Siempre que no se escriba "salir", el loop se sigue ejecutando
        } finally {
            scanner.close(); // Cerrar el scanner al final del bloque try
        }

        // Mostrar listas de estudiantes (for-each)
        System.out.println("** Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            // Si no quiero que se muestre la palabra 'salir' voy a agregar una condicional
            if (!estudiante.equalsIgnoreCase("salir")) {
                System.out.println(estudiante);
            }
        }
    }
}



