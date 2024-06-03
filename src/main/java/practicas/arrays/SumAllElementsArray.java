package practicas.arrays;

import java.util.ArrayList;
import java.util.List;

/*Create a function that takes an array and returns the sum of all numbers in the array.

Examples
sum([2, 7, 4]) ➞ 13

sum([45, 3, 0]) ➞ 48

sum([-2, 84, 23]) ➞ 105*/
public class SumAllElementsArray {

    List<Integer> arr;

    public static int sum(List<Integer> arr){
        int acumulador= 0 ;
        for( Integer numero : arr){

                acumulador += numero;
        }

     return acumulador;
    }

    public static void main(String[] args){

        List<Integer> arr1 =new ArrayList<>();

        arr1.add(10);
        arr1.add(11);
        arr1.add(12);

        System.out.println(sum(arr1));
    }
}
