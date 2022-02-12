import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float ilkHali;
        float Kdv,KdvLi;
        Scanner giris = new Scanner(System.in);

        System.out.print("Ürünün Fiyatını Girin: ");
        ilkHali = giris.nextFloat();
        Kdv = (ilkHali*18)/100f;
        KdvLi = Kdv + ilkHali;

        System.out.println("Ürünün KDV li fiyatı: "+KdvLi);
        System.out.println("ürünün KDV tutarı: "+Kdv);
    }
}