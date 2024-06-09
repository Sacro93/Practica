package POO4;

/*
 * class rectangle
 *
 *
 *
 * */
public class Rectangle {

    private float height;
    private float width;

    public Rectangle(float length, float width) {
        this.height = length;
        this.width = width;
    }
    //metodos

    public double getArea() {

   return  height*width;


    }

    public double getPerimeter() {

        double resultado = (2*width+ 2*height);

        return  resultado;
    }


    //getter and setter
    public float getLength() {
        return height;
    }

    public void setLength(float length) {
        this.height = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String toString() {

       return  "Datos Rectangulo" + "Altura : " + this.height + "," + "Ancho : " + this.width + " , " +
                "Resultado Area : " + getArea() + " , " + "Resultado Perimetro : " + getPerimeter();
    }
}
