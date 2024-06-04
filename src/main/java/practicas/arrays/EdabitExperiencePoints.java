package practicas.arrays;

import java.util.ArrayList;
import java.util.List;
import static util.MyList.listOf;

//        for (int i = 0; i < xp.size(); i++) {
//            int posicionI =xp.get(i);
//            for (int j = 0; j < points.size(); j++) {
//                int posicionJ= points.get(j);
//
//                int multiplicacion = posicionI * posicionJ;
//
//                puntosTotal += multiplicacion;
//            }
//
//
//        }
public class EdabitExperiencePoints {

    public static int getXp( List<Integer>xp , List<Integer> points){
    int puntosTotal=0;

        int size= Math.min(xp.size(), points.size());

        for (int i = 0; i < size; i++) {
            int posicionI= xp.get(i);
            int posicionJ= points.get(i);

            int multiplicacion = posicionI * posicionJ;

                puntosTotal += multiplicacion;
        }


        return puntosTotal;

        }


    public static void main (String[] args){

        List<Integer>xp =listOf(5,10);


        List<Integer>points =listOf(89,77);

        System.out.println(getXp(xp,points));
    }
}


