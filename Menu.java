import java.util.Scanner;
import java.util.Map; 
public class Menu {

	public static void main(String arg[]){
		int opc = 0 ;
		Peaje cliente = new Peaje(); 
		System.out.println("Bienvenido al programa");
		 System.out.println("1 : Acceder a un turno : ");
		 System.out.println("2 : Mostrar Estadistica mes/año: ");
		 System.out.println("3 : **Finalizar programa**");
		 Scanner teclado = new Scanner(System.in);
		 opc = teclado.nextInt();  //Lectura desde el teclado
		 
		 
		 switch (opc) {
		 
		 case 1 : // Acceder al turno  : 
			 System.out.println("Ingrese turno para acceder : ");
			  int opc1 = 0;
				opc1 = teclado.nextInt(); 
				do {
					
			  if(opc1 == 1) {
				  cliente.Turnos(opc1); 
				  System.out.println("1 ) Ver recaudacion total de turno 1: ");
				  System.out.println("2 ) Cerrar turno");
				  int opc2 = 0 ;
				  opc2 = teclado.nextInt();
				  if(opc2 == 1) {
					  //Recaudacion total 
				  }else {
					  if(opc2 == 2) {
						  System.out.println("Cerrando turno : ");
						 
					  }
				  }
			  }else {
				  if(opc1 == 2 ) {
					  cliente.Turnos(opc1);
				  }else {
					  if(opc1 == 3) {
						  cliente.Turnos(opc1);
					  }
				  }
			  }
				}while(opc1 == 4);		
		 
		 break; 
		 
		 }
		 
		 
		 
		 
	}
}
