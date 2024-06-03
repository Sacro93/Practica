package practicas.arrays;

import java.util.ArrayList;
import java.util.List;

/*
double numero = 16.0;
double raizCuadrada = Math.sqrt(numero);
System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

double numero = 27.0;
double raizCubica = Math.cbrt(numero);
System.out.println("La raíz cúbica de " + numero + " es: " + raizCubica);

checkSquareAndCube([4, 8]) ➞ true

checkSquareAndCube([16, 48]) ➞ false

checkSquareAndCube([9, 27]) ➞ true
*/
public class SquaresCubes {

    //primero sacar la raiz cuadrada

    //segundo sacar la raiz cubica
    //tercero comparar

    public static boolean checkSquareAndCube(List<Integer>array){
        double numero1 = array.get(0);
        double raizCuadrada = Math.sqrt(numero1);

        double numero2 = array.get(array.size() -1);
        double raizCubica= Math.cbrt(numero2);


        if ( raizCuadrada == raizCubica ){
            return true;
        }
        return false;
    }
    //cuarto imprimir

    public static void main (String[] args ){

        List<Integer> array1 = new ArrayList<>();
        array1.add(4);
        array1.add(8);

        System.out.println(checkSquareAndCube(array1));
    }

}
