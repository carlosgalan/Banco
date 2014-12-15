package modelo;

public class Bombilla {
	private int vatios;
	private String estado;
	public Bombilla(int vatios,String estado){
		this.vatios=vatios;
		if(!estado.equals("encendido") && !estado.equals("apagado"))
			estado="encedido";
		this.estado=estado;
	}
	public int getVatios() {
		return vatios;
	}
	public void setVatios(int vatios) {
		this.vatios = vatios;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String pulsarInterructor(){
		if (estado.equals("apagado"))
			estado="encendido";
		else
			estado="apagado";
		return estado;
			
	}
	
}
