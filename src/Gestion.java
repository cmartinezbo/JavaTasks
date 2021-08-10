import entidades.Persona;
import entidades.Proveedor;
import entidades.Socio;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    // attributes
    private static final Scanner sc = new Scanner(System.in);
    private final ArrayList<Persona> personas;

    // constructor
    public Gestion() {
        personas = new ArrayList<>();
    }

    // añade persona a la lista de personas
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // muestra los atributos de cada persona dentro de la lista
    public void listarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

    // lee por consola los datos que se van a introducir y decide qué métodos ejecutar
    public void procesarComando() {
        while (true) {
            String input = sc.nextLine().trim();

            if (input.charAt(0) == '3') break;

            if (input.charAt(0) == '2') listarPersonas();

            else if (input.charAt(0) == '1') {
                String[] parts = input.split("&");

                String personType = parts[1];
                String name = parts[2];
                String id = parts[3];
                int tel = Integer.parseInt(parts[4]);
                String address = parts[5];
                String different = parts[6];

                if (parts[0].equals("1")) {
                    if (personType.equalsIgnoreCase("proveedor")) {
                        agregarPersona(new Proveedor(name, id, tel, address, different));
                    } else if (personType.equalsIgnoreCase("socio")) {
                        agregarPersona(new Socio(name, id, tel, address, different));
                    }
                }
            }
        }
    }
}
