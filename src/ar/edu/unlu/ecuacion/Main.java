package ar.edu.unlu.ecuacion;

public class Main {

	private static Double[] resultado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * La ecuacion es de la forma (A)x cuadrado + (B)x + (C) = 0
		 * 
		 */

		Calculadora miCalc = new Calculadora();

		resultado = miCalc.calcular(1, 5, 6);
		System.out.println("x1: " + resultado[0]);
		System.out.println("x2: " + resultado[1]);

		resultado = miCalc.calcular(1, -6, -7);
		System.out.println("x1: " + resultado[0]);
		System.out.println("x2: " + resultado[1]);

		resultado = miCalc.calcular(1, -10, 25);
		System.out.println("x1: " + resultado[0]);
		System.out.println("x2: " + resultado[1]);

		resultado = miCalc.calcular(1, 1, 1);
		System.out.println("x1: " + resultado[0]);
		System.out.println("x2: " + resultado[1]);
	}
}
