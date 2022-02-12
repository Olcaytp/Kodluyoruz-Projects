import java.util.Scanner;

public class havaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sıcaklık;
            System.out.print("Sıcaklık girniz:");
            sıcaklık = scanner.nextInt();

            boolean kayak = (sıcaklık < 5 ) ? true: false;

            boolean sinema = ((sıcaklık >= 5 )&&(sıcaklık < 15) ) ? true: false;

            boolean piknik = ((sıcaklık >= 15 )&&(sıcaklık <= 25) ) ? true: false;

            boolean yüzme = (sıcaklık > 25 ) ? true: false;

            while (kayak){
                System.out.println("Bu havada kayak yapmak eğlenceli olabilir :D");
                kayak = false;
            }

            while (sinema){
                System.out.println("Tam sinemaya gitme havası yok mu ama :D");
                sinema = false;
            }

            while (piknik){
                System.out.println("Pikniğe gitmek için daha güzel bir hava beklemmiyorsun değil mi :D");
                piknik = false;
            }

            while (yüzme){
                System.out.println("Bu havada yapılacak en güzel aktivite Yüzmek :D");
                yüzme = false;
            }
        }
    }
