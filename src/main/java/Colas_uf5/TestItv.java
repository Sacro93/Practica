package Colas_uf5;

import java.util.PriorityQueue;

/*Clase TestItv probando lo que has implementado anteriormente:
inicializando la cola, simulando la
llegada y la atención de vehículos, según creas conveniente.*/
public class TestItv {
    public static void main(String[] args) {


        PriorityQueue<Vehiculo> v = new PriorityQueue<>(new VehiculoComparator());

        v.add(new Vehiculo(1, "aa7122", "Fiat", "500"));
        v.add(new Vehiculo(2, "aa2222", "VW", "Golf"));
        v.add(new Vehiculo(2, "af2112", "Fiat", "cccc"));
        v.add(new Vehiculo(2, "ad5122", "Fiat", "Punto"));
        v.add(new Vehiculo(1, "av3422", "Fiat", "Spcio"));

        Vehiculo autitollegando = new Vehiculo(2, "8w8w8w8", "Renault", "Sandero");

        Ventanilla ventanillaItv = new Ventanilla();


        ventanillaItv.llegadaVehiculo(autitollegando);

while (!ventanillaItv.vehiculosEnCola.isEmpty()) {
    Vehiculo vehiculoAtendido = ventanillaItv.atiendeVehiculo();
    System.out.println("Vehículo atendido: " + vehiculoAtendido.getMatricula());
}

    }
}
