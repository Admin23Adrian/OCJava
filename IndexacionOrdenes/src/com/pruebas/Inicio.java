package com.pruebas;

public class Inicio {

	public static void main(String[] args) {
		
		/*
		
		METODOS CONSTRUCTORES:
			 - Los metodos constructores inicializan un objeto.
			 - No tienen devolucion/retorno de valor
			 - Pueden recibir parametros
			 - Tienen el mismo nombre que la clase
			 - Si la clase no tiene un constructor, JAVA agrega en tiempo de compilacion un constructor vacio
			 - Con los constructores aseguramos un estado minimo del objeto
		 
		*/
		
		Auto auto2 = new Auto(); 		// instanciamos a la clase Auto y creamos un objeto del tipo Auto
		// Asignamos valores a los atributos
		
		// Llamamos al metodo acelerar
		auto2.acelerar();
		auto2.acelerar();
		
		// Aceleramos 10 veces con un simple ciclo for
		for(int a = 0; a < 10; a++) auto2.acelerar();
		
		// Frenamos el auto
		auto2.frenar();
		
		System.out.println("------ Auto 2 ------\n");
		System.out.println("Marca: " + auto2.marca + ". Modelo: " + auto2.modelo + ". Color: " + auto2.color);
		System.out.println("Actualmente acelero a " + auto2.velocidad + " km/h.\n");
		
		// --- AUTO 3 --- /7
		Auto auto3a = new Auto();
		Auto auto3 = new Auto("VW", "GOL", "Blanco");
		auto3.acelerar();
		auto3.acelerar(120);
		auto3.frenar();
		
		System.out.println("------ Auto 3 ------\n");
		System.out.println("Marca: " + auto3.marca + ". Modelo: " + auto3.modelo + ". Color: " + auto3.color);
		System.out.println("Actualmente acelero a " + auto3.velocidad + " km/h.");
		
		String cadena = "O554435.pdf";
		System.out.println(cadena.substring(1, 7));
	}

}
