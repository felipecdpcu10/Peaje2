
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


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
	 
public static Map<Integer, Object> GuardarDatosHashmap(){
        

        Map<Integer, Object> mapFileContents = new HashMap<Integer, Object>();
        BufferedReader br = null;
        
        try{
            
            //Crea objecto File
            File file = new File(ruta);
            
            //Crea el BufferedReader
            br = new BufferedReader( new FileReader(file) );
            
            String line = null;
           
            //lee el txt linea por linea
            while ( (line = br.readLine()) != null ){
                
                //Guardar en el arreglo parts todo lo que esté antes del ;
                String[] parts = line.split(";");
                
                //Guarda en las variables lo que lee del txt
                String marca = parts[0].trim();
                Integer ejes = Integer.parseInt( parts[1].trim());
                Integer toneladas = Integer.parseInt( parts[2].trim() );
                Integer turno  = Integer.parseInt( parts[3].trim() );
                Integer patente = Integer.parseInt(parts[4].trim());
                Integer tipo = Integer.parseInt(parts[5].trim());
                Valor atributos = new Valor(ejes,toneladas, marca, patente, turno ,tipo);
                
                
               
                //agrega patente, atributos en HashMap si no están vacías
                if( !patente.equals("") && !atributos.equals(null) )
                    mapFileContents.put(patente,atributos);
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
		for(Map.Entry<Integer, Object> entry : a.GuardarDatosHashmap().entrySet()){
	        Valor variable = (Valor) entry.getValue();
			if(variable.getTurno() == turno) {
				
				System.out.println( entry.getKey() + " => " + variable.getMarca() + " " + variable.getTurno() );
				
		    }
			
	    }
			
			
	}

}
		
