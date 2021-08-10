import entidades.Persona;

import java.util.Scanner;

public class Gestion {
    // Inicializa las variables relacionada al array ó list tipo entidades.Persona
    private void inicializacion() {

    }

    // recibe como parámetro un objeto tipo persona y lo adiciona al array ó list tipo persona.
    private void agregarPersona(Persona persona) {

    }

    // debe recorrer el array ó list tipo entidades.Persona y mostrar los registros con el toString()
    private void listarPersona() {

    }

    // debe poder realizar la lectura desde consola con la siguiente estructura:
    void procesarComando() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine().trim();

            if (input.charAt(0) == '3') break; // Salir

            String[] parts = input.split("&");

            if (parts[0].equals("1")) {
                // Añadir persona
            } else if (parts[0].equals("2")) {
                // Imprimir datos persona
            }
        }
    }
}

