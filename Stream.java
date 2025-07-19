import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "mango");

        Map<String, Integer> fruitMap = fruits.stream().collect(Collectors.toMap(
            fruit -> fruit,
            fruit -> fruit.length()
        ));
        System.out.println(fruitMap);
    }
}
