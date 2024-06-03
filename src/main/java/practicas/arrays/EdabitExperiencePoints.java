package practicas.arrays;

import java.util.ArrayList;
import java.util.List;
import static util.MyList.listOf;
public class EdabitExperiencePoints {

    List<Integer> xp ;
    List<Integer> points;

    public static int getXP( List<Integer>xp , List<Integer> points){
    int puntosTotal=0;
        for (int i = 0; i < xp.size(); i++) {
            int posicionI =xp.get(i);
            for (int j = 0; j < points.size(); j++) {
                int posicionJ= points.get(j);

                int multiplicacion = posicionI * posicionJ;

                puntosTotal += multiplicacion;
            }


        }
        return puntosTotal;

    }

    public static void main (String[] args){

        List<Integer>xp =listOf(5,10);


        List<Integer>points =listOf(89,77);

        System.out.println(getXP(xp,points));
    }
}
