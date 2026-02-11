import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i ++) {
            System.out.println("Adicine um valor a lista");
            int valor = scanner.nextInt();

            lista.add(valor);
        }
        System.out.println("Lista nao ordenada: " + lista);

        bubble(lista, lista.size());

        System.out.println("Lista ordenada e: " + lista);
        // System.out.println("A quantidade de trocas que teve: " + qtd);
    }

    public static void bubble (List<Integer> vetor, int qtd) {
        for (int i = 0; i < qtd - 1; i ++) {
            for (int j = 0; j < qtd - 1 - i; j++) {
                if (vetor.get(j) > vetor.get(j+1)) {
                    int auxiliar = vetor.get(j);

                    vetor.set(j, vetor.get(j+1));
                    vetor.set(j+1, auxiliar);
                }
            }
        }
        return;
    }
}