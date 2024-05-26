public class Camion extends Auto {

    private int numejes;

    public Camion(String modelo, String marca, int año, int kilometraje, int numeropasajeros,String tipogasolina, int capacidadcarga,int numejes){
     super(modelo, marca, año, kilometraje, numeropasajeros, capacidadcarga, tipogasolina);
        this.numejes=numejes;

    }

    public int getNumejes() {
        return numejes;
    }

    public void setNumejes(int numejes) {
        this.numejes = numejes;
    }

    @Override
    public void mostrarinfo() {
       
        super.mostrarinfo();

        System.out.println("num ejes "+ numejes);
    }

    @Override
    public void mantenimiento() {
        
        super.mantenimiento();
    System.out.println("Realizando un mantenimiento de sistema de freno de aire.....");
        System.out.println("Realizando el mantenimiento de las ejes....");
    }
    

    
    




}
