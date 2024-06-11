package Colas_uf5;

import java.util.PriorityQueue;

/*Clase Ventanilla con lo siguiente:
1. Atributos:
o ColaVehículos: PriorityQueue<Vehiculo>.
2. Constructor genérico. Debes inicializar la cola con el constructor PriorityQueue, al que le pasas
una capacidad inicial y un comparador de vehículos.
3. Métodos:
o llegaVehículo(Vehículo): void. Añade un nuevo vehículo a la cola, simulando que acaba
de llegar a las instalaciones.
o atiendeVehículo(): Vehículo. Elimina un vehículo de la cabeza de la cola, simulando que
ya ha sido inspeccionado y se ha ido.*/
public class Ventanilla {

    PriorityQueue<Vehiculo> vehiculosEnCola;

    public Ventanilla() {
        this.vehiculosEnCola = new PriorityQueue<>(new VehiculoComparator());
    }

    public void llegadaVehiculo(Vehiculo autitoQueLlega) {

        this.vehiculosEnCola.add(autitoQueLlega);

    }

    public Vehiculo atiendeVehiculo() {

        return vehiculosEnCola.poll();
    }


}

