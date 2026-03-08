package Punto2;
import java.util.ArrayList;
import java.util.List;

public class PairList<K, V> {

    private List<Pair<K, V>> lista_pares;

    public PairList(){
        this.lista_pares = new ArrayList<>();
    }

    // Método para agregar un par clave-valor
    public void agregar(K clave, V valor){
        if (clave == null || valor == null){
            System.out.println("Argumentos invalidos");
        }
        Pair<K, V> par = new Pair<K,V>(clave, valor);

        lista_pares.add(par);
    }

    //Método para eliminar un par
    public void eliminar(K clave){
        for (Pair<K,V> pair : lista_pares) {
            if (pair.getClave().equals(clave)){
                lista_pares.remove(pair);
                return;
            }
        }
        System.out.println("No existe ningún par con esta clave");
    }

    // Método para obtener un par usando su clave
    public Pair<K,V> obtener_par(K clave){
        if (clave == null){
            System.out.println("Ingrese una clave valida");
        }
        for (Pair<K,V> pair : lista_pares) {
            if (pair.getClave().equals(clave)) {
                return pair;
            }
        }
        return null;
    }

}
