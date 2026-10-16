public class j18_Arrays_Videojuegos {
    public static void main(String[] args) {

        // Crear un arreglo de cadenas (String)
        String[] videojuegos = {"Identity V", "Sky", "Roblox"};

        System.out.println("Lista inicial:");

        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println(videojuegos[i]);
        }

        System.out.println("Total de videojuegos: " + videojuegos.length);

        // 2. Eliminar un elemento dejando su posición vacía
        videojuegos[1] = "";

        System.out.println("\nLista después de eliminar:");

        for (int i = 0; i < videojuegos.length; i++) {
            if (!videojuegos[i].equals("")) {
                System.out.println(videojuegos[i]);
            }
        }

        boolean encontrado = false;

        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i].equals("Identity V")) {
                encontrado = true;
            }
        }

        System.out.println("¿Está disponible Identity V?: " + encontrado);
        System.out.println("Elemento en posición 0: " + videojuegos[0]);
    }
}
