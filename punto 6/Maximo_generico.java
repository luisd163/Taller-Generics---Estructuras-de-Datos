import java.util.ArrayList;

public class Maximo_generico {
    public static <T extends Comparable<T>> T maximo(ArrayList<T> lista){
        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }
}
