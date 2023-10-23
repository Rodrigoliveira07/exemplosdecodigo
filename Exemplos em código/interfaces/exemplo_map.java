import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> idades = new HashMap<>();
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Charlie", 28);

        System.out.println("Idade de Alice: " + idades.get("Alice"));

        for (Map.Entry<String, Integer> entrada : idades.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos.");
        }
    }
}
