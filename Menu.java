import java.util.Scanner;

public class Menu {

	public static void main(String arg[]){
		int opc = 0 ;
		System.out.println("Bienvenido al programa");
		 System.out.println("1 : Acceder al turno 1: ");
		 System.out.println("2 : Acceder al turno 2: ");
		 System.out.println("3 : Acceder al turno 3: ");
		 System.out.println("4 : Mostrar Estadistica mes/año: ");
		 System.out.println("5 : Finalizar programa**");
		 Scanner teclado = new Scanner(System.in);
		 opc = teclado.nextInt();  //Lectura desde el teclado
		 
		switch (opc) {
		case 1 : 
		
			int opcion1=0;
			do {
		    //Se pregunta por lo que se quiera realizar 
			System.out.println("1 : Ver recaudación Total ");
			System.out.println("2 : Cerrar turno ");
			Scanner teclado1 = new Scanner(System.in);
			//Recivo de opcion ingresada
			opcion1 = teclado1.nextInt();
			if(opcion1 == 1) {
				//Impresion en pantalla de la suma total recaudado en el turno 1 
				System.out.println("\n    Recaudacion Turno 1:  "+SumaTotal);
			}else {
				if(opcion1 == 2) {
					System.out.println("Recaudacion total : "+SumaTotal);
					int tempTotal=SumaTotal; 
					
					SumaTotal = 0; 
					
					//Si se cierra el turno , se asigna la Suma total = 0 
				}
			}
			
		}while(opcion1 != 2);
			
			//System.out.println("\n    Recaudacion Turno 1:  "+SumaTotal);
		break;
			//Se repite el proceso con cada turno restante ( 2 y 3 ) 
		case 2: 
			int SumaTotal2 = 0;
			for(int i = 0 ; i < ListaTodos.size() ; i++) {
				
				if(ListaTodos.get(i).getTurno()==2) {
					System.out.println("Camion del turno 2: "+ListaTodos.get(i).getMarca());
					System.out.println("Valor del peaje : "+ListaTodos.get(i).getValorPeaje());
					SumaTotal2 = ListaTodos.get(i).getValorPeaje()+ SumaTotal2;	
					
				}
			}
			
			
			int opcion2=0;
			do {
			System.out.println("1 : Ver recaudación Total ");
			System.out.println("2 : Cerrar turno ");
			Scanner teclado2 = new Scanner(System.in);
			opcion2 = teclado2.nextInt();
			if(opcion2 == 1) {
				System.out.println("\n    Recaudacion Turno 2:  "+SumaTotal2);
			}else {
				if(opcion2 == 2) {
					System.out.println("Recaudacion total :"+SumaTotal2);
					SumaTotal2 = 0; 
				}
			}
			
		}while(opcion2 != 2);
			
			
		break;
		case 3: 
			int SumaTotal3 = 0;
			for(int i = 0 ; i < ListaTodos.size() ; i++) {
				
				if(ListaTodos.get(i).getTurno()==3) {
					System.out.println("Camion del turno 3 : "+ListaTodos.get(i).getMarca());
					System.out.println("Valor del peaje : "+ListaTodos.get(i).getValorPeaje());
					SumaTotal3 = ListaTodos.get(i).getValorPeaje()+ SumaTotal3;	
				}
			}
			
			int opcion=0;
			do {
			System.out.println("1 : Ver recaudación Total ");
			System.out.println("2 : Cerrar turno ");
			Scanner teclado3 = new Scanner(System.in);
			opcion = teclado3.nextInt();
			if(opcion == 1) {
				System.out.println("\n    Recaudacion Turno 3:  "+SumaTotal3);
			}else {
				if(opcion == 2) {
					System.out.println("Recaudacion Total :" +SumaTotal3);
					SumaTotal3 = 0; 
				}
			}
			
		}while(opcion != 2);
		

		}

		
	     } while(opc != 4);
	return 0;
	}
		
		
		
		
}
}
