package controlador;

import modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta cuenta1=new Cuenta(1,"Carlos galan",2000F);
		Cuenta cuenta2=new Cuenta(2,"Marina galan",1000F);
		cuenta1.reintegro(100F);
		System.out.println("Su saldo Sr Galan: "+cuenta1.getSaldo());
		cuenta1.transferencia(cuenta2, 2100F);
		
		System.out.println("Su saldo Sr Galan: "+cuenta1.getSaldo());
		System.out.println("Su saldo Sra Galan: "+cuenta2.getSaldo());
		
	

	}

}
