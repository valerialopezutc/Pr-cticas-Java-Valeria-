import java.util.ArrayList;
public class j20_ArrayList_3 {
    public static void main(String[] args) {
        
        // Creamos ArrasyList// 

        ArrayList<String> postres = new ArrayList<>();

        System.out.println("=== 1. MÉTODO .add() ===");
        // .add(objetos) agregamos los postres al final de la lista.
       
        postres.add("Flan");   // Posición 0
        postres.add("Brownie");   // Posición 1
        postres.add("Cheesecake");  // Posición 2

        // También puedes usar .add(índice, objeto) para INSERTAR en una posición específica:
        postres.add(1, "Pastel de chocolate"); // Inserta en posición 1 y empuja el resto hacia abajo

        System.out.println("Lista actual: " + postres);
        // Imprime el resultado (postres)//


        System.out.println("\n=== 2. MÉTODO .get() ===");
       
        String primerPostre = postres.get(0);
        String segundoPostre = postres.get(1);

        System.out.println("Postre en la posición 0: " + primerPostre);
        System.out.println("Postre en la posición 1: " + segundoPostre);


        System.out.println("\n=== 3. MÉTODO .set() ===");
        
        postres.set(1, "Pastel de frutas");

        System.out.println("Lista tras modificar la posición 1: " + postres);
        // Resultado// 

        System.out.println("\n=== 4. MÉTODO .remove() ===");
    
    //Eliminar por indice//
        postres.remove("Flan"); 
        System.out.println("Después de eliminar Flan: " + postres);

        // Eliminar por nombre//
        postres.remove("Brownie");
        System.out.println("Después de eliminar 'Brownie': " + postres);


        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total de postres restantes): " + postres);
        System.out.println("Contenido final: " + postres);
    }
}
