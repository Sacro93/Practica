package practicaArrays040624;

import java.util.List;

import static util.MyList.listOf;

/*Create a function that takes an array and a string as
 arguments and returns the index of the string.

Examples
findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh") ➞ 2

findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue") ➞ 1

findIndex(new String[]{"a", "g", "y", "d"}, "d") ➞ 3

findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple")*/
public class Find {
    public static int findIndex(List<String> arr, String arg) {

        int index = arr.indexOf(arg);
        return index;
    }

    public static void main(String[] args) {

        List<String> array = listOf("hi", "edabit", "fgh", "abc");
        String index = "fgh";
        System.out.println(findIndex(array, index));

        List<String> array1 = listOf("Red", "blue", "Blue", "Green");
        String index1 = "blue";
        System.out.println(findIndex(array1, index1));
    }

}
