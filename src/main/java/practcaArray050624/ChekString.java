package practcaArray050624;

import java.util.*;
import java.util.Arrays;

/*Create a function that takes two strings and returns true
if the first string ends with the second string; otherwise return false.

checkEnding("abc", "bc") ➞ true

checkEnding("abc", "d") ➞ false

checkEnding("samurai", "zi") ➞ false

checkEnding("feminine", "nine") ➞ true

checkEnding("convention", "tio") ➞ false

*/
public class ChekString {

    public static boolean checkEnding(String a, String b) {


        //verifico largo b mayor que a
        if (b.length() > a.length()) {
            return false;
        }
        //obtener la cadena de a que tiene el mismo largo que b
        String subCadenaDeA= a.substring(a.length() - b.length());
        return subCadenaDeA.equals(b);
    }
    public static void main(String[] args) {

        System.out.println(checkEnding("abc", "bc"));
        System.out.println(checkEnding("abc", "d"));
        System.out.println(checkEnding("samurai", "zi"));
        System.out.println(checkEnding("feminine", "nine"));
        System.out.println(checkEnding("convention", "tio"));
    }
}