package Colas_uf5;

import java.util.Comparator;

 class VehiculoComparator  implements Comparator<Vehiculo> {
     public int compare(Vehiculo a, Vehiculo b){
        //prioridad alta primero
         return Integer.compare(a.getPrioridad(), b.getPrioridad());

     }


}
