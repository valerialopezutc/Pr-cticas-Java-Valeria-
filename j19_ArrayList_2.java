import java.util.ArrayList;

public class j19_ArrayList_Videojuegos {
    public static void main(String[] args) {
    
        ArrayList<Integer> precios = new ArrayList<>();

// precios de los videojuegos//

        precios.add(250);
        precios.add(150);
        precios.add(500);
        precios.add(80);

        System.out.println("--- Precios de videojuegos ---");
        
        for (Integer precio : precios) {
            if (precio >= 200) {
                System.out.println("Videojuego de $" + precio + ": Precio alto");
            } else {
                System.out.println("Videojuego de $" + precio + ": Precio accesible");
            }
        }
    }
}
