package Punto4;

import java.util.ArrayList;
import java.util.Iterator;

public class Repositorio<T> implements Iterable<T>{

    public static void main(String[] args) {
        Repositorio<Object> repositorio = new Repositorio<>();
        repositorio.agregar("ola");
        repositorio.agregar(2);
        repositorio.agregar(3.14);

        for (Object object : repositorio) {
            System.out.println(object);
        }

        Iterator itReverse = repositorio.iteratorInverso();

        while (itReverse.hasNext()) {
            System.out.println(itReverse.next());
        }


    }
    ArrayList<T> objetos;

    public Repositorio(){
        this.objetos = new ArrayList<>();
    }

    // Método para agregar un objeto al repositorio
    public void agregar(T elemento){
        if (elemento == null) {
            throw new IllegalArgumentException("Ingrese un elemento válido");
        }
        objetos.add(elemento);

    }

    // Método para obtener un objeto del repositorio usando su indice
    public T obtener(int indice){
        if (indice < 0 || indice >= objetos.size()) {
            throw new IllegalArgumentException("Ingrese un indice válido");
        }
        return objetos.get(indice);
    }


    // Método que permite iterar sobre el repositorio
    @Override
    public Iterator<T> iterator() {
        return new IteradorRepositorio(objetos);
    }

    public Iterator<T> iteratorInverso() {
        return new IteradorReverso(objetos);
    }

}
