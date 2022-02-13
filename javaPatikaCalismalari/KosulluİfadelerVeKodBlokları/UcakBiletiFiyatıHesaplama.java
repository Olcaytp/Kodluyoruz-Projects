import java.util.Scanner;

public class UcakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        int mesafe,yas;
        byte yolcuTipi;
        double perKm = 0.10,normalTutar, toplamTutar, indirimliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz(km): ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas= input.nextInt();

        System.out.print("Yolculuk tipini giriniz: 1 => tek yön , 2 => çift yön ");
        yolcuTipi = input.nextByte();

        if ((mesafe < 0)||(yas < 0)||(yolcuTipi <0)||(yolcuTipi > 2)){
            System.out.println("Hatalı veri girdiniz!");
        }else {
            normalTutar = mesafe * perKm;

            if ((yas < 12)&&(yolcuTipi == 1)){
                toplamTutar = normalTutar-normalTutar*0.50;
                System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");
            }else  if ((yas < 12)&&(yolcuTipi == 2)) {
                normalTutar = normalTutar-normalTutar*0.50;
                indirimliTutar = normalTutar-normalTutar*0.20;
                toplamTutar = indirimliTutar * 2;
                System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");

            }else  if ((yas > 12)&&(yas < 24)&&(yolcuTipi == 1)){
                toplamTutar = normalTutar-normalTutar*0.1;
                System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");
            }else if ((yas > 12)&&(yas < 24)&&(yolcuTipi == 2)) {
                normalTutar = normalTutar-normalTutar*0.10;
                indirimliTutar = normalTutar-normalTutar*0.20;
                toplamTutar = indirimliTutar * 2;
                System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");

            }else  if ((yas > 65)&&(yolcuTipi == 1)){
                toplamTutar = normalTutar-normalTutar*0.3;
                System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");
            }else if((yas > 65)&&(yolcuTipi == 2)) {
                normalTutar = normalTutar-normalTutar*0.30;
                indirimliTutar = normalTutar-normalTutar*0.20;
                toplamTutar = indirimliTutar * 2;
                System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");
            }
            else
            {
                if(yolcuTipi == 1)
                {
                    toplamTutar = normalTutar;
                    System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");
                }
                else
                {
                    indirimliTutar = normalTutar-normalTutar*0.20;
                    toplamTutar = indirimliTutar * 2;
                    System.out.println("Bilet Fiyatı: " + toplamTutar + "TL");
                }
            }
        }
    }
}
