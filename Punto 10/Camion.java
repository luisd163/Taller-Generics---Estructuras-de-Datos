
public class Camion extends Vehiculo{

    public Camion(String placa) {
        super(placa);
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando camion con placa: " + super.placa);
    }   
}
