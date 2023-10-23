import java.util.ArrayList;
import java.util.Collection;

public class ExemploCollection {
    public static void main(String[] args) {
        Collection<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");

        System.out.println("Número de frutas: " + frutas.size());

        frutas.remove("Banana");

        System.out.println("Após remover Banana, número de frutas: " + frutas.size());
    }
}
