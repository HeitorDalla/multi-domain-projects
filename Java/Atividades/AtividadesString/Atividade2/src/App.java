public class App {
    public static void main(String[] args) throws Exception {
        // Para tornar as Strings mutáveis, usamos o StringBuffer e StringBuilder
        StringBuffer string = new StringBuffer("Heitor"); // é thread safe

        System.out.println(string);

        string.append(" Gilmar");
        string.append(" Marli");

        System.out.println(string);

    }
}