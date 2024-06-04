package practicas.arrays;

import java.util.List;
import static util.MyList.listOf;

/*Check if an Array Contains a Given Number
Write a function to check if an array contains a particular number.

Examples
check([1, 2, 3, 4, 5], 3) ➞ true

check([1, 1, 2, 1, 1], 3) ➞ false

check([5, 5, 5, 6], 5) ➞ true

check([], 5) ➞ false*/
public class Check {

    public static boolean check(List<Integer>arr, int numero){
//elemento: colleccion
// El bucle for-each comienza inicializando la variable elemento con el primer elemento de la colección.

        for (Integer num : arr){
            if (num == numero){

                return true;
            }
        }

return false;
    }

    public static void main (String[] args ){

        List<Integer> arr = listOf(10,5,10,5);

        System.out.println(check(arr,5));
        System.out.println(check(arr,7));
        System.out.println(check(arr,10));
    }
}
