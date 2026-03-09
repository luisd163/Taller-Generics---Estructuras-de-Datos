
public abstract class Vehiculo {

    protected String placa;

    public Vehiculo(String placa){
        this.placa = placa;
    }
    
    public abstract void alquilar();


    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}
