import java.util.*;
import java.util.Map.Entry;

//MAIN DEL PROYECTO

public class Cabina {
	public static void main(String arg[]){
		
		//Creamos un objeto peaje para enviar los parámetros iniciales 
		Peaje peaje1 = new Peaje();
		peaje1.Turnos(3);
		peaje1.mostrarRecaudacion(1);
		peaje1.GuardarDatosHashmap();

		
	}	
	
}
