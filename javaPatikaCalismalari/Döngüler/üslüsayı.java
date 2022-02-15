import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base, power;

        System.out.print("Base: ");
        base = input.nextInt();

        int tempBase = base;

        System.out.print("Power: ");
        power = input.nextInt();

        for (int i = 1; i < power; i++) {
            base *= tempBase;
        }
        System.out.print("Result: " + base);
    }
}