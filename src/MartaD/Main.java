package MartaD;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Partida[][] juego = Utilidades.generarPartida();
        Utilidades.menu(juego);
    }

    /*
     * Método para la primera opción del menú. Recibe un array tipo Partida y
     * escribe los jugadores con sus datos y puntos de cada pista; no devuelve nada.
     */

    public static void opcion1(Partida[][] juego) {
        System.out.println(Arrays.toString(juego[Utilidades.pedirNumPista() - 1]));
    }

    /*
    *Método para la segunda opción del menú. Recibe un array tipo Partida y
    * llama al método pedir pista para que diga la pista de la que se desea
    * ver la información, suma todos los puntos de esta pista y los escribe
    * por pantalla; no devuelve nada.
    */

    public static void opcion2(Partida[][] juego) {
        int pista = Utilidades.pedirNumPista() - 1, sumapuntos = 0;
        for (int i = 0; i < 4; i++) {
            sumapuntos += juego[pista][i].getPuntos();
        }
        System.out.println("La puntuación final de la pista " + (pista + 1) + " es: " + sumapuntos + " puntos.");
    }

    /*
    * Método para odenar los puntos de cada pista. Recibe un array tipo partida y un número de
    * pista  y ordena a los jugadores en función de sus puntos en orden descendente;
    * por último devuelve el array ordenado
    */

    public static Partida[][] ordenarPuntos(Partida[][] juego, int pista) {
        Partida mayor;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (juego[pista][i].getPuntos() > juego[pista][j].getPuntos()) {
                    mayor = juego[pista][i];
                    juego[pista][i] = juego[pista][j];
                    juego[pista][j] = mayor;
                }
            }
        }
        return juego;
    }

    /*
    * Método para la tercera opción del menú del programa. Llama al método pedirNumPista para
    * recibir el número de la pista que se desea ver, llama al método de ordenarPuntos pasándole
    * el número de pista y el array juego para que ordene a los jugadores de dicha pista  y
    * escribe el jugador en primera posición
    */

    public static void opcion3(Partida[][] juego) {
        int pista = Utilidades.pedirNumPista() - 1;
        ordenarPuntos(juego, pista);
        System.out.println("El jugador ganador en esta pista es: " + juego[pista][0]);
    }

    /*
     * Método para la cuarta opción del menú del programa. Hay un for para que genere todos
     * los números de pistas; este llama al método de ordenarPuntos pasándole el número de pista
     * y el array juego para que ordene a los jugadores de dicha pista  y guarde en un array de
     * tipo Partida al ganador de cada pista, para después ordenarlos en orden descendente y
     * escribirlos en pantalla.
     */

    public static void opcion4(Partida[][] juego) {
        Partida[] ganadores=new Partida[12];
        Partida mayor;
        for (int i = 0; i < 12; i++) {
            ordenarPuntos(juego, i);
            ganadores[i]= juego[i][0];
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (ganadores[i].getPuntos() > ganadores[j].getPuntos()) {
                    mayor = ganadores[i];
                    ganadores[i] = ganadores[j];
                    ganadores[j] = mayor;
                }
            }
        }
        System.out.println(Arrays.toString(ganadores));
    }
}
