import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float r,pi = 3.14f,alan,cevre;

        Scanner degerler = new Scanner(System.in);

        System.out.print("Yarı Çapı Giriniz: ");
        r = degerler.nextFloat();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Cevresi: "+cevre + "\n" + "Dairenin Alanı: "+alan );
    }
}