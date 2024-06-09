package interfaces;

import java.lang.reflect.Constructor;

public class Persona implements Comparable<Persona> {
    private int altura;
    private String nombre;


    public Persona(int altura, String nombre) {

        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {

        return this.altura - o.altura ;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
