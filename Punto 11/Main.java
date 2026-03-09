import java.util.Queue;
import java.util.LinkedList;

public class Main<T> {
    

    public Queue<T> mergeQueue(Queue<T> cola1, Queue<T> cola2){
        Queue<T> cola = new LinkedList<>();
        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                cola.add(cola1.poll());
            }
            if (!cola2.isEmpty()) {
                cola.add(cola2.poll());
            }
        }
        return cola;
    }

}
