package clasesAbstactas;

public abstract class Electrodomestico {

    private int potencia;
    private String color;
    private  String consumo;

    private  boolean encendido;

    public Electrodomestico( int potencia, String color, String consumo) {

        this.potencia = potencia;
        this.color = color;
        this.consumo = consumo;
        this.encendido = false;
    }
    //solamente se va a poder llamar desde los hijos



    public void encender(){
        this.encendido= true;
    }

    public abstract void reparar();
}
