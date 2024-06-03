package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    public static <T> List<T> listOf(T... args) {
        return new ArrayList<T>(Arrays.asList(args));
    }
}
