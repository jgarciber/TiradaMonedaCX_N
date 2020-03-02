package TiradaMoneda;
import java.util.Scanner;
public class TiradaMonedaCX {
/**
 * El método imprime se encarga de imprimir en pantalla los datos que se le pasan como parámetros.
 * Estos datos son los resultados de los cálculos del método extraer.
 * @param contadorCaras
 * @param contadorCruces
 * @param maxCaraDobleConse
 * @param maxCruzDobleConse 
 */
    public static void imprime(int contadorCaras, int contadorCruces, int maxCaraDobleConse, int maxCruzDobleConse) {
        System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
        System.out.println("Maximo de caras dobles consecutivas: " + maxCaraDobleConse);
        System.out.println("Maximo de cruces dobles consecutivas: " + maxCruzDobleConse);
    }
}
