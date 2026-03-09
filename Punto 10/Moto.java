
public class Moto extends Vehiculo{

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando moto con placa: " + super.placa);
    }

    public void conducir(){
        System.out.println("La moto está siendo conducida");
    }

    public void cargar(){
        System.out.println("El camion está cargando mercancía");
    }
}
