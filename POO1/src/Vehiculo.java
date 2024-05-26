public class Vehiculo {
    
private String modelo;
private String marca;
private int año;
private int kilometraje;

 public Vehiculo(String modelo, String marca, int año, int kilometraje){

    this.año=año;
    this.kilometraje=kilometraje;
    this.marca=marca;
    this.modelo=modelo;
}


// aqui van los getter y setter 
public int getAño() {
    return año;
}
public void setAño(int año) {
    this.año = año;
}

public int getKilometraje() {
    return kilometraje;
}

public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void mostrarinfo(){

    System.out.println("Marca "+ marca);
    System.out.println("Modelo "+ modelo);
    System.out.println("año "+ año);
    System.out.println("kilometraje "+ kilometraje);




}

public void mantenimiento(){

   
}



}
