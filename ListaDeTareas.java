import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Queue;
import java.util.TreeSet;

public class ListaDeTareas {
    private Queue<Tarea> cola_tareas_prioridad1;
    private Queue<Tarea> cola_tareas_prioridad2;
    private Queue<Tarea> cola_tareas_prioridad3;
    private Queue<Tarea> cola_tareas;
    private TreeSet<Tarea> tareas_ordenadas_por_fecha;

    public ListaDeTareas(){
        this.cola_tareas_prioridad1 = new ArrayDeque<>();
        this.cola_tareas_prioridad2 = new ArrayDeque<>();
        this.cola_tareas_prioridad3 = new ArrayDeque<>();
        this.cola_tareas = new ArrayDeque<>();
        this.tareas_ordenadas_por_fecha = new TreeSet<>(Comparator.comparing(Tarea::getFechaVencimiento).thenComparing(T -> T.getDescripcion()));
    }

    // Método para agregar tareas a la cola
    public void agregar_tareas(String descripcion, int prioridad, String fechaVencimiento){
        if(descripcion == null || fechaVencimiento == null ){
            System.out.println("No se aceptan datos nulos");
        }
        Tarea tarea = new Tarea(descripcion, prioridad, fechaVencimiento);
        switch (tarea.getPrioridad()) {
            case 1:
                cola_tareas_prioridad1.add(tarea);
                cola_tareas.add(tarea);
                tareas_ordenadas_por_fecha.add(tarea);
                break;
        
            case 2:
                cola_tareas_prioridad2.add(tarea);
                cola_tareas.add(tarea);
                tareas_ordenadas_por_fecha.add(tarea);                
                break;

            case 3 :
                cola_tareas_prioridad3.add(tarea);
                cola_tareas.add(tarea);
                tareas_ordenadas_por_fecha.add(tarea);
                break;

            default:
                break;
        }
        System.out.println("Tarea agregada correctamente");
    }

    // Método que permite obtener la tareas por prioridad
    public Queue<Tarea> obtener_tareas_prioridad(int prioridad){
        switch (prioridad) {
            case 1:
                return cola_tareas_prioridad1;
                
            case 2:
                return cola_tareas_prioridad2;

            case 3:
                return cola_tareas_prioridad3;
            default:
                return null;
        }
    }

    public TreeSet<Tarea> obtener_tareas_fecha(){
        for(Tarea tarea: tareas_ordenadas_por_fecha){
            System.out.println(tarea.toString());
        }
        return tareas_ordenadas_por_fecha;  
    }
}
