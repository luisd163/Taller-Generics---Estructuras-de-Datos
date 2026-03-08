package Punto1;
public class Tarea implements Comparable<Tarea>{

    private String descripcion;
    private int prioridad;
    private String fechaVencimiento;

    // constructor
    public Tarea(String descripcion, int prioridad, String fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Setters y Getters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // Método para comparar la prioridad entre dos tareas
    @Override
    public int compareTo(Tarea o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea [descripcion=" + descripcion + ", prioridad=" + prioridad + ", fechaVencimiento="
                + fechaVencimiento + "]";
    }

    

    
}