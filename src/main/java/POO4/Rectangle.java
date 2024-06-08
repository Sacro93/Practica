package POO4;

/*
 * class rectangle
 *
 *
 *
 * */
public class Rectangle {

    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    //metodos

    public double getArea() {

        double resultado = length*width;
        System.out.println(resultado);

        return  resultado;

    }

    public float getPerimeter() {

        double resultado = (2 * (length * width));
        System.out.println(resultado);
        return (float) resultado;
    }


    //getter and setter
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String toString() {

       return  "Datos Rectangulo" + "Altura : " + this.length + "," + "Ancho : " + this.width + " , " +
                "Resultado Area : " + getArea() + " , " + "Resultado Perimetro : " + getPerimeter();
    }
}
