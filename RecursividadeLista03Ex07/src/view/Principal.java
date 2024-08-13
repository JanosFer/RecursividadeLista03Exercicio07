package view;

import controller.SomaDigitoController;

public class Principal {
	public static void main(String[] args) {
		SomaDigitoController sdc = new SomaDigitoController();
		
		int a = 1234;
		String b = a + "";
		
		System.out.println("A soma de digitos de '" +a+"' é: " +sdc.soma(b, b.length()));
	}
}
