import entidades.Persona;
import entidades.Proveedor;
import entidades.Socio;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    private final ArrayList<Persona> personas;

    // Constructor - Inicializa las variables relacionada al array ó list tipo entidades.Persona
    public Gestion() {
        personas = new ArrayList<>();
    }

    // recibe como parámetro un objeto tipo persona y lo adiciona al array ó list tipo persona.
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // debe recorrer el array ó list tipo entidades.Persona y mostrar los registros con el toString()
    public void listarPersona() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

    // debe poder realizar la lectura desde consola con la siguiente estructura:
    public void procesarComando() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine().trim();

            if (input.charAt(0) == '3') break; // Salir

            String[] parts = input.split("&");
            String tipoPersona = parts[1];
            String nombre = parts[2];
            String idPersona = parts[3];
            String phonePersona = parts[4];
            String direccion = parts[5];
            String elemento = parts[6];

            if (parts[0].equals("1")) {
                Persona persona;
                if (tipoPersona.equals("Proveedor")) {
                    persona = new Proveedor(nombre, idPersona, phonePersona, direccion, elemento);
                } else {
                    persona = new Socio(nombre, idPersona, phonePersona, direccion, elemento);
                }
                agregarPersona(persona);


            } else if (parts[0].equals("2")) {
                listarPersona();
            }
        }
    }
}

