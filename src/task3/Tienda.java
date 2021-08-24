package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class Tienda {
    public static LinkedHashSet<String> met_filtrar_productos(String str) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(str.trim().split(", ")));

        return new LinkedHashSet<>(inputList);
    }
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
    public static void main(String[] args) {
        System.out.println(met_filtrar_productos("arroz, sal, miel, lentejas, frijol, leche, lentejas, arroz, " +
                "miel, sal, banano"));
        System.out.println(met_productos_faltantes("0,3,4,2,1,5,6,8,11", "arroz, sal, miel, lentejas, " +
                "frijol, leche, lentejas, arroz, miel, sal, banano, arroz", "arroz" ));
    }
}
