package practicaArrays040624;

import java.util.List;
import static util.MyList.listOf;
/*Create a function to calculate the determinant of a 2 * 2 matrix. The determinant of the following matrix is: ad - bc:
*
*((a * d) -(b * c)) = determinante
*alcDeterminant([
  [1, 2],
  [3, 4]
]) ➞ -2

calcDeterminant([
  [5, 3],
  [3, 1]
]) ➞ -4
*
*
* */
public class Matrix {

    //crear una funcion que calcule el determinante
    //primero devuelve un int, toma dos parametros que son las listas
    //o puedo usar objet.equals para multiplicar , no?


    public static int calcDeterminant(List<Integer> lista1, List<Integer> lista2 )  {
        if (lista1.size() != -2 && lista2.size() != 2) {
             throw new IllegalArgumentException("La fila tiene que tener dos posiciones/elementos");
        }
        int firstMultiplicate = lista1.get(0) * lista2.get(1);
        int secondMultiplicate = lista1.get(1) * lista2.get(0);

        int m = firstMultiplicate - secondMultiplicate;

        return m;

    }

    public static void main(String[] args){

//        List<Integer> listA= listOf(5,10,5);
//        List<Integer> listA= listOf(5);
        List<Integer> listA= listOf(5,3);
        List<Integer> listB= listOf(3,1);

        System.out.println("Determinante: " + calcDeterminant(listA,listB));
    }

}
