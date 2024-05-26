public class PasajerosVehiculo extends Vehiculo {

    public int numeropasajeros;
// contrustcores
    public PasajerosVehiculo(String modelo, String marca, int año, int kilometraje, int numeropasajeros){


        super(modelo, marca, año, kilometraje);
        
        this.numeropasajeros=numeropasajeros;
    }


    // getter y seter
    public int getNumeropasajeros() {
        return numeropasajeros;
    }

    public void setNumeropasajeros(int numeropasajeros) {

        this.numeropasajeros = numeropasajeros;
    }

    @Override
    public void mostrarinfo() {
        
        super.mostrarinfo();

        System.out.println("Numero de pasajeros "+ numeropasajeros);
    }

  




}
