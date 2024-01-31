package personas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("nombre","apellidos",14,"algo@gmail.com");
		Pattern pattern = Pattern.compile("@gmail.com");
		Matcher matcher = pattern.matcher(persona.getCorreo());
		boolean matchFound = matcher.find();
		System.out.println(matchFound);
		
	}

}
