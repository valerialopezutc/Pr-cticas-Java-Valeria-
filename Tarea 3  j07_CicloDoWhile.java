
public class j07_CicloDoWhile {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Niveles del usuario hasta llegar a 10.");        
        System.out.println("----------------------");

        int contador = 1;
        
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= 10);


        System.out.println("Juego terminado.");
        System.out.println("----------------------");
    }

}
