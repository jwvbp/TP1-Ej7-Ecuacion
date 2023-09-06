package ar.edu.unlu.ecuacion;

public class Calculadora {

	private Double x1 = null;
	private Double x2 = null;
//private Double[] resultado;
	private int discriminante;

	public Double[] calcular(int a, int b, int c) {

		discriminante = (b * b - (4 * a * c));
		if (discriminante < 0) {
			System.out.println("no hay solucion");
			x1 = null;
			x2 = null;
		}

		if (discriminante == 0) {
			System.out.println("solo una solucion, x1 y x2 tienen el mismo valor");
			x1 = ((-(b)) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			x2 = ((-(b)) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		}

		if (discriminante > 0) {
			System.out.println("dos soluciones");
			x1 = ((-(b)) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			x2 = ((-(b)) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		}

		Double[] resultado = { x1, x2 };
		return resultado;
	}
}
