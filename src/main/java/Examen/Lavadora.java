package Examen;

public class Lavadora extends Electrodomestico {

    private int carga;

    // Llama al constructor de la clase padre con valores por defecto
    public Lavadora() {
        super(900, "blanco", 'F', 10);
        this.carga = 5;
    }

    // Constructor con precio y peso. El resto por defecto
    public Lavadora(int precioBase, int peso) {
        super(precioBase, "blanco", 'F', peso);
        this.carga = 5;

    }

    // Constructor con todos los atributos heredados y la carga
    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
}
