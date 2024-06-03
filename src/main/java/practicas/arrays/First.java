package practicas.arrays;

import java.util.ArrayList;
import java.util.List;

public class First {

    List<Integer> arr = new ArrayList<>();

    public static Integer first(List<Integer> arr) {
        if (!arr.isEmpty()) {
            return arr.get(0);
        } else {
            return null;
        }
    }


    public static void main(String[] args){
List<Integer> arr1 =new ArrayList<>();
arr1.add(10);
arr1.add(130);
arr1.add(10);
List<Integer> arr =new ArrayList<>();
        System.out.println(first(arr1));

        System.out.println(first(arr)
        );
    }

}
