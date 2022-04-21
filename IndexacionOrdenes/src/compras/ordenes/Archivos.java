package compras.ordenes;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Archivos {
	
	// Atributos
	/*
	 * La carpeta donde estan alojados los PDFs.
	 */
	private String carpetaAIterar;
	private String nroPedido;
	
	// Constructor
	Archivos(String carpetaAIterar){
		this.carpetaAIterar = carpetaAIterar;
	}
	
	// ---- METODOS ----
	
	/**
	 * Metodo para listar los archivos de una carpeta*/
	public String[] listarArchivos() {
		String[] documentos;
		File file = new File(carpetaAIterar);
		return documentos = file.list(new FiltroArchivos());
	}
	
	/**
	 * Metodo para validar si el formato a seguir es correcto.
	 * Ej correcto: Oxxxxxx.pdf.*/
	public boolean validarFormato(String archivo) {
		boolean validarArch = false;
		if(archivo.charAt(0) == 'R') {
			validarArch = true;
			return validarArch;
		} else {
			return validarArch;
		}
	}
	
	/**
	 * Metodo empleado para mover los archivos 
	 */
	public boolean moverArchivo(String pdf, String dest) {
		File src = new File(carpetaAIterar + "\\" + pdf);
		File dst = new File(dest + "\\" + pdf);
		
		return src.renameTo(dst);
	}
	
	/**
	 * Metodo que permite obtener el nro de pedido a partir del nombre establecido como regla de un PDF de OC.
	 * @param nomPdf
	 * @return
	 */
	public String obtenerNroPedido(String nomPdf) {
		return nroPedido = nomPdf.substring(1, 8);
	}
}


// FilenameFilter es una interfaz y debe ser implementada en alguna clase para poder utilizar el metodo endsWith
class FiltroArchivos implements FilenameFilter {
	
	@Override
	public boolean accept(File dir, String archivo) {
		return (archivo.endsWith(".pdf"));
	}
}