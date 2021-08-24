package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class Tienda {

    // Primer método
    public static LinkedHashSet<String> met_filtrar_productos(String str) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(str.trim().split(", ")));

        return new LinkedHashSet<>(inputList);
    }

    // Segundo método
    public static ArrayList<String> met_productos_faltantes(String posiciones, String faltantes, String elemento) {

        ArrayList<String> firstList = new ArrayList<>(Arrays.asList(posiciones.trim().split(",")));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList(faltantes.trim().split(", ")));
        ArrayList<String> output = new ArrayList<>();

        for (String item : firstList) {
            if (secondList.get(Integer.parseInt(item)).equals(elemento)) {
                output.add(item);
            }
        }
        return output;
    }

    // Tercer método
    public static ArrayList<String> met_encontrar_faltantes(String pedido, String producto) {

        ArrayList<String> firstList = new ArrayList<>(Arrays.asList(pedido.trim().split(", ")));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList(producto.trim().split(", ")));
        ArrayList<String> output = new ArrayList<>();

        for (String item : firstList) {
            if (!secondList.contains(item)) {
                output.add(item);
            }
        }
        return output;
    }

    // Cuarto método
    public static int met_obtener_intercambiables(String otros, String mios) {

        ArrayList<String> firstList = new ArrayList<>(Arrays.asList(otros.trim().split(", ")));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList(mios.trim().split(", ")));
        ArrayList<String> firstChanger = new ArrayList<>();
        ArrayList<String> secondChanger = new ArrayList<>();

        for (String item : firstList) {
            if (!secondList.contains(item)) {
                firstChanger.add(item);
            }
        }

        for (String item : secondList) {
            if (!firstList.contains(item)) {
                secondChanger.add(item);
            }
        }
        return Math.min(firstChanger.size(), secondChanger.size());
    }

    // Main - Pruebas
    public static void main(String[] args) {
        System.out.println(met_filtrar_productos("arroz, sal, miel, lentejas, frijol, leche, lentejas, arroz, " +
                "miel, sal, banano"));

        System.out.println(met_productos_faltantes("0,3,4,2,1,5,6,8,11", "arroz, sal, miel, " +
                "lentejas, frijol, leche, lentejas, arroz, miel, sal, banano, arroz", "arroz" ));

        System.out.println(met_encontrar_faltantes("arroz, sal, miel, lentejas, banano, frijol",
                "sal, miel, ajo, frijol, leche"));

        System.out.println(met_obtener_intercambiables("arroz, sal, miel, lentejas, banano, frijol, papa, " +
                "cebolla, aceite", "sal, miel, ajo, frijol, leche, garbanzo, lechuga, papa"));
    }
}
