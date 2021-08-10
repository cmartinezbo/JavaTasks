public class Main {
    public static void main(String[] args) {
        var miGestion = new Gestion();

        String string = "1&Proveedor&Carlos&123456&55555&avenida siempre viva 45&llantas1";
        String[] parts = string.split("&");

        while (true) {
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

