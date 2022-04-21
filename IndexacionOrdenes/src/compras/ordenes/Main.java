package compras.ordenes;


public class Main {
	
	// ARRANQUE DE LA APLICACION
	public static void main(String[] args) {
		
		String carpeta = "\\\\SCZ-G1-FS\\Scienza_fs\\Gerencia_Comercial\\Administracion_Ventas\\ventas\\indexacionTS\\No_procesados_R";
		String carpetaError = "\\\\SCZ-G1-FS\\Scienza_fs\\Gerencia_Comercial\\Administracion_Ventas\\ventas\\indexacionTS\\Error";
		
		
		
		// Se crea el objeto de la clase Archivos
		Archivos archivos = new Archivos(carpeta);
		String[] pdfs = archivos.listarArchivos();
		
		for(String pdf: pdfs) {
			
			if (archivos.validarFormato(pdf) == false) {
				System.out.println(pdf + "--> Error en formato. Se mueve a carpeta error.");
				archivos.moverArchivo(pdf, carpetaError);
			
			} else {
				System.out.println("Archivo " + pdf + " validado.");
				System.out.println("Nro Pedido: " + archivos.obtenerNroPedido(pdf));
				System.out.println(" ----------------------------- ");
			}
		}
	}

}