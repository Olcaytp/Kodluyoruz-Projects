import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b;
        double c;

        Scanner giris = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        a = giris.nextFloat();
        System.out.print("b kenarını giriniz: ");
        b = giris.nextFloat();
        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : "+c);
    }
}