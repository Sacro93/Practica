package Examen;

public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    // Constructor por defecto
    public Television() {
        // Llama al constructor de la clase padre con valores por defecto
        super(900, "blanco", 'F', 10);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }


    // Constructor con precio y peso. El resto por defecto
    public Television(int precioBase, int peso) {
// Llama al constructor de la clase padre con valores por defecto para color y consumo energético
        super(precioBase, "blanco", 'F', peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;

    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Método precioFinal() que modifica el precio según la resolución y el sintonizador TDT
//Un método precioFinal() sobrescrito que ajusta el precio final basado en la resolución y si tiene sintonizador TDT.
    @Override
    public double precioFinal() {
        // Llama al método de la clase padre
        double precioTv = super.precioFinal();

        if (this.resolucion > 40) {
            precioTv += precioTv * 0.30;
        }
        if (this.sintonizadorTDT) {
            precioTv += precioTv * 0.50;
        }
        return precioTv;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
