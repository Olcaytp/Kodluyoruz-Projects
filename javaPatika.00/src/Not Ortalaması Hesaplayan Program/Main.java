package TemelKavramlarVeDesikenler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat, fizik, kimya, tarih, muzik, turkce, toplam;
        float ortalama;

        // Scaner sınınfını tanımladık
        Scanner giris = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik notunuzu girin: ");
        mat = giris.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        fizik = giris.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        kimya = giris.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        tarih = giris.nextInt();

        System.out.print("Muzik notunuzu girin: ");
        muzik = giris.nextInt();

        System.out.print("Turkce notunuzu girin: ");
        turkce = giris.nextInt();

        toplam = mat + fizik + turkce + muzik + kimya + tarih;
        ortalama = toplam / 6;

        System.out.println("Not ortalamanız: "+ortalama);

        String sonuc = 60 < ortalama ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);

    }
}
