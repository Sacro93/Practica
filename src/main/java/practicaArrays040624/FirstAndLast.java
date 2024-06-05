package practicaArrays040624;

import java.util.ArrayList;
import java.util.List;

import static util.MyList.listOf;

/*Create a function that takes an array of strings and return the first and last elements as a new array.

Examples
firstLast(["one", "two"]) ➞ ["one", "two"]

firstLast(["edabit", "13", "true"]) ➞ ["edabit", "true"]

firstLast(["zero"]) ➞ ["zero"]*/
public class FirstAndLast {

    public static List<String> firstLast(List<String> array) {


        String posicion1 = array.get(0);
        String posicion2 = array.get(array.size() - 1);
        List<String> arrayNuevo = new ArrayList<>();
        arrayNuevo.add(posicion1);
        arrayNuevo.add(posicion2);

        return arrayNuevo;
    }

    public static void main(String[] args) {

        List<String> variado = listOf("10", "40","40" ,"caca");

        System.out.println(firstLast(variado));
    }

}
