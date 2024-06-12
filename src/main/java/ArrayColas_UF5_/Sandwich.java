package ArrayColas_UF5_;

import java.util.List;

public class Sandwich extends Alimento{

    private String sabor;

    public Sandwich(String nombre, double precio, String sabor){
        super(nombre,precio);
        this.sabor=sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "sabor='" + sabor + '\'' +
                '}';
    }
}
