package practicas.arrays;
/*Create a function that takes an array containing only numbers and return the first element.
getFirstValue([1, 2, 3]) ➞ 1

getFirstValue([80, 5, 100]) ➞ 80

getFirstValue([-500, 0, 50]) ➞ -500
 */
public class FirstElement {

public static int getFirstValue(int[] arr){
    return arr[0];

}
    public static void main (String[] args){

        int[] arr1 = {1, 2, 3};
        int[] arr2 ={80, 5, 100};
        int [] arr3 ={-500,0,100};

        System.out.println(getFirstValue(arr1));
        System.out.println(getFirstValue(arr2));

    }
}
