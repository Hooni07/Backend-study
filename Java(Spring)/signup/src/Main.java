import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        ArrayList<String> a = new ArrayList(10);
        a.add("123");
        System.out.println(a.get(0));

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}