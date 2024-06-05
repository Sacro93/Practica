package practicaArrays040624;

import java.util.ArrayList;
import java.util.List;

import static util.MyList.listOf;

/*Create a function to multiply all of the values in an array by the amount of values in the given array.

Examples
MultiplyByLength([2, 3, 1, 0]) ➞ [8, 12, 4, 0]

MultiplyByLength([4, 1, 1]) ➞ ([12, 3, 3])

MultiplyByLength([1, 0, 3, 3, 7, 2, 1]) ➞  [7, 0, 21, 21, 49, 14, 7]

MultiplyByLength([0]) ➞ ([0])*/
public class MultiplyLength {

    public static List<Integer> multiplyByLength(List<Integer> arr) {

        List<Integer> arrayNuevo = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {

            int multiplicacion = arr.get(i) * arr.size();
            arrayNuevo.add(multiplicacion);

        }
        return arrayNuevo;
    }

    public static void main(String[] args) {

        List<Integer> numerosEnArray = listOf(2, 3, 1, 0);
        System.out.println(multiplyByLength(numerosEnArray));

        List<Integer> numerosEnArray1 = listOf(4, 1, 1);
        System.out.println(multiplyByLength(numerosEnArray1));

        List<Integer> numerosEnArray2 = listOf(0);
        System.out.println(multiplyByLength(numerosEnArray2));

        List<Integer> numerosEnArray3 = listOf(-1);
        System.out.println(multiplyByLength(numerosEnArray3));
    }
}

