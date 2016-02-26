package Excepciones;

public class PersonaNoEncontradaException extends Exception{
	
	String nombre;
	
	@Override
	
	
	public String getMessage()
	{
		return nombre + "no es un ususato del sistema";
	}
	

}
