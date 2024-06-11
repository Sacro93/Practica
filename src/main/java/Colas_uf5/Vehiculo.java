package Colas_uf5;

/*Clase Vehículo con lo siguiente:
1. Atributos:
o Prioridad: int. Tomará valor 1 o 2.
o Matrícula: String.
o Marca: String.
o Modelo: String.
2. Constructor genérico.
3. Métodos:
o Getters & Setters.*/
public class Vehiculo {

    private int prioridad;
    private String matricula;
    private String marca;
    private String modelo;


    public Vehiculo(int prioridad, String matricula, String marca, String modelo) {
        this.prioridad = prioridad;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;

    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "prioridad=" + prioridad +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
