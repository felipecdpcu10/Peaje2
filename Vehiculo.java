
public abstract class Vehiculo {

	protected int ejes;
	protected int toneladas;
	protected String marca; 
	protected int patente;
	protected int tipo; 
	protected int  meses [] = new int[12]; 
	
    public Vehiculo(int ejes,int toneladas, String marca, int patente , int tipo) {
		
		this.ejes = ejes;
		this.marca = marca;
		this.patente = patente;
		this.toneladas = toneladas;
		
		this.tipo = tipo; 
	}
    public Vehiculo() {
    	
    }
	
	//Metodos utilis como get y set . 
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getToneladas() {
		return toneladas;
	}
	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPatente() {
		return patente;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo; 
	}
	public int getTipo() {
		return tipo;
	}
	
	public abstract int CalcularPeaje(int ejes , int toneladas);
	@Override
	public String toString() {
		return "Vehiculo [ejes=" + ejes + ", toneladas=" + toneladas + ", marca=" + marca + ", patente=" + patente
				+ ", tipo=" + tipo + "]";
	} 
	
	
	
}
