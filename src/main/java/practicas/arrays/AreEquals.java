package practicas.arrays;

public class AreEquals {

    public static boolean IsSameNum(int a, int b){

       return a == b;
    }

    public static void main(String[] args){

        boolean respuesta= IsSameNum(4,4);
        boolean respuesta2= IsSameNum(3,4);

        System.out.println(respuesta);
        System.out.println(respuesta2);
    }
}
