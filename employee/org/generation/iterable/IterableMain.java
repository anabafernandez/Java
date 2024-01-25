package iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableMain {

	public static void main(String[] args) {
		// Podemos iterar sobre una coleccion de 3 maneras:
		// 1.Iteracion mediante ciclo for-each
		List<String> nombres = new ArrayList<String>();
	
		nombres.addAll(Arrays.asList("Braulio","Fernanda", "Rodrigo", "Ruben"));
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		//2. Iterar mediante Iterator
		List<String> apellidos = new ArrayList <String>();
		
		apellidos.addAll(Arrays.asList("Aleman", "Garcia", "Martinez", "Cardoso", "Razo", "Ceja"));
		
		//Utilizar un nuevo Iterador y le vamos a pasar el metodo iterator() a nuestro ArrayList
		Iterator <String> iterador = apellidos.iterator();
		
		//Utilizando while, devuelve verdadero si la interación tiene más elementos, si no, se termina el ciclo.
		while(iterador.hasNext()) {
			String elemento = iterador.next();
			System.out.println(elemento);
			
		//3. Mediante forEach que toma una expresión Java lambda como parametro\
			System.out.println("****forEach con lambda****");
			List<String> animales = new ArrayList<String>()
;
		animales.addAll(Arrays.asList("Cuyo","Nahual", "Perro", "Gato", "Cebra", "Jirafa"));	
		
		animales.forEach((animal) -> {
			System.out.println(animal);
		
		});
		
		}
		
	}
		
	


