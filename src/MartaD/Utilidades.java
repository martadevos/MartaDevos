package MartaD;

public class Utilidades {
    /*
     * Método que genera el menú del programa y pide elegir una de las opciones para
     * dirigir a cada opción mediante un switch
     */
    public static void menu(Partida[][] juego) {
        int resp;
        boolean salir = false;
        System.out.println("Introduzca el número de la opción que desee elegir:");
        while (!salir) {
            System.out.println("1.- Datos y puntuación de cada jugador de la pista.");
            System.out.println("2.- Puntuación final de la pista.");
            System.out.println("3.- Datos y puntuación del ganador de la pista.");
            System.out.println("4.- Datos y puntuación del ganador de cada pista en orden decreciente");
            resp = Main.s.nextInt();
            switch (resp) {
                case 1 -> {
                    Main.opcion1(juego);
                    salir = true;
                }
                case 2 -> {
                    Main.opcion2(juego);
                    salir = true;
                }
                case 3 -> {
                    Main.opcion3(juego);
                    salir = true;
                }
                case 4 -> {
                    Main.opcion4(juego);
                    salir = true;
                }
                default -> System.out.println("No existe la opción seleccionada, pruebe otra vez");
            }
        }
    }

    /*
    * Método para pedir el número de una pista y verificar que se
    * haya introducido un número correcto. No recibe nada y devuelve
    * el número entero de la pista
    */

    public static int pedirNumPista() {
        boolean salir = false;
        int pista = 0;
        while (!salir) {
            System.out.println("Introduzca el número de la pista de la que desea ver los datos");
            pista = Main.s.nextInt();
            if (pista < 1 || pista > 12) {
                System.out.println("El número de pista no es correcto");
            } else {
                salir = true;
            }
        }
        return pista;
    }

    /*
     *Método para gnerar una partida nueva
     */
    public static Partida[][] generarPartida() {
        return new Partida[][]{{
                        new Partida("ANTONIA", 54, 5),
                        new Partida("ANTONIO", 74, 0),
                        new Partida("CARLOS", 55, 8),
                        new Partida("CARMEN", 28, 2)},
                {
                        new Partida("ALEJANDRO", 72, 9),
                        new Partida("ANA", 30, 0),
                        new Partida("ANA MARIA", 74, 2),
                        new Partida("ANGEL", 26, 3)},
                {
                        new Partida("CRISTINA", 31, 1),
                        new Partida("DANIEL", 61, 6),
                        new Partida("DAVID", 38, 5),
                        new Partida("DOLORES", 19, 2)},
                {
                        new Partida("ELENA", 67, 1),
                        new Partida("FERNANDO", 55, 6),
                        new Partida("FRANCISCA", 29, 10),
                        new Partida("FRANCISCO", 29, 7)},
                {
                        new Partida("FRANCISCO JAVIER", 73, 8),
                        new Partida("ISABEL", 70, 6),
                        new Partida("JAVIER", 56, 6),
                        new Partida("JESUS", 29, 0)},
                {
                        new Partida("JOSE", 48, 5),
                        new Partida("JOSE ANTONIO", 45, 10),
                        new Partida("JOSE LUIS", 28, 6),
                        new Partida("JOSE MANUEL", 64, 7)},
                {
                        new Partida("JOSE MARIA", 20, 1),
                        new Partida("JOSEFA", 38, 5),
                        new Partida("JUAN", 70, 2),
                        new Partida("LAURA", 54, 10)},
                {
                        new Partida("LUCIA", 62, 0),
                        new Partida("MANUEL", 55, 10),
                        new Partida("MARIA", 32, 4),
                        new Partida("MARIA ANGELES", 71, 8)},
                {
                        new Partida("MARIA CARMEN", 40, 0),
                        new Partida("MARIA DOLORES", 66, 7),
                        new Partida("MARIA ISABEL", 18, 8),
                        new Partida("MARIA JOSE", 56, 3)},
                {
                        new Partida("MARIA LUISA", 29, 3),
                        new Partida("MARIA PILAR	", 31, 2),
                        new Partida("MARIA TERESA", 43, 0),
                        new Partida("MARTA", 75, 4)},
                {
                        new Partida("MIGUEL", 53, 9),
                        new Partida("MIGUEL ANGEL", 49, 1),
                        new Partida("PABLO", 27, 6),
                        new Partida("PAULA", 64, 3)},
                {
                        new Partida("PEDRO", 26, 8),
                        new Partida("RAFAEL", 54, 9),
                        new Partida("SARA", 28, 9),
                        new Partida("SERGIO", 69, 4)}};
    }
}
