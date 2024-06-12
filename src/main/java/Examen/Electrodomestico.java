package Examen;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {

    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    private final String[] coloresPermitidos = {"blanco", "negro", "azul", "gris"};


    //constructor por defecto

    public Electrodomestico() {
        this.precioBase = 900;
        comprobarColor("blanco");
        comprobarConsumoEnergetico('F');
        this.peso = 10;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    private void comprobarConsumoEnergetico(char consumo) {

        if (consumo >= 'A' && consumo <= 'F') {
            this.consumoEnergetico = consumo;
        } else {
            this.consumoEnergetico = 'F';
        }
    }


    private boolean comprobarColor(String colorIngresado) {

        for (String colorValido : coloresPermitidos) {

            if (colorValido.equalsIgnoreCase(colorIngresado)) {
                return true;
            }
        }
        return false;

    }
public double precioFinal() {
    int precioPorConsumo = 0;
    int precioPorPeso = 0;

    int precioSegunVariables= this.precioBase+precioPorConsumo + precioPorPeso;

    switch (this.consumoEnergetico) {

        case 'A':
            precioPorConsumo = 1000;
            break;
        case 'B':
            precioPorConsumo = 800;
            break;
        case 'C':
            precioPorConsumo = 600;
            break;
        case 'D':
            precioPorConsumo = 500;
            break;
        case 'E':
            precioPorConsumo = 300;
            break;
        case 'F':
            precioPorConsumo = 100;
            break;

    }

    if (this.peso >= 0 && peso < 20) {
        precioPorPeso = 100;
    } else if (this.peso >= 20 && this.peso <= 49) {
        precioPorPeso = 500;

    } else if (this.peso >= 50 && this.peso <= 79) {
        precioPorPeso = 800;
    } else if (this.peso > 80) {
        precioPorPeso = 1000;
    }

    return precioSegunVariables;
}
    //getters and Setters
    public int getPrecioBase () {
        return precioBase;
    }


    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
