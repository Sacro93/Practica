package practicaArrays040624;

import java.util.List;

import static util.MyList.listOf;

/*Write a function that returns true if all integers in an array
 are factors of a number, and false otherwise.

 checkFactors([2, 3, 4], 12) ➞ true
// Since 2, 3, and 4 are all factors of 12.

checkFactors([1, 2, 3, 8], 12) ➞ false
// 8 is not a factor of 12.

checkFactors([1, 2, 50], 100) ➞ true

checkFactors([3, 6], 9) ➞ false
 */
public class CheckFactors {

    public static boolean check(List<Integer> numbers, int factor) {

        for (int i = 0; i < numbers.size(); i++) {

            if (factor % numbers.get(i) != 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        List<Integer> num = listOf(1, 2, 3, 8);
        int fact = 12;
        System.out.println(check(num, fact));

        List<Integer> num1 = listOf(2, 3, 4);
        System.out.println(check(num1, fact));

        List<Integer> num2 = listOf(1, 2, 50);
        int fact1 = 100;
        System.out.println(check(num2,fact1));

        List<Integer> num3 = listOf(3, 6);
        int fact2 = 9;
        System.out.println(check(num3,fact2));
    }
}
