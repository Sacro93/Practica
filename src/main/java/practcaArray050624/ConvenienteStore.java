package practcaArray050624;

import static util.MyList.listOf;

import java.util.List;

/*changeEnough([2, 100, 0, 0], 14.11) ➞ false

changeEnough([0, 0, 20, 5], 0.75) ➞ true

changeEnough([30, 40, 20, 5], 12.55) ➞ true

changeEnough([10, 0, 0, 50], 3.85) ➞ false

changeEnough([1, 0, 5, 219], 19.99) ➞ false

 cuartos, monedas de diez centavos, monedas de cinco centavos, monedas de cinco centavos.*/


//debo crear una funcion que retorne true y tome como parametros un array y un double
//debo recorrer el array, multiplicarlo y sumarlo
//luego comparar

public class ConvenienteStore {

    public static boolean changeEnough(List<Integer> arr, double price) {
        List<Double> coins = listOf(0.25, 0.10, 0.05, 0.05);
        int size = Math.min(arr.size(), coins.size());

        double totalCash = 0.0;
        for (int i = 0; i < size; i++) {

            int cashInCount = arr.get(i);
            double value = coins.get(i);

            double multiplicacion = (double) cashInCount * value;

            totalCash += multiplicacion;
        }
        if (price <= totalCash) {

            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        List<Integer> monedasEnBolsillo = listOf(2, 100, 0, 0);
        List<Integer> monedasEnBolsillo2= listOf(0, 0, 20, 5);
        List<Integer> monedasEnBolsillo3= listOf(10, 0, 0, 50);

        double precioCompra = 14.11;
        double precioCompra2 = 0.75;



        double precioCompra3 = 3.85;




        System.out.println(changeEnough(monedasEnBolsillo, precioCompra));
        System.out.println(changeEnough(monedasEnBolsillo2, precioCompra2));
        System.out.println(changeEnough(monedasEnBolsillo2, precioCompra3));
    }
}


