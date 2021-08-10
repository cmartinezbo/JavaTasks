import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var miGestion = new Gestion();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();
            String string = sc.nextLine();
            String[] parts = string.split("&");

            if (parts[0].equals("3")) break;

            if (parts[0].equals("1")) {
                // Añadir persona
                System.out.println("igual a 1");
            } else if (parts[0] .equals("2")) {
                // Imprimir datos persona
                System.out.println("igual a 2");
            }
        }
    }
}

