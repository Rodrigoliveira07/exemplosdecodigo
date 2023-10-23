import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

        System.out.println("Primeira cor: " + cores.get(0));

        cores.add(1, "Amarelo"); // Inserir no índice 1

        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
