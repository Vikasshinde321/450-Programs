import java.util.Scanner;
public class FirstThreePowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (N): ");
        int num = scanner.nextInt();

        int a = (int) Math.pow(num, 1);
        int b = (int) Math.pow(num, 2);
        int c = (int) Math.pow(num, 3);

        System.out.println("\nOutput Is:\n");
        System.out.println(a+" "+b+" "+c);
    }
}