package Examen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(200, "blanco", 'A', 30, 5));
        electrodomesticos.add(new Television(300, "negro", 'B', 20, 40, true));

        double precioTotalLavadoras=0;
        double precioTotalTelevisores= 0;

        for (Electrodomestico e : electrodomesticos) {
            double precio = e.precioFinal();
            System.out.println("Precio del electrodomestico " + precio);

        if (e instanceof Lavadora){
            precioTotalLavadoras += precio;
        }else if(e instanceof Television){
            precioTotalTelevisores += precio;
        }

            System.out.println("Precio total lavadoras " + precioTotalLavadoras +" €");
            System.out.println("Precio total televisores " + precioTotalTelevisores +" €");

        }

    }


}
