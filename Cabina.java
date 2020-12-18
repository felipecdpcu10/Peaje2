
import java.util.ArrayList;
import java.util.Map;

//MAIN DEL PROYECTO

public class Cabina {
	public static void main(String arg[]){
	
		//Creamos un objeto peaje para enviar los parámetros iniciales 
		Peaje peaje1 = new Peaje();

		peaje1.GuardarDatosHashmap();
		
		for(Map.Entry<Integer, Object> entry : peaje1.GuardarDatosHashmap().entrySet()){
	        Valor variable = (Valor) entry.getValue();
	      //  if(variable.getTipo()==1) {
	        	
	        //}
			System.out.println( entry.getKey() + " => " + variable.getMarca() + " " + variable.getEjes() + " "  + variable.getToneladas() + " " + variable.getTurno() + " " + variable.getPatente() + " " + variable.getTipo());
			
		}
			
		
		peaje1.Turnos(2);
		
		
			//System.out.println(peaje1.toString());
		
		
	

	}	
	
}
