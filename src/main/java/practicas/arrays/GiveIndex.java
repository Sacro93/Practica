package practicas.arrays;

import java.util.ArrayList;
import java.util.List;

public class GiveIndex {
    public static double numPosition(double a, double b){

        return  a / b;
    };
    public static Integer valueAt(List<Integer>arr,double position){

        if (!arr.isEmpty() && (position >= 0) && (position < arr.size())){
            //con math devuelve el numero entero mas grande menor o igual;

            int i = (int) Math.floor(position);

       return arr.get(i);
        }else {
            if (!arr.isEmpty() && position > arr.size()){
                System.out.println("No existe un numero para el rango dado");

                System.out.println(arr.get(arr.size() -2));

            }
return null;
           //que pasa si
        }
    }

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(2);

        arr1.add(20);

        double position1 = 3 / 2;
        System.out.println(valueAt(arr1, position1));

        double position2 = 5 / 2;
        System.out.println(valueAt(arr1, position1));

        double position4 = 10 / 2;
        System.out.println(valueAt(arr1, position1));


    }
}
