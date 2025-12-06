@FunctionalInterface // para dizer explicitamente que e uma interface funcional (1 metodo)
 interface App {
    float sum(int a, int b);
}

public class InnerApp {
    public static void main (String a[]) {
        App obj = (int i, int j) -> i + j;

        float soma = obj.sum(4, 5);

        System.out.println("A soma dos dois numeros e: " + soma);
    }    
}