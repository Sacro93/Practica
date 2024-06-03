package practicas.arrays;

public class AreEquals {

    public static boolean IsSameNum(int a, int b){

        if (a != b) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args){

        boolean respuesta= IsSameNum(4,4);
        boolean respuesta2= IsSameNum(3,4);

        System.out.println(respuesta);
        System.out.println(respuesta2);
    }
}
