import java.util.Scanner;

public class Setbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // The number
        int i = sc.nextInt(); // The bit position to check (0-indexed from right)

        if ((n & (1 << i)) != 0) {
            System.out.println("Set");
        } else {
            System.out.println("Not Set");
        }


    }
}
