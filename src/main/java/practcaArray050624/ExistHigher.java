package practcaArray050624;

import java.util.List;

import static util.MyList.listOf;

/*Write a function that returns true if there exists
at least one number that is larger than or equal to n.

Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true

existsHigher([1, 2, 3, 4, 5], 8) ➞ false

existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true

existsHigher([], 5) ➞ false
*/
public class ExistHigher {

    public static boolean existsHigher(List<Integer> arr, int a) {

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) >= a) {
                return true;
            }


        }
        return false;

    }

    public static void main(String[] args) {
        List<Integer> arr1 = listOf(5, 3, 15, 22, 4);
        List<Integer> arr2 = listOf(1, 2, 3, 4, 5);
        List<Integer> arr3 = listOf(4, 3, 3, 3, 2, 2, 2);
        int c = 10;
        int b = 8;
        int d = 1;

        System.out.println(existsHigher(arr1,c));
        System.out.println(existsHigher(arr1,b));
        System.out.println(existsHigher(arr1,d));

    }
}
