package practicaArrays040624;

import java.util.List;
import static util.MyList.listOf;
/*Create a function that takes in an array of numbers and returns the sum of its cubes.

Examples
sumOfCubes([1, 5, 9]) ➞ 855
// Since 1^3 + 5^3 + 9^3 = 1 + 125 + 729 = 855

sumOfCubes([3, 4, 5]) ➞ 216

sumOfCubes([2]) ➞ 8

sumOfCubes([]) ➞ 0*/
public class SumOfCubes {

    public static int sumOfCubes(List<Integer> arr) {

        int acumulador = 0;


        for (int i = 0; i < arr.size(); i++) {

            int operacion = arr.get(i) *arr.get(i)*arr.get(i);
            //int operacion = (int) Math.pow(arr.get(i), 3);

            acumulador += (int) operacion;
        }
        return acumulador;
    }

    public static void main(String[] args) {


    List<Integer> array = listOf(1, 5, 9 );

        System.out.println(sumOfCubes(array));
    }
}

