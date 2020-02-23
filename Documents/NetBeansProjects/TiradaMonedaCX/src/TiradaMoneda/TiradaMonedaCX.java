package TiradaMoneda;
import java.util.Scanner;
public class TiradaMonedaCX {
	public static void main(String[] args) {
		//las variables a y b servirán para guardar el resultado de la tirada de dos monedas
		int resultado1, resultado2;
		int contadorCaras = 0, contadorCruces = 0, numTiradas;
		//las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
		int cont1 = 0, cont2 = 0;
		int maxCaraDobleConse = 0, maxCruzDobleConse = 0;
		boolean esCruzDoble = false, esCaraDoble = false;
		String tirada1;
		String tirada2;
		//hola
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduce el número de veces que se van a lanzar las monedas (max 50): ");
			numTiradas = teclado.nextInt();
		} while (numTiradas < 1 || numTiradas > 50);
		for (int i = 0; i < numTiradas; i++) {
			resultado1 = (int) (Math.random() * 2);
			resultado2 = (int) (Math.random() * 2);

			if (resultado1 == 0) {
				contadorCaras++;
				tirada1="cara";
			} else {
				contadorCruces++;
				tirada1="cruz";
			}
			if (resultado2 == 0) {
				contadorCaras++;
				tirada2 ="cara";
			} else {
				contadorCruces++;
				tirada2="cruz";
			}
			System.out.println("Moneda 1: " + tirada1 + ", Moneda 2: " + tirada2);
			if (resultado1 == resultado2) {
				if (resultado1 == 0) {
					esCaraDoble = true;
					esCruzDoble = false;
				} else {
					esCaraDoble = false;
					esCruzDoble = true;
				}
			} else {
				esCaraDoble = false;
				esCruzDoble = false;
			}
			if (esCaraDoble) {
				cont1++;
				if (cont1 > maxCaraDobleConse) {
					maxCaraDobleConse = cont1;
				}
			} else {
				cont1 = 0;
			}
			if (esCruzDoble) {
				cont2++;
				if (cont2 > maxCruzDobleConse) {
					maxCruzDobleConse = cont2;
				}
			} else {
				cont2 = 0;
			}
		}
		imprimirResultado(contadorCaras, contadorCruces, maxCaraDobleConse, maxCruzDobleConse);
	}

    public static void imprimirResultado(int contadorCaras, int contadorCruces, int maxCaraDobleConse, int maxCruzDobleConse) {
        System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
        System.out.println("Maximo de caras dobles consecutivas: " + maxCaraDobleConse);
        System.out.println("Maximo de cruces dobles consecutivas: " + maxCruzDobleConse);
    }
}
