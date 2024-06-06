package practcaArray050624;

import java.util.List;
import static util.MyList.listOf;

/*Create a function which returns the number of true values there are in an array.
*
*countTrue([true, false, false, true, false]) ➞ 2

countTrue([false, false, false, false]) ➞ 0

countTrue([]) ➞ 0
*
*
*
* */

//crear una funcion que devuelve un numero y recibe un array
//recorrer el array para saber que hay en el mismo ( contabilizar los true)
//luego tengo que imprimir en numero esos true;
public class HowMuchTrue {


    public static int countTrue(List<Boolean>arr){

        int contadorTrue= 0;
        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).equals(true)){

                contadorTrue ++;

            }

        }
        return contadorTrue;
    }

    public static void main(String [] args){

        List<Boolean> trueFalse = listOf(true, false, false, true, false);
        System.out.println(countTrue(trueFalse));

        List<Boolean> trueFalse1 = listOf(true, false, false, false, false);
        System.out.println(countTrue(trueFalse1));

        List<Boolean> trueFalse2 = listOf(false, false, false, false, false);
        System.out.println(countTrue(trueFalse2));

    }
}
