
public class j11_Condicional_if_else {

    public static void main(String[] args) {

        // Declaramos una variable de tipo entero
        int temperatura = 18;

        // Evaluamos la temperatura

        if (temperatura >= 35) {
            System.out.println("Hace mucho calor");

        } else if (temperatura >= 25) {
            System.out.println("El clima es caluroso");

        } else if (temperatura >= 15) {
            System.out.println("El clima es fresco");

        } else {
            System.out.println("Hace mucho frío");
        }

        // Este mensaje siempre se ejecuta
        System.out.println("Fin del programa.");

    }
}