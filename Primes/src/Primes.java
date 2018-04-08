import java.util.Scanner;

public class Primes {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Введите число-");
        int n = in.nextInt();
        for (int i = 2; i < n; i++){
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
            return true;
    }
}

