import java.util.Stack;

import Punto2.Pair;

public class Main {
    
    public Pair<Stack<Integer>,Stack<Integer>> splitStack(Stack<Integer> s, int indice){
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        if (s.isEmpty()) {
            throw new IllegalArgumentException("La pila no puede estar vacía");
        }
        if (indice > s.size()) {
            throw new IllegalArgumentException("Ingrese un indice valido");
        }
        for (int i = 0; i < indice; i++) {
            pila1.push(s.get(i));
        }
        for (int i = indice; i < s.size(); i++) {
            pila2.push(s.get(i));
        }
        return new Pair<Stack<Integer>,Stack<Integer>>(pila1, pila2);
    }
}
