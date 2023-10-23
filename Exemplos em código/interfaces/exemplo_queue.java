import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 3");

        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " + fila.poll());
        }
    }
}
