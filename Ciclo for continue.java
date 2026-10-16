public class j13_CicloFor_ControlContinue {

    public static void main(String[] args) {

        // Recorremos los jugadores del 1 al 10
        for (int i = 1; i <= 10; i++) {

            // Si llegamos al jugador 7, no queremos mostrarlo
            if (i == 7) {
                System.out.println("El jugador 7 será omitido.");

                // continue salta el resto del código de esta iteración
                // y continúa con la siguiente vuelta del ciclo.
                System.out.println("-----Este es el jugador que se salta------");
                continue;
            }

            // Este mensaje solo se imprime si no se ejecutó continue
            System.out.println("Jugador: " + i);
        }

        // Este mensaje se ejecuta cuando el ciclo termina
        System.out.println("Fin del programa.");
        System.out.println("------------------");
    }

}