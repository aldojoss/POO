public class Auto extends CargaVehiculo{
    


    private String tipogasolina;

    public Auto(String modelo, String marca, int año, int kilometraje, int numeropasajeros, int capacidadcarga, String tipogasolina){
        super(modelo, marca, año, kilometraje, numeropasajeros, capacidadcarga);
        this.tipogasolina=tipogasolina;

        
    }

    public String getTipogasolina() {
        return tipogasolina;
    }
    public void setTipogasolina(String tipogasolina) {
        this.tipogasolina = tipogasolina;
    }

    @Override
    public void mostrarinfo() {
        
        super.mostrarinfo();
System.out.println("Tipo de gasolina "+tipogasolina);

    }

    @Override
    public void mantenimiento() {
       
        super.mantenimiento();
        System.out.println("Realizando un mantenimiento de Limpieza vehicular.....");
    }



    public double Costomantenimiento(double costoporkilometros, double kilometrosrecorridos){

        double costopormantenimiento = costoporkilometros*kilometrosrecorridos;

        return costopormantenimiento;
    }
}
