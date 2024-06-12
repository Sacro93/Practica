package ArrayColas_UF5_;

import java.util.*;

public class MaquinaExpendedora {
    private ArrayList<LinkedList<Alimento>> railes;
    private double recaudacion;


    // 1Constructor genérico
    public MaquinaExpendedora() {

        //Aquí se crea un nuevo ArrayList llamado railes. Este ArrayList va a contener objetos
        // de tipo Queue, que representarán los diferentes “raíles”
        // o compartimentos donde se almacenan los productos en la máquina expendedora.
        this.railes = new ArrayList<>();
        // Se añade una nueva LinkedList al ArrayList railes. Cada L
        // inkedList es una implementación de la interfaz Queue y actuará como una cola
        // para almacenar los productos en un raíl específico.
        // Al final del bucle, tendrás tres colas (raíles) en tu ArrayList.
        for (int i = 0; i < 3; i++) {
            this.railes.add(new LinkedList<>());

        }
        this.recaudacion = 0;
    }


    //2 ReponerMaquina(Alimento): void. Repone la máquina con el alimento que se le pasa como parámetro.
    //INSTANCEOF se utiliza para verificar si un objeto es una instancia de una
    // clase específica o de una subclase de esa clase. Es muy útil para asegurarse de que el tipo
    // del objeto sea el esperado antes de realizar operaciones específicas del tipo en cuestión.

    public void reponerMaquina(Alimento producto) {
        if (producto instanceof Bebida) {
            railes.get(2).add(producto);
        } else if (producto instanceof Sandwich) {
            railes.get(1).add(producto);
        } else if (producto instanceof Snack) {
            railes.get(0).add(producto);
        } else {
            System.out.println("Tipo de alimento no valido");
        }
    }


    //3 expenderAlimento(int): Alimento. Expende un alimento según elección del usuario
    // (0 para snacks, 1 para sándwiches y 2 para bebidas).
    //se utiliza para recuperar y eliminar el elemento que está al frente
    // de la cola, es decir, el elemento que se añadió primero
    public Alimento expenderAlimento(int opcion) {
        if (opcion < 0 || opcion > 2) {
            System.out.println("Opcion incorrecta");
            return null;
        }
        Alimento alimento = railes.get(opcion).poll();
        if (alimento != null) {
            //sumo dinero a la recaudacion
            recaudacion += alimento.getPrecio();
            System.out.println("Entregando el alimento \n " + alimento + " Precio " + alimento.getPrecio() + " €");
            return alimento;
        } else {
            System.out.println("El rail seleccionado esta vacio");
            return null;
        }
    }

    //4 toString
    @Override
    public String toString() {
        return "Maquina expendedora con : " + railes + ", recaudacion: " + recaudacion;
    }

    //5 getRecaudación(): double. Devuelve la recaudación que lleva hasta ahora la máquina.
    public double getRecaudacion() {
        return recaudacion;
    }

    //6 vaciarMáquina(): void. Vacía todos los raíles de la máquina.

    public void vaciarMaquina() {

        // es un bucle for-each que recorre todos los elementos de this.railes,
        // que es el ArrayList que contiene las colas (LinkedLists) de alimentos.
        // En cada iteración, rail representa una de las colas (LinkedLists) de Alimento.

        for (LinkedList<Alimento> rail : this.railes) {
            //que elimina todos los elementos de la lista, dejándola vacía.
            rail.clear();
        }
        this.recaudacion = 0;
    }


    //7 alergenos(): String. Devuelve los alérgenos de todos los alimentos de la máquina, cada
    //uno en una línea nueva.

    public String alergenos() {
        //se utiliza aquí para construir eficientemente una cadena de texto que contendrá
        // la lista de alérgenos. Se prefiere sobre String porque permite modificaciones
        // sin generar múltiples objetos de cadena, lo cual es más eficiente.
        StringBuilder alergenos = new StringBuilder();

        //Cada LinkedList representa un raíl de la máquina y contiene objetos Alimento.
        for (LinkedList<Alimento> rail : this.railes) {

            //itera sobre cada Alimento en el raíl actual.
            // Aquí, alimento representa un objeto individual de tipo Alimento.
            for (Alimento alimento : rail) {

                //itera sobre cada alérgeno en la lista de alérgenos del alimento actual.
                // El método getAlergenos() devuelve una lista de cadenas, cada una representando un
                // alérgeno.
                for (String alergeno : alimento.getAlergenos()) {
                    alergenos.append(alergeno).append("\n");
                    //alergenos.append(alergeno).append("\n");: Dentro del tercer bucle,
                    // se añade cada alergeno a la instancia de StringBuilder alergenos,
                    // seguido de un salto de línea (\n).
                    // Esto construye la lista de alérgenos, cada uno en una línea nueva.
                }
            }

        }

        //Este método convierte el contenido del StringBuilder alergenos en una cadena de texto (String)
        //se utiliza para eliminar cualquier espacio en blanco
        // que pueda haber al principio o al final de la cadena de texto resultante.
        return alergenos.toString().trim();
    }


    // 8 capacidad(): double. Devuelve el % de máquina que está llena (una máquina con 45 ali
    //mentos, 15 por cada raíl, será una máquina al 100% de su capacidad).

    public double capacidad() {
        int totalProductos = 0;
        double totalEspacioEnMaquina= 45.0;
// itera sobre cada LinkedList<Alimento> en
// el ArrayList railes. Cada LinkedList representa un raíl de la máquina
// y contiene objetos Alimento.
        for (LinkedList<Alimento> rail : this.railes) {
// Dentro del bucle, se suma el tamaño de cada LinkedList
// (es decir, el número de Alimento en cada raíl) a totalProductos.
// Esto acumula el número total de productos en la máquina.
            totalProductos += rail.size();

        }
        return (totalProductos / totalEspacioEnMaquina) * 100;
    }

}


