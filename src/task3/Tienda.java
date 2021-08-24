package task3;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Tienda {

    // Primer método
    public static LinkedHashSet<String> met_filtrar_productos(ArrayList<String> str) {
        return new LinkedHashSet<>(str);
    }

    // Segundo método
    public static ArrayList<Integer> met_productos_faltantes(ArrayList<Integer> posiciones, ArrayList<String> faltantes, String elemento) {

        ArrayList<Integer> output = new ArrayList<>();

        for (Integer item : posiciones) {
            if (faltantes.get(item).equals(elemento)) {
                output.add(item);
            }
        }
        return output;
    }

    // Tercer método
    public static ArrayList<String> met_encontrar_faltantes(ArrayList<String> pedido, ArrayList<String> producto) {

        ArrayList<String> output = new ArrayList<>();

        for (String item : pedido) {
            if (!producto.contains(item)) {
                output.add(item);
            }
        }
        return output;
    }

    // Cuarto método
    public static String met_obtener_intercambiables(ArrayList<String> otros, ArrayList<String> mios) {

        ArrayList<String> firstChanger = new ArrayList<>();
        ArrayList<String> secondChanger = new ArrayList<>();

        for (String item : otros) {
            if (!mios.contains(item)) {
                firstChanger.add(item);
            }
        }

        for (String item : mios) {
            if (!otros.contains(item)) {
                secondChanger.add(item);
            }
        }
        return Integer.toString(Math.min(firstChanger.size(), secondChanger.size()));
    }
}
