package ArrayColas_UF5_;

import java.util.List;

public class Snack extends Alimento {

    private double peso;

    public Snack(String nombre, double precio, double peso) {

        super(nombre, precio);
        this.peso = peso;


    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "peso=" + peso +
                '}';
    }
}
