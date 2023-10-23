import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterable {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Charlie");

        Iterable<String> iterableNomes = nomes;
        Iterator<String> iterator = iterableNomes.iterator();

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }
    }
}
