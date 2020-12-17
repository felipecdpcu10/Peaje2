
public class Valor extends Vehiculo {
	private int turno;
	
	
	
	public Valor() {

		
	}
	public Valor(int ejes,int toneladas, String marca, int patente, int turno, int tipo) {
		super(ejes,toneladas,marca, patente, tipo);
		this.turno = turno;
	}
	public int getTurno() {
		return this.turno;
	}
	@Override
	public int CalcularPeaje(int ejes , int toneladas) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
