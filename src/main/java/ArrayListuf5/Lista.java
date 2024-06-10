package ArrayListuf5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Lista: contiene la lista de Personas y los métodos para
operar con ella. Debe contener los siguientes atributos:
o lista (ArrayList): ArrayList con el listado de Personas. */
public class Lista {
    private List<Persona> listadoPersonas;

    public Lista() {
        this.listadoPersonas = new ArrayList<>();
    }


    // • listar(): lista todos las personas de la lista.
    public void listar() {

        for (Persona perso : listadoPersonas) {
            System.out.println(perso);
        }
    }

    //• insertar(): insertar una perslona de final de la lista.
    public void insertar(Persona persona) {
        listadoPersonas.add(persona);
    }

    //eliminar(): eliminar una persona de la lista.
    public List<Persona> eliminar(Persona persona) {
        listadoPersonas.remove(persona);
        return listadoPersonas;
    }

    public List<Persona> cargar(Persona personita) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int intt = sc.nextInt();

        System.out.println("Inserte nombre" + listadoPersonas.add(this.n
        ));
        System.out.println("Inserte apellido");
        System.out.println("Inserte DNI");
        System.out.println("Inserte edad");
        System.out.println("Inserte calle");
        System.out.println("Inserte numero");
        System.out.println("Inserte cp");
        System.out.println("Inserte provincia");

    }
}

    /*
   cargar(): cargar los datos de la tabla anterior en la lista.

•
• contar(): muestra el número de personas de la lista. */

//    public List<Persona> cargar(Persona persona){
//
//
//
//        }
//}

