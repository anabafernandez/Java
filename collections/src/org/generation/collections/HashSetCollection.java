package org.generation.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// HashSet es una clase de collections donde cada elemento es unico, es decir, no se repiten, 
		HashSet<String> animals = new HashSet <String>();
		
		animals.add("");
		animals.add("");
		animals.add("");
		animals.add("");
		animals.add("");
		animals.add("");
		animals.add("");
		animals.add("");
		
		//Imprimir el HashSet
		System.out.println(animals);
		
		//Conocer si un elemento se encuentra dentro del Set; contains ();
		System.out.println(animals.contains("Capibara"));
		
		//Eliminar un elemento : remove ();
		animals.remove("Cabra"); //Elimino
		System.out.println(animals); //Imprimo el set sin el elemento eliminado
		
		animals.addAll(Arrays.asList("Perrito", "Gatito", "Osito"));
		System.out.println(animals);
		/*
		 * La clase HashSet no va a garanizar que los elementos se muestran segun el orden establecido ya que 
		 * busca eficientar la busqueda y recuperacion de los elementos.
		 * utiliza tablas hash para almacenar los elementos y mostrarlos al usuario
		 */
		//Limpiar el HashSet; .clear
		animals.clear();
		System.out.println(animals);
	}

}
