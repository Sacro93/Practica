package practicaArrays040624;

import java.util.ArrayList;
import java.util.List;
import static util.MyList.listOf;
/*Create a function that takes a number (from 1 to 12) and returns
its corresponding month name as a string.
For example, if you're given 3 as input, your function should return "March",
because March is the 3rd month.*/
public class NumberMonth {

    //primero funcion que tome un numero entero y devuelva un string
    //segundo el umero es una posicion del array de meses
    public static String monthName(int posicion){

        List<String> meses = listOf("January","February","March","April","May","June", "July","August","September","October","November","December");

        if (posicion < 0 || posicion >12)  {
            throw new IllegalArgumentException("Recorda que existen 12 meses");
        }


        return meses.get(posicion - 1);


    }
    public static void main(String[] args){


        System.out.println(monthName(3));
        System.out.println(monthName(15));
    }
}
