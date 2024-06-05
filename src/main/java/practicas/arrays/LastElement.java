package practicas.arrays;

import java.util.ArrayList;
import java.util.List;

/*Create a method that accepts an array and returns the last item in the array.

 */
public class LastElement {


public static Integer lastElement(List<Integer> arr){

    if (!arr.isEmpty()){
        return arr.get(arr.size() -1 );
    }else {
        return null;
    }
}

public static void main(String[] args ){

    List<Integer> arr1 = new ArrayList<>();
    arr1.add(10);
    arr1.add(3);
    arr1.add(3);
    arr1.add(3);
    arr1.add(3);
    arr1.add(3);
    arr1.add(3);


    System.out.println(lastElement(arr1));
}
}
