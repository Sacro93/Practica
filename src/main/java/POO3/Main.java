package POO3;

public class Main {

    public void main(String[] args){

        Circle circulo= new Circle(200);
        String colorNuevo="blue";

        circulo.getArea();
        circulo.changeColor(colorNuevo);
        circulo.getCircunferencia();

       circulo.toString();
    }
}
