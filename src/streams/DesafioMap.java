package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> resto = (n) -> (n % 2 == 1) ? "1" : "0";

        System.out.println(resto.apply(6));
    }

}
