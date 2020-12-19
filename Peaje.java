
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Peaje extends Vehiculo{
	
	private int valorPeaje;
	private int Turno;
	final static String ruta = "C:\\camion1.txt";
	
	
	
	public Peaje(int ejes, int toneladas, String marca,int patente, int valorPeaje, int turno, int tipo) {
		super(ejes,toneladas,marca,patente, tipo);
		this.valorPeaje = valorPeaje;
		this.Turno = turno;
	}
	public Peaje() {
	 
	}
	 
public static Map<Integer, Vehiculo> GuardarDatosHashmap(){
        
		Vehiculo objetos[] = new Vehiculo[10]; 
        Map<Integer, Vehiculo> mapFileContents = new HashMap<Integer, Vehiculo>();
        BufferedReader br = null;
        
        try{
            
            //Crea objecto File
            File file = new File(ruta);
            
            //Crea el BufferedReader
            br = new BufferedReader( new FileReader(file) );
            
            String line = "";
           
           
         
            
            while ( (line = br.readLine()) != null){
            	
             
                //Guardar en el arreglo parts todo lo que esté antes del ;
                String[] parts = line.split(";");
                
                //Guarda en las variables lo que lee del txt
                String marca = parts[0].trim();
                Integer ejes = Integer.parseInt( parts[1].trim());
                Integer toneladas = Integer.parseInt( parts[2].trim() );
                Integer turno  = Integer.parseInt( parts[3].trim() );
                Integer patente = Integer.parseInt(parts[4].trim());
                Integer tipo = Integer.parseInt(parts[5].trim());
              
               
                //agrega patente, atributos en HashMap si no están vacías
                   
               if(tipo == 1 ) {
            	    Camion c = new Camion(ejes, toneladas, marca, patente, tipo);
            	    mapFileContents.put(patente, c);
            	    System.out.println("Camion => " + mapFileContents.get(patente));
            	 
               }else if
            	   (tipo == 2) {
            		   Auto a = new Auto(tipo, toneladas, marca, patente, tipo);
            		   
            		   mapFileContents.put(patente, a);
            		   System.out.println("Auto => " + mapFileContents.get(patente));
            		   
            	   }else if(tipo == 3) {
            			   Motocicleta m = new Motocicleta(ejes, toneladas, marca, patente, tipo);
            			   mapFileContents.put(patente, m);
            			   System.out.println("Motocicleta => " + mapFileContents.get(patente));
            	   }
            }
       
               
            
                         
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
            //Cierre de BufferedReader
            if(br != null){
                try { 
                    br.close(); 
                }catch(Exception e){};
            }
        } 
        
        
        
        return mapFileContents;
        
    }
@Override
public int CalcularPeaje(int ejes , int toneladas) {
	// TODO Auto-generated method stub
	return 0;
}


	public void Turnos(  int turno ) {
		Peaje a = new Peaje(); 
		System.out.println("\n");
		System.out.println("Vehiculos del turno "+ turno +":");
		for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
	        Valor variable = (Valor) entry.getValue();
			if(variable.getTurno() == turno) {
				
				System.out.println( entry.getKey() + " => " + variable.getMarca() + " " + variable.getTurno() );
				
				
		    }
			
	    }
			
			
	}
		
		public void mostrar() {
		
		}
		
}
			
		
