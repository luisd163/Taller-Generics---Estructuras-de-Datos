package Punto4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteradorReverso<T> implements Iterator<T>{

    private int indice;
    private List<T> datos;

    public IteradorReverso(ArrayList datos){
        this.indice = datos.size() - 1;
        this.datos = datos;
    }

    @Override
    public boolean hasNext() {
        return indice >= 0;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return datos.get(indice--);
        }
        throw new IllegalAccessError("No hay más posiciones para recorrer");
    }

}
