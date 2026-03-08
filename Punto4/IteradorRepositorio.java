package Punto4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteradorRepositorio<T> implements Iterator<T>{

    private int indice;
    private List<T> datos;

    public IteradorRepositorio(ArrayList<T> datos){
        this.indice = 0;
        this.datos = datos;
    }

    // Método que verifica si hay mas elementos para recorrer
    @Override
    public boolean hasNext() {
        return indice < datos.size();
    }

    // Método que devuelve el siguiente elemento
    @Override
    public T next() {
        if (hasNext()) {
            return datos.get(indice++);
        }
        throw new IllegalAccessError("No hay más posiciones para recorrer");
    }
    
}
