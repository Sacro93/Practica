package interfaces;

import java.util.Collections;
import java.util.List;
import static util.MyList.listOf;
public class Main {
    public static void main(String[] args) {
        List<Persona> personitas= listOf(
                new Persona (180,"jorge"),
                new Persona(185, "Fran"),
                new Persona(100, "pepe"),
                new  Persona(50,"carlos")
        );

        System.out.println("personitas = " + personitas);

        Collections.sort(personitas);

        System.out.println("personitas = " + personitas);

    }
}
