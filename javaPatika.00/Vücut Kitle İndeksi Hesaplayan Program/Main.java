import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float boy, kilo, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Metre Türünden Giriniz: ");
        boy = input.nextFloat();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextFloat();

        sonuc = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+sonuc);
    }
}