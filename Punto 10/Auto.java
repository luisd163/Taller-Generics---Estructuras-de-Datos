
public class Auto extends Vehiculo{

    public Auto(String placa) {
        super(placa);
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando auto con placa: " + super.placa);
    }
    
}
