package controlador;

import modelo.Bombilla;

public class Principal {


	public static void main(String[] args) {
		
		Bombilla bombilla=new Bombilla(4,"apagado");
		System.out.println(bombilla.pulsarInterructor());

	}

}
