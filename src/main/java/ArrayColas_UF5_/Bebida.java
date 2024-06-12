package ArrayColas_UF5_;

import java.util.ArrayList;
import java.util.List;

public class Bebida extends Alimento{
    private double mililitros;

    public Bebida(String nombre, double precio, double mililitros) {
        super(nombre, precio);
        this.mililitros=mililitros;

    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }
}
