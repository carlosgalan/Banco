package ejemplos;

import java.util.Scanner;

public class Leenumeros {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] numeros;
		int i=0;
		numeros=new int[10];
		
		
		
		for(;i<10;i++) {
			numeros[i]=scn.nextInt();
		}
		System.out.println("Numeros leidos:");
		for(;i<10;i++) {
			System.out.println(numeros[i]);
			
		}

	}

}
