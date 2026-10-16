
import java.util.ArrayList;

public class j18_ArrayList_Videojuegos {
    public static void main(String[] args) {
        // Crear una lista dinámica de cadenas (String)
        ArrayList<String> videojuegos = new ArrayList<>();

        videojuegos.add("Identity V");
        videojuegos.add("Sky");
        videojuegos.add("Roblox");
        videojuegos.add("Silent Hill");

        System.out.println("Lista inicial: " + videojuegos);
        System.out.println("Total de videojuegos (size): " + videojuegos.size());

        videojuegos.remove("Sky"); 

        System.out.println("\nLista después de eliminar: " + videojuegos);
        System.out.println("¿Hay Identity V?: " + videojuegos.contains("Identity V"));
        System.out.println("Elemento en posición 0: " + videojuegos.get(0));
    }
}