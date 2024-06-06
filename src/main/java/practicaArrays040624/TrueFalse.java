package practicaArrays040624;

/*Create a function that returns a converted array
of boolean values from a given bit string. Basically,
a bit character 1 is true, otherwise, it's false.

Examples
integerBoolean("0110") ➞ [false, true, true, false]

integerBoolean("100101") ➞ [true, false, false, true, false, true]

integerBoolean("10") ➞ [true, false]

integerBoolean("001") ➞ [false, false, true]*/


public class TrueFalse {

    public static boolean[] unosCeros(String str) {

        boolean[] trueFalse = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1'){

                trueFalse[i] =true;
            }
            }


        return trueFalse;
    }

    public static void main(String[] args) {

        String uno = "0110";
        String dos = "100101";
        String tres = "10";
        String cuatro = "001";

        System.out.println(java.util.Arrays.toString(unosCeros(uno)));
        System.out.println(java.util.Arrays.toString(unosCeros(dos)));
        System.out.println(java.util.Arrays.toString(unosCeros(tres)));
        System.out.println(java.util.Arrays.toString(unosCeros(cuatro)));
    }
}