import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("black", 0);
        valueMap.put("brown", 1);
        valueMap.put("red", 2);
        valueMap.put("orange", 3);
        valueMap.put("yellow", 4);
        valueMap.put("green", 5);
        valueMap.put("blue", 6);
        valueMap.put("violet", 7);
        valueMap.put("grey", 8);
        valueMap.put("white", 9);

        Map<String, Long> mulMap = new HashMap<>();
        mulMap.put("black", 1L);
        mulMap.put("brown", 10L);
        mulMap.put("red", 100L);
        mulMap.put("orange", 1_000L);
        mulMap.put("yellow", 10_000L);
        mulMap.put("green", 100_000L);
        mulMap.put("blue", 1_000_000L);
        mulMap.put("violet", 10_000_000L);
        mulMap.put("grey", 100_000_000L);
        mulMap.put("white", 1_000_000_000L);

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        long result = (valueMap.get(first) * 10L + valueMap.get(second)) * mulMap.get(third);

        System.out.println(result);
    }
}
