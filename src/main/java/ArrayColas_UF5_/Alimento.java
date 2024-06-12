package ArrayColas_UF5_;

import java.util.ArrayList;
import java.util.List;

public abstract class Alimento implements Comparable<Alimento> {

   private String nombre;
    private double precio;
    private List<String> alergenos;

    public Alimento(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
        this.alergenos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getAlergenos() {
        return alergenos;
    }

    public void setAlergenos(List<String> alergenos) {
        this.alergenos = alergenos;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", alergenos=" + alergenos +
                '}';
    }
    @Override
    public int compareTo(Alimento otroAlimento){
        return Double.compare(this.precio,otroAlimento.getPrecio());
    }
}
