import java.util.Arrays;
import java.util.List;

public class Random {
    public static void main(String[] args) {
        String CSV = "Google, Apple, Microsoft";
        List<String> value = Arrays.asList(CSV.split("\\s*,\\s*"));
        System.out.println(value.toString());
    }
}
