public class CargaVehiculo extends PasajerosVehiculo {

    private int capacidadcarga;

     // constructor haciendo referencia al constr pasado heredando la clase pasada tbm
    public CargaVehiculo(String modelo, String marca, int año, int kilometraje, int numeropasajeros, int capacidadcarga){

        super(modelo, marca, año, kilometraje, numeropasajeros);
        this.capacidadcarga=capacidadcarga;
    }


     //get y set otra vez
     public int getCapacidadcarga() {
        return capacidadcarga;
    }

     public void setCapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }

    @Override
    public void mostrarinfo() {
        // TODO Auto-generated method stub
        super.mostrarinfo();
        System.out.println("Capacidad carga "+capacidadcarga);
    }

    
    




}
