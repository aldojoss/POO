

public class App {
    public static void main(String[] args) throws Exception {
        
      // instancia para los datos del auto


      Auto a1 = new Auto("23KAL", "TOYOTA", 2024, 04, 5, 300, "DIESEL");
      
System.out.println("INFORMACION CARRO");
System.out.println("-----------------");

      a1.mostrarinfo();
      a1.mantenimiento();
     
//instancia para los datos del camion

Camion camion= new Camion("KIA", "KIA2903", 2024, 30, 3, "diesel", 300, 3);

System.out.println("INFORMACION CAMION");
System.out.println("-----------------");

camion.mostrarinfo();
camion.mantenimiento();

System.out.println();
System.out.println();

System.out.println("El costo por mantenimiento del carro es de "+a1.Costomantenimiento(4, 10));
System.out.println();
System.out.println();
System.out.println("El costo por mantenimiento del camion es de "+camion.Costomantenimiento(6, 40));

    }
}
