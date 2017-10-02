import java.util.Scanner;

public class task1 {
    public static void funktion(int x) {


        for (int j = 1; j <= x; j++) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = scanner.nextInt();

        funktion(x);
    }
}


