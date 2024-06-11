package ArrayListuf5;

import java.util.ArrayList;
import java.util.List;


public class Lista {
    private List<Persona> listadoPersonas;

    public Lista(List<Persona> listadoPersonas) {

        this.listadoPersonas = new ArrayList<>();
    }

// cargar(): cargar los datos de la tabla anterior en la lista.


    public void cargar(Persona persona) {
          this.listadoPersonas.add(persona);
    }

    // • listar(): lista todos las personas de la lista.
    public List<Persona> listar() {

        return listadoPersonas;
    }


    public void insertar(Persona persona) {
        listadoPersonas.add(persona);
    }

    //eliminar(): eliminar una persona de la lista.
    public List<Persona> eliminar(Persona persona) {
        this.listadoPersonas.remove(persona);
        return this.listadoPersonas;
    }


    //• contar(): muestra el número de personas de la lista. */
    public int contar() {

        return listadoPersonas.size();
    }


    // buscar(): busca una Persona por el DNI, si la encuentra, muestra los datos de la persona, en caso contrario monstrar
    //un mensaje que diga que esa persona no se encuentra en la lista.

    public String buscar(String dni) {


        for (Persona persona : listadoPersonas) {
            if (dni.equals(persona.getDni())) {
                return persona.toString();
            }
        }
        return "No se encuentra en la lista";
    }
}


