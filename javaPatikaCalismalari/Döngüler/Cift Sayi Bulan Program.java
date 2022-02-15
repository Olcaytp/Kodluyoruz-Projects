import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
        k= input.nextInt();

        for (int i = 0; i <= k; i++) {
            if ( i % 2 == 0 ){
                System.out.print(" " + i);
            }
        }
    }
}