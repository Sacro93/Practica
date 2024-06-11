package Colas_uf5;

import java.util.Comparator;
/*Métodos:
o compare(Vehiculo, Vehiculo): int. Implementa el método compare heredado de la clase
Comparator, el cual recibe dos objetos de tipo Vehículo, y devuelve un entero que tomará
los siguientes valores:
i.
Clase TestItv probando lo que has implementado anteriormente: inicializando la cola, simulando la
llegada y la atención de vehículos, según creas conveniente.
Número negativo si vehiculo1.prioridad > vehiculo2.prioridad
ii.
iii.
Cero si vehiculo1.prioridad = vehiculo2.prioridad.
Número positivo si vehiculo1.prioridad < vehiculo2.prioridad */
 class VehiculoComparator  implements Comparator<Vehiculo> {
     public int compare(Vehiculo a, Vehiculo b){
        //prioridad alta primero
         return Integer.compare(a.getPrioridad(), b.getPrioridad());

     }


}
