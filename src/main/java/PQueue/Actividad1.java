package PQueue;

import java.util.PriorityQueue;

public class Actividad1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>();

        //adding items
     pQueue.add(10);
     pQueue.add(2);
     pQueue.add(23);
     pQueue.add(52);
     pQueue.add(1);

//imprime el primer numero, en este caso el mas bajo,  se ordena de menor a mayor
        System.out.println(pQueue.peek());
        System.out.println(pQueue);


        System.out.println(pQueue.poll());//se muestra el menor y se elimina
        System.out.println(pQueue);//nuevo array sin el menor numero
        System.out.println(pQueue.peek());//muestra el nuevo numero mas pequeño;
    }
}
