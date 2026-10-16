
import java.util.ArrayList;

public class j18_ArrayList_1 {
    public static void main(String[] args) {
        // Crear una lista dinámica de cadenas (String)
        ArrayList<String> videojuegos = new ArrayList<>();

        /* Los elementos se añaden dinámicamente sin definir un 
        límite previo. */
        // 1. Agregar elementos (se van acumulando en orden)
        videojuegos.add("Identity V");
        videojuegos.add("Sky");
        videojuegos.add("Roblox");

        System.out.println("Lista inicial: " + videojuegos);
        System.out.println("Total de videojuegos (size): " + videojuegos.size());

        // 2. Eliminar un elemento por índice o por valor
        videojuegos.remove("Sky"); // Remueve "Sky"

        // 3. Consultar y verificar
        System.out.println("\nLista después de eliminar: " + videojuegos);
        System.out.println("¿Hay Identity V?: " + videojuegos.contains("Identity V"));
        System.out.println("Elemento en posición 0: " + videojuegos.get(0));
    }
}
