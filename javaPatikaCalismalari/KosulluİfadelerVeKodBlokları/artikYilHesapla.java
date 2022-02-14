import java.util.Scanner;

public class artikYilHesapla {
        public static void main(String[] args) {
            Scanner  input = new Scanner(System.in);
            int year;

            System.out.print("Yılı giriniz: ");
            year = input.nextInt();

            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println(year + " artık yıldır.");
                }else {
                    System.out.println(year + " artık yıl değildir.");
                }
            }else if (year%4==0 ){
                System.out.println(year + " artık yıldır.");
            }else {
                System.out.println(year + " artık yıl değildir.");
            }
        }
}