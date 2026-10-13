public class j16_Arreglos_1 {

    public static void main(String[] args) {
     
        int[] puntuaciones = new int[6];

        puntuaciones[0] = 85;
        puntuaciones[1] = 92;
        puntuaciones[2] = 78;
        puntuaciones[3] = 45;
        puntuaciones[4] = 72;
        puntuaciones[5] = 67;

        puntuaciones[0] = 90;

        System.out.println("Tamaño del arreglo: " + puntuaciones.length);
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("Puntuación en la posición " + i + ": " + puntuaciones[i]);
        }
}
 }

