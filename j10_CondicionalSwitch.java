public class j10_CondicionalSwitch {
//orden de los planetas//
    public static void main(String[] args) {

        int planeta = 4;

        switch (planeta) {
            case 1: 
                System.out.println("Mercurio");
                break;

            case 2: 
                System.out.println("Venus");
                break;

            case 3: 
                System.out.println("Tierra");
                break;

            case 4: 
                System.out.println("Marte");
                break;

                case 5: 
                System.out.println("Júpiter");
                break;

            default: 
                System.out.println("Planeta inválido");
        }
        System.out.println("\n-----------\n");

    }
}
