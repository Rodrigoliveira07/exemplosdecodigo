import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10); // Não permite elementos duplicados

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
