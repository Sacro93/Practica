package ArrayListuf5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Libro {
    //arrayList
    private List<Persona> listadoPersonas;


    //que propiedades quiero que se inicialicen y que no
    public Libro() {

        this.listadoPersonas = new ArrayList<>();
    }

// cargar(): cargar los datos de la tabla anterior en la lista.


    public void cargar(List<Persona> unListado) {
        listadoPersonas.addAll(unListado);
    }

    // • listar(): lista todos las personas de la lista.
    public List<Persona> listar() {
        ;
        return listadoPersonas;

    }


    public void insertar(Persona persona) {
        listadoPersonas.add(persona);
    }

    //eliminar(): eliminar una persona de la lista por un numero dado.
    public void eliminar(int numero) {

        if ( numero >= 0 && numero < listadoPersonas.size()){

            listadoPersonas.remove(numero);
            System.out.println("eliminado");
        }else {
            System.out.println("indice no existe, recorda el Size del ArrayList es " + listadoPersonas.size());
        }
    }


    //• contar(): muestra el número de personas de la lista. */
    public int contar() {

        return listadoPersonas.size();
    }


    // buscar(): busca una Persona por el DNI, si la encuentra, muestra los datos de la persona, en caso contrario monstrar
    //un mensaje que diga que esa persona no se encuentra en la lista.

//    public String buscar(String dni) {
//
//
//        for (Persona persona : listadoPersonas) {
//            if (dni.equals(persona.getDni())) {
//                return persona.toString();
//            }
//        }
//        return "No se encuentra en la lista";
//    }
public Persona buscar(String dni){
        for (Persona persona : listadoPersonas){
            if (persona.getDni().equals(dni)){
                return persona;
            }

        }
        return null;
}

    public List<Persona> getListadoPersonas() {
        return listadoPersonas;
    }

    public void setListadoPersonas(List<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }
}


