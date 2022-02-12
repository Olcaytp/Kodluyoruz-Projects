import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String username,password,select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (username.equals("patika")) {
            if (password.equals("java123")) {

                System.out.println("Giriş Yaptınız");
            } else {
                System.out.print("Bilgileriniz Yanlış ! \nŞifrenizi sıfırlamak ister misiniz?\n1-evet\n2-hayır\n ");
                select = inp.nextLine();
                if (select.equals("evet") || select.equals("1")) {
                    System.out.print("Yeni şifrenizi giriniz : ");
                    password = inp.nextLine();
                    if (password.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz. ");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                } else {
                    System.out.println("Tekrar giriş yapınız : ");
                }


            }
        }else{
            System.out.println("Bilgileriniz yanlış!");
        }
    }
}