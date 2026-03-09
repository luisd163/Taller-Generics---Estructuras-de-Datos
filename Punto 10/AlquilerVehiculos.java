import java.util.List;

public class AlquilerVehiculos {
    
    private String nombre;

    public AlquilerVehiculos(String nombre) {
        this.nombre = nombre;
    }

    public void alquilar_vehiculos(List<? extends Vehiculo> lista){
        for (Vehiculo vehiculo : lista) {
            vehiculo.alquilar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
