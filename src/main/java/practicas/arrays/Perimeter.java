package practicas.arrays;
/*Create a function that takes length and width and finds the perimeter of a rectangle*/
public class Perimeter {

    public static double findPerimeter(double length , double  width){

       return  2 * ( length + width);
    }

    public static void main (String[] args ){

        double prueba = findPerimeter(6,7);
        System.out.println(prueba);
    }
}
