package ArrayColas_UF5_;

import java.util.Scanner;

public class TestMaquinaExpendedora {

    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();


        // LLenamos la máquina de alimentos
        maquina.reponerMaquina(new Bebida("Coca-Cola Zero", 1.0, 300));
        maquina.reponerMaquina(new Bebida("Fanta Naranja", 1.2, 300));
        maquina.reponerMaquina(new Sandwich("Mixto", 2.5, "Pollo y Mayonesa"));
        maquina.reponerMaquina(new Sandwich("Vegan", 2.2, "Lechuga y queso"));
        maquina.reponerMaquina(new Snack("Patatas fritas", 1.5, 100));
        maquina.reponerMaquina(new Snack("Frutos secos", 2.0, 40));



// Prueba de las opciones
        int opcion;
        do {
            System.out.println("\nElige una opción:");
            System.out.println("0. Snacks");
            System.out.println("1. Sándwiches");
            System.out.println("2. Bebidas");
            System.out.println("3. Salir");
            System.out.print("> ");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            if (opcion >= 0 && opcion <= 2) {
                maquina.expenderAlimento(opcion);
            } else if (opcion == 3) {
                System.out.println("Apagando máquina...");
            } else {
                System.out.println("Opción incorrecta.");
            }
        } while (opcion != 3);
// Información final
        System.out.println("\n**Información de la máquina**");
        System.out.println(maquina);
        System.out.println("Recaudación: " + maquina.getRecaudacion() + "€");
        System.out.println("Capacidad: " + maquina.capacidad() + "%");


    }

}
