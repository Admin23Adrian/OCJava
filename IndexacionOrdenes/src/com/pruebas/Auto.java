package com.pruebas;

public class Auto {
	
	// ATRIBUTOS
	String marca;
	String color;
	String modelo;
	int velocidad;
	
	// CONSTRUCTOR //
	/*Auto deprecado por Adrian Alarcon el dia 20-4-2022 porque es poco seguro para el negocio
	 * @deprecated
	 */
	@Deprecated
	Auto(){}
	Auto(String marca, String modelo, String color) {
		// Referencia ambigua -> A los atributos de este objeto voy a asignar cada uno de los parametros
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	//METODOS
	void acelerar() {
		//velocidad += 10;
		//if (velocidad > 100) velocidad = 100;
		acelerar(10);
	}
	
	// metodo de acelerar sobrecargado
	void acelerar(int kilometros) {
		velocidad += kilometros;
		if(velocidad > 100) velocidad = 100;
	}
	
	void frenar() {
		velocidad -= 10;
	}
	
}
