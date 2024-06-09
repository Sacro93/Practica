package clasesAbstactas;

public class Tv extends Electrodomestico {

private int pulgadas;
    public Tv( int potencia, String color, String consumo, int pulgadas) {
        super( potencia, color, consumo);
        this.pulgadas=pulgadas;
    }

    @Override
    public void reparar() {
        System.out.println("Esto repara tv");
    }

    public void conectarseAInternet() {}

    @Override
    public void encender() {
        super.encender();
        conectarseAInternet();
    }
}
