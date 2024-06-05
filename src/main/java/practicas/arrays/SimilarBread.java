package practicas.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimilarBread {

    public static List<String> createSandwich(String a, String b, String c) {

        List<String> sandwich = new ArrayList();
        sandwich.add(a);
        sandwich.add(b);
        sandwich.add(c);


        return sandwich;
    }

    public static boolean hasSameBread(List<String> sandwich1, List<String> sandwich2) {


        return Objects.equals(sandwich1.get(0), sandwich2.get(0)) &&
                Objects.equals(sandwich1.get(sandwich1.size() - 1), sandwich2.get(sandwich2.size() - 1));
    }

    public static void main(String[] args) {
        List<String> sandwich = createSandwich("white bread", "lettuce", "white bread");
        List<String> sandwich2 = createSandwich("white bread", "lettuce", "white bread");

        System.out.println(hasSameBread(sandwich, sandwich2));

    }
}
