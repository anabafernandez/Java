package org.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {

	public static void main(String[] args) {
		//*************************ARRAYS********//
		String[] names = {"Jonathan", "eli", "Ruben", "Marco", "Martín", "Lucero"};
		
		//Imprimiendo Arrays
		System.out.println(Arrays.toString(names));
		
		int [] edades = {12, 3, 25, 55, 69,41,29};
		System.out.print(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre de la lista es" + name1);
		int edad1 = edades [2];
		System.out.println("La edad de " + name1 + " es de " + edad1 + " anios");
		
		//Obtener la longitud del Array
		int longitudNames = names.length;
		System.out.println("El Array names tiene " + "longitudNames" + "elementos");
		
		//Obtener el ultimo elemento
		//String ultimoElemento = names[names.lenght - 1]; La longitud ya vive en la variable "longitudNames"
		
		String ultimoElemento = names[names.length - 1]; //La longitud NO vive en una variable
		System.out.print("El ultimo elemento del Array Name es" + ultimoElemento); //Lucero
		
		//Mostrar cada elemento utilizando forEach
		for (String name: names) {
			System.out.println(name);
			
		}
		//******************ArrayLIst **************//
		//ArrayList es un array que puede cambiar de tamanio, es una coleccion de java que representa la estructura de datos de arrays
		//Permite elementos duplicados y recibe varios metodos para su manipulacion.
		ArrayList<String> films = new ArrayList <String>();
		
		ArrayList<Integer> matricula = new ArrayList<>();
		
		//Agregar elementos
		films.add("Inceptions");
		films.add("Se7en");
		films.add("The Shining");
		films.add("Pulp fiction");
		films.add("Mr nobody");
		films.add("The shutter island");
		films.add("Ready Player One");
		
		System.out.print(films);
		
		//Obtener un elemento: name.get(index);
		String film1 = films.get(0);
		System.out.println("La primer pelicula es " + film1);
		
		//Modificar un elemento : name.set(index, newValue)
		String film3 = films.set(3, "Memento");
		String film3Get = films.get(3);
		System.out.println(film3get);
		
		//Conocer el tama;o del ArrayList:
		int sizeFilms = films.size();
		System.out.println("El tamanio del ArrayList films es de " + sizeFilms + "Elementos");
		
		//Agregar un elem ento y despuies eliminarlo: name.remove(index);
		films.add("The fountain");
		System.out.println(films);
		
		System.out.println("***FIlms en Lista***");
		for (String film : films) {
			System.out.println(film);
		}
		
		matricula.add(1234);
		characters.add("A");
		
		System.out.println(matricula);
		System.out.println(characters);
		
	}

}
