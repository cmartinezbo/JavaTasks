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

            if (input.charAt(0) == '2') {
                System.out.println("***Inventario de Personas***\n");
                listarPersonas();
            } else if (input.charAt(0) == '1') {
                String[] parts = input.split("&");

                String personType = parts[1];
                String name = parts[2];
                String id = parts[3];
                int tel = Integer.parseInt(parts[4]);
                String address = parts[5];
                String different = parts[6];

                if (personType.equalsIgnoreCase("proveedor")) {
                    agregarPersona(new Proveedor(name, id, tel, address, different));
                } else if (personType.equalsIgnoreCase("socio")) {
                    agregarPersona(new Socio(name, id, tel, address, different));
                }
            }
        }
    }

    public static void main(String[] args) {
        var miGestion = new Gestion();
        miGestion.procesarComando();

        /* ENTRADA:

        1&Proveedor&Carlos&123456&55555&avenida siempre viva 45&llantas

        1&Socio&Manuel&789456&777777&calle 10 N 4-25&23

        2

        3 */

        /* SALIDA:

        ***Inventario de Personas***

                Persona Proveedor - Nombre: Carlos

                Identificación: 123456

                Teléfono: 55555

                Dirección: avenida siempre viva 45

                Producto: llantas

                Persona Socio - Nombre: Manuel

                Identificación: 789456

                Teléfono: 777777

                Dirección: calle 10 N 4-25

                Antigüedad: 23 años

         */
    }
}
