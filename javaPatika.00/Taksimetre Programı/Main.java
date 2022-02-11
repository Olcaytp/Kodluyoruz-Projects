import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        float Toplam,Acilis,Km,MesafeUcreti;
        Acilis = 10;

        Scanner giris = new Scanner(System.in);

        System.out.print("Kaç Km: ");

        Km =  giris.nextFloat();

        MesafeUcreti = Km*2.20f + Acilis;

        Toplam = MesafeUcreti < 20 ? 20 : MesafeUcreti;

        System.out.println("Toplam ücret tutarı: "+Toplam);

    }
}