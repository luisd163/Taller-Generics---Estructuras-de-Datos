package Punto1;
public class MainTareas {
    public static void main(String[] args) {
        ListaDeTareas listaTareas = new ListaDeTareas();

        listaTareas.agregar_tareas("Lavar la ropa", 3, "2026-03-16");
        listaTareas.agregar_tareas("Parcial Cálculo", 1, "2026-03-27");
        listaTareas.agregar_tareas("Parcial Grafos", 2, "2026-03-19");
        listaTareas.agregar_tareas("Parcial Vectorial", 1, "2026-03-20");

        System.out.println(listaTareas.obtener_tareas_prioridad(1));
        System.out.println(listaTareas.obtener_tareas_prioridad(2));
        System.out.println(listaTareas.obtener_tareas_prioridad(3));

        listaTareas.obtener_tareas_fecha();
    }
}
