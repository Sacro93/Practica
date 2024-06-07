package practcaArray050624;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static util.MyList.listOf;

public class CaptureRock {

    //Debo crear una funcion que recibe un Array y devuelve un boolean

    // debo separar el arran con char,
    // iterar con for each cada caracter
    //luego comparar el array list

    public static boolean canCapture(List<String> arr) {

        List<Character> charList = new ArrayList<>();


        for (String str : arr) {
            // Iterar sobre cada carácter en el string
            for (char c : str.toCharArray()) {
                // Agregar el carácter al nuevo ArrayList
                charList.add(c);
            }
        }

        for (int i = 0; i < charList.size(); i++) {


            if (Objects.equals(charList.get(0), charList.get(2)) || Objects.equals(charList.get(1), charList.get(3))) {
                return true;
            }


        }
        return false;
    }


    public static void main(String[] args) {


        List<String> arr1 = listOf("A8", "E8");//true
        List<String> arr2 = listOf("A1", "b2");//false
        List<String> arr3 = listOf("h4", "h3");//true
        List<String> arr4 = listOf("f5", "c8");//false

        System.out.println(canCapture(arr1));
        System.out.println(canCapture(arr2));
        System.out.println(canCapture(arr3));
        System.out.println(canCapture(arr4));
    }
}
