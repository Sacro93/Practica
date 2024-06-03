package practicas.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given two arguments, return an array which contains these two arguments.

Examples
makePair(1, 2) ➞ [1, 2]

makePair(51, 21) ➞ [51, 21]

makePair(512124, 215) ➞ [512124, 215]*/

public class PairManagement {

//    List<Integer> arr = new ArrayList<>();

    public static List<Integer> makePair(int a, int b){
        List<Integer> arr = new ArrayList();
        arr.add(a);
        arr.add(b);
        return arr;
    }

    public static void main (String[] args ){


        System.out.println(makePair(10,20));

    }

}

//public class PairManagement{
//
//    public static int[] makePair(int a, int b){
//        int[] pair ={a,b};
//        return  pair;
//
//    }
//
//    public static void main(String[] args ){
//        int [] pair1 = makePair(10,20);
//
//        System.out.println(Arrays.toString(pair1));
//
//    }
//}






