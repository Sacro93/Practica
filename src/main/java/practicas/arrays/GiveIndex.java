package practicas.arrays;

import java.util.List;
import static util.MyList.listOf;

public class GiveIndex {
    public static int numPosition(double a, double b){
        return  (int) Math.floor(a/b);
    };

    //para ver mas adelante como poder tomar 2 parametros en la funcion valueAt
    public static Integer valueAt(List<Integer>arr,double a,double b){
        int position =  numPosition(a,b);
        if (!arr.isEmpty() && (position >= 0) && (position < arr.size())){

       return arr.get(position);
        }else {
            if (!arr.isEmpty() && position > arr.size()){
              arr.get(numPosition((double) arr.size() , -2.0));

            }
return null;

        }
    }

    public static void main(String[] args) {

        List<Integer> arr1 = listOf(10,20,30,40,50);



        System.out.println(valueAt(arr1, 6,2));
        System.out.println(valueAt(arr1, 6,100));
        System.out.println(valueAt(arr1, 100,100));
        System.out.println(valueAt(arr1, 10,3));


    }
}
