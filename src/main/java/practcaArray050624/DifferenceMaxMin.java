package practcaArray050624;

import java.util.List;
import static util.MyList.listOf;

/*
*
* Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.*/
public class DifferenceMaxMin {


    public static int differenceMaxMin(List<Integer> arr){
int smallest= arr.get(0);
int biggest =arr.get(0);


        for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i) < smallest ) {
                smallest=arr.get(i) ;
               } else if (arr.get(i) > biggest){

                   biggest= arr.get(i);

               }

        }
        return biggest - smallest ;
    }

    public static void main(String[] args ){

    List<Integer> numeros = listOf(10, 4, 1, 4, -10, -50, 32, 21);

        System.out.println(differenceMaxMin(numeros));
    }
}
