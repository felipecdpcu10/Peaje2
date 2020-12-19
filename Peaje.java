import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Peaje extends Vehiculo{
	
	private int valorPeaje;
	final static String ruta = "C:\\Users\\EQUIPO\\Desktop\\camion1.txt";
	 static Map<Integer, Vehiculo> mapFileContents = new HashMap<Integer, Vehiculo>();
	
	public  Peaje( Map<Integer, Vehiculo> mapFileContents) {
		this.mapFileContents = mapFileContents; 
	}
	
	public Peaje(String marca, int ejes, int toneladas,int turno, int patente, int tipo, int mes , int año ) {
		super(marca , ejes, toneladas, turno, patente , tipo, mes, año);
		this.valorPeaje = valorPeaje;
	
	}
	public Peaje() {
	 
	}
	 
		public static Map<Integer, Vehiculo> GuardarDatosHashmap( ){
        
		Vehiculo objetos[] = new Vehiculo[10]; 
       // Map<Integer, Vehiculo> mapFileContents = new HashMap<Integer, Vehiculo>();
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
                Integer mes = Integer.parseInt(parts[6].trim());
                Integer año = Integer.parseInt(parts[7].trim());
               
                //agrega patente, atributos en HashMap si no están vacías
                   
               if(tipo == 1 ) {
            	    Camion c = new Camion(marca , ejes, toneladas, turno, patente , tipo, mes, año);
            	    mapFileContents.put(patente, c);
            	    System.out.println("Camion => " + mapFileContents.get(patente));
            	 
               }else if
            	   (tipo == 2) {
            		   Auto a = new Auto(marca, ejes, toneladas, turno, patente, tipo, mes, año);
            		   
            		   mapFileContents.put(patente, a);
            		  System.out.println("Auto => " + mapFileContents.get(patente));
            		   
            	   }else if(tipo == 3) {
            			   Motocicleta m = new Motocicleta(marca, ejes, toneladas, turno, patente, tipo, mes, año);
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


	public void Turnos( int turno ) {
		Peaje a = new Peaje(); 
		System.out.println("\n");
		System.out.println("Vehiculos del turno "+ turno +":");
		for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
	    
			if(entry.getValue().getturno() == turno) {
				
				System.out.println( entry.getKey() + " => " + entry.getValue().getMarca() + " " + entry.getValue().getturno());		
		    }
	    }	
	}

	
		public void mostrarRecaudacion(int turno  ) {
			Peaje a = new Peaje(); 
			int sumaTotal=0; 
			int sumaTotal1=0; 
			int sumaTotal2=0; 
			int sumaTotal3=0; 
			for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
				
				Auto a1 = new Auto();
				Camion c1 = new Camion();
				Motocicleta m1 = new Motocicleta();
				
				//System.out.println(entry.getValue().getturno());
				
				if(entry.getValue().getturno() == turno) {
					
					if(entry.getValue().getTipo()== 1 ) { //Camion
						
						sumaTotal1 = sumaTotal1 + c1.CalcularPeaje(entry.getValue().getEjes(), entry.getValue().getToneladas()) ;
						//System.out.println(sumaTotal1);
					}else if(entry.getValue().getTipo()==2) { //Auto
						sumaTotal2 = a1.CalcularPeaje() + sumaTotal2; 
						//System.out.println(sumaTotal2);
					}else if(entry.getValue().getTipo()==3) {//Motocicleta 
						sumaTotal3 = m1.CalcularPeaje() + sumaTotal3;
						//System.out.println(sumaTotal3);
					}
				}
			}
			int autos=sumaTotal2/4400;
			System.out.println("suma total: "+sumaTotal2+" han pasado "+autos+" autos");
			
				int motos= sumaTotal3/4400;
				System.out.println("SUMA TOTAL: "+sumaTotal3+" han pasado "+motos+" motos");
				
				//System.out.println(sumaTotal2);
			
			// sumaTotal= (sumaTotal1 + sumaTotal2 + sumaTotal3) ; 
			//System.out.println("Suma Total turno "+ turno + " es : $"+sumaTotal);
		}
}

		
