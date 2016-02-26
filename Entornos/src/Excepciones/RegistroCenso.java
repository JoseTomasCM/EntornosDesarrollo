package Excepciones;

import java.util.Scanner;

public class RegistroCenso {
	
	int contador =0;
	
  static protected String [] persona;
	
	

	public static void main(String[]args){
		
	
		
		
		
		String[] personas = new String [10];
		int opcion;
		
		do{
			mostrarOpciones();
			opcion = leerOpcion();
			if(opcion ==1) registraPersona();
			if (opcion ==2) buscaPersona();
		  }
		
		while (opcion !=3);
	}

	

	
		

	private static void mostrarOpciones() 
	{
		System.out.println("Tiene varias opciones: ");
				
	}

	
	private static int leerOpcion()
		{

		Scanner sc = new Scanner(System.in);
				String leerOpcion = sc.nextLine();
			
			return leerOpcion();
			
		}


	private static void registraPersona()
		{
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca su nombre, por favor :");
		
		String nombre = sc.nextLine();
			
		
	
		}


	
	public static void buscaPersona(){
	
	Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		for(int i=0;i<persona.length;i++)
		{
					if(persona[i].compareTo(nombre)==0)
					{
						System.out.println(nombre+"esta registrado en el censo");
						return ;
					}
		}
	}
	
	PersonaNoEncontradaException e = new PersonaNoEncontradaException();
	e.nombre = nombre;
	throw e;
	

	
}
