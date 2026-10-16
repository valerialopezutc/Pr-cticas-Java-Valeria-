public class j12_CicloFor_ControlBreak {

    public static void main(String[] args) {

        // Recorremos los jugadores del 1 al 10
        for (int i = 1; i <= 10; i++) {

            // Mostramos el jugador actual
            System.out.println("Jugador: " + i);

            // Si llegamos al jugador 7, detenemos el ciclo
            if (i == 7) {
                System.out.println("Se encontró al jugador 7.");
                System.out.println("El ciclo se detendrá con break.");

                // break termina inmediatamente el ciclo
                break;
            }

        }

        // Esta instrucción se ejecuta después de terminar el ciclo
        System.out.println("Fin del programa.");
        System.out.println("----------------------");

    }

}
