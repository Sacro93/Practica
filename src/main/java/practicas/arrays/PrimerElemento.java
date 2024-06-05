package practicas.arrays;

import java.util.ArrayList;
import java.util.List;

import static util.MyList.listOf;

public class PrimerElemento {



    public static Integer primerElemento(List<Integer> arr) {

        return arr.get(3);
    }

    public static void main(String[] args) {
        List<Integer> array = listOf(2, 3, 4,5);

        Integer resultado = primerElemento(array);

        System.out.println("resultado = " + resultado);
    }
}
