public class j17_Arreglos_2 {
public static void main(String[] args) {
       
        double[] calificaciones = {8.0, 5.2, 9.8, 7.2, 6.7};
        double total = 0;

    
        System.out.println("--- Calificaciones ---");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("calificación " + i + ": " + calificaciones[i]);
            total += calificaciones[i]; // Acumulamos el precio
        }

        double promedio = total / calificaciones.length;
        System.out.println("\nSuma de calificaciones: " + total);
        System.out.println("Promedio de calificaciones : " + promedio);

        System.out.println("Calificación final del trimestre");
    }
}

