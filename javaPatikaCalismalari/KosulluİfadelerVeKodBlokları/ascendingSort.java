import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ascendingSort {
    public static void main(String[] args) {
        Integer [] list = new Integer[3];
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayısı giriniz: ");
        list[0] = input.nextInt();

        System.out.print("2. sayısı giriniz: ");
        list[1] = input.nextInt();

        System.out.print("3. sayısı giriniz: ");
        list[2] = input.nextInt();

        Arrays.sort(list);
        for (int i = 0; i < 3; i++) {
            System.out.print(list[i]+"\t");
        }

    }
}