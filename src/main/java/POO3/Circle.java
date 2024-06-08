package POO3;

/*A class called circle is designed as shown in the following class diagram. It contains:

Two private instance variables:
-radius (of the type double) and color (of the type String),
-with default value of 1.0 and "red", respectively.
-Two overloaded constructors - a default constructor with no argument, and a constructor which
takes a double argument for radius.
-Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.*/
public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {

        this.radius = radius;
        this.color = "red";
    }

    public double getRadius(double radius) {

        return radius;

    }

    public double getArea() {
        double pi = 3.14159;
        double area = pi * (radius * radius);

        System.out.println(area);

        return area;
    }
    public void changeColor(String newColor){
        this.color=newColor;

        System.out.println(newColor);

    }

    public double getCircunferencia(){

        double pi= 3.14159;
        double resultado= 2 * pi* radius;
        System.out.println(resultado);
        return resultado;
    }

    @Override
    public String toString(){
        System.out.println("Atributos " + this.radius + " , " + this.color);

        return null;
    }
}
