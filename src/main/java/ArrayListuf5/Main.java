package ArrayListuf5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro();

        List<Persona> personasTabla = new ArrayList<>();

        personasTabla.add(new Persona("Garcia", "Santos", "11111111A",
                "23", new Direccion("C/los Olivos 3", 38493, "Santa Cruz de Tenerife")));

        personasTabla.add(new Persona("Mendez", "Santos", "222222222B",
                "22", new Direccion("C/los Pinos 25", 38403,
                "Santa Cruz de Tenerife")));
        personasTabla.add(new Persona("Sanchez", "Camacho", "333333333C",
                "45", new Direccion("C/los Franceses 25", 38505,
                "Las palmas")));
        personasTabla.add(new Persona("Brito", "Gonzalez", "44444444D",
                "30", new Direccion("C/los Pinos 25", 38403,
                "Las palmas")));
//        List<Persona> listadazo = new ArrayList<>() {
//        };

        Persona personaje1 = new Persona("francisco", "sacroisky", "37678600A",
                "31", new Direccion("castillejos 425", 8024, "Barcelona"));
        Persona personaje2 = new Persona("Jorge", "Gomez", "38555544",
                "31", new Direccion("castillejos 425", 8024, "Barcelona"));

        boolean continuar = true;
        while (continuar) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa las opciones" +
                    "1-Cargar los datos de la tabla anterior en la lista." +
                    "2-Usar el metodo listar" +
                    "3-Insertar una persona de final de la lista." +
                    "4- Eliminar" +
                    "5-Contar " +
                    "6-Buscar por DNI" +
                    "0-Salir"
            );
            int opcion = sc.nextInt();

            switch (opcion) {

                case 0:
                    System.out.println(
                            "Saliendo programa"
                    );
                    continuar = false;
                    break;
                case 1:


                    libro.cargar(personasTabla);
                    break;
                case 2:

                    System.out.println(libro.listar());
                    break;
                case 3:

                    libro.insertar(personaje1);
                    libro.insertar(personaje2);

                    break;
                case 4:

                    System.out.print("Ingrese el índice de la persona a eliminar: ");
                    int indice = sc.nextInt();

                    libro.eliminar(indice);
                    break;
                case 5:
                    System.out.println("Hay un total de  " + libro.contar() + " personas en el listado");
                    break;
                case 6:
                    System.out.print("Ingrese dni de la persona a buscar: ");

                    String numerito = sc.nextLine();
                    sc.nextLine().trim();
                    Persona search = libro.buscar(numerito);
                    if (search != null) {
                        System.out.println("Persona buscada " + search);
                    } else {
                        System.out.println("Persona no encontrada con " + numerito);
                    }
                    break;
                default:
                    System.out.println("Opcion invalida, hay 7 opciones");
                    ;
            }
        }

    }
}
