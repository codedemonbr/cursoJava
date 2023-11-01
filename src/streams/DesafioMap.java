package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Numero para string binaria... 6=> "110"
         * 2. Inverter a string... "110"=> "011"
         * 3. Converter de volta para inteiro => "011" => 3
         * 
         * 
         */
        UnaryOperator<String> zeroEsquerda = (str) -> {
            switch (str.length()) {
                case 1:
                    return "000" + str;
                case 2:
                    return "00" + str;
                case 3:
                    return "0" + str;
                default:
                    return str;
            }
        };

        Function<Integer, String> convertStrBin = (n) -> Integer.toBinaryString(n);
        UnaryOperator<String> reverseStr = (str) -> new StringBuilder().append(str).reverse().toString();
        Function<String, Integer> convertBinStr = (str) -> Integer.parseInt(str, 2);

        // System.out.println(convertStrBin.apply(7));
        // System.out.println(reverseStr.apply("meu teste doido"));
        // System.out.println(convertBinStr.apply("111"));

        // System.out.println(con);

        nums.stream().map(convertStrBin).map(zeroEsquerda).map(reverseStr).map(convertBinStr).forEach(println);
        nums.stream().map(Integer::toBinaryString).map(zeroEsquerda).map(reverseStr).map(convertBinStr)
                .forEach(System.out::println);
        // nums.stream().map(convertStrBin).map(zeroEsquerda).forEach(println);
    }

}
