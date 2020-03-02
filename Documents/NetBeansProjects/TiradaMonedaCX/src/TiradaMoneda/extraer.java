package TiradaMoneda;

import java.util.Scanner;

/**
 * 
 * @author Garciber
 * @version 1.0
 * Esta clase se encarga de contar el número de caras y cruces dobles consecutivas obtenidas al lanzar 
 * dos moneda un número determinado de veces. El resultado de obtener cara o cruz en cada lanzamiento se realiza
 * de genera aleatoriamente.
 */
public class extraer {

    public static void main(String[] args) {
        /**
         *las variables resultado1 y resultado2 servirán para guardar el resultado (cara o cruz) de la tirada de dos monedas
         *las variables contadorCaras y contadorCruces son acumuladores del número total de caras y cruzes simples obtenidas
         * ya sean consecutivas o no consecutivas.
         *las variables con1 y cont2 son acumuladores del número de caras o cruces dobles consecutivas obtenidas actualmente,
         * se reinicia en el caso de perder la racha.
         *las variables maxCaraDobleConse y maxCruzDobleConse almacenan el número máximo de caras y cruces consecutivas alcanzado(racha).
        */
        int resultado1;
        int resultado2;
        int contadorCaras = 0;
        int contadorCruces = 0;
        int numTiradas;
        int cont1 = 0;
        int cont2 = 0;
        int maxCaraDobleConse = 0;
        int maxCruzDobleConse = 0;
        boolean esCruzDoble = false;
        boolean esCaraDoble = false;
        String tirada1;
        String tirada2;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce el n\u00famero de veces que se van a lanzar las monedas (max 50): ");
            numTiradas = teclado.nextInt();
        } while (numTiradas < 1 || numTiradas > 50);
        /**
         * Se realiza la tirada de las dos monedas un número de veces numTiradas tal como introdujo el usuario,
         * se obtiene un valor aleatorio resultante de calcular el producto de la función Math.random() que devuelve
         * un valor entre [0,1) y el entero 2. Como al resultado del producto se le hace una conversión a entero, los únicos
         * número enteros posibles en el rango [0,2) son el 0 y 1.
         * El valor 0 se interpreta como cara.
         * El valor 1 se interpreta como cruz.
         * 
         */
        
        for (int i = 0; i < numTiradas; i++) {
            resultado1 = (int) (Math.random() * 2);
            resultado2 = (int) (Math.random() * 2);
            if (resultado1 == 0) {
                contadorCaras++;
                tirada1 = "cara";
            } else {
                contadorCruces++;
                tirada1 = "cruz";
            }
            if (resultado2 == 0) {
                contadorCaras++;
                tirada2 = "cara";
            } else {
                contadorCruces++;
                tirada2 = "cruz";
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
        /**
         * Una vez calculdo:
         *  el número de caras y cruces simples obtenidas
         *  el número máximo de caras y cruces dobles obtenidas en alguna racha
         * 
         * Se le pasa al método imprime estos resultados para que se impriman por pantalla
         */
        TiradaMonedaCX.imprime(contadorCaras, contadorCruces, maxCaraDobleConse, maxCruzDobleConse);
    }
    
}
