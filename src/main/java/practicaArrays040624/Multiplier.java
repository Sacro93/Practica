package practicaArrays040624;
import static util.MyList.listOf;
import java.util.List;

/*Return the sum of all items in an array,
 where each item is multiplied by its index (zero-based). For empty arrays, return 0.
*
*indexMultiplier([1, 2, 3, 4, 5]) ➞ 40
// (1*0 + 2*1 + 3*2 + 4*3 + 5*4)

indexMultiplier([-3, 0, 8, -6]) ➞ -2
// (-3*0 + 0*1 + 8*2 + -6*3)
*
* */
public class Multiplier {

    public static int indexmultiplier(List<Integer>numbers){
      int acumulador=0;
      int i =0;
      for (Integer numero : numbers){
          int multiplicador = numero * i;
          i++;

          acumulador+=multiplicador;



        }
        return  acumulador;
    }

    public static void main(String[] args){
List<Integer> arrayNumbers = listOf(1,2,3,4,5);
        List<Integer> arrayNumberss = listOf(1,2,3,4,5);
        List<Integer> arrayNumbers1 = listOf(-3, 0, 8, -6);

        System.out.println(indexmultiplier(arrayNumberss));
     System.out.println(indexmultiplier(arrayNumbers1));
    }
}
