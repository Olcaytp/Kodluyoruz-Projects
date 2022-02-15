import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int num = input.nextInt();
        int count = 1;

        int i = 4;

        System.out.println("4'ün kuvvetleri:");
        while(true){
            if(i <= num)
            {
                System.out.println("4'ün " + count + ".kuvveti: " + i);
            }else
            {
                break;
            }
            count++;
            i*=4;
        }
        
        System.out.println();
        i = 5;
        count = 1;
        
        System.out.println("5'in kuvvetleri:");
        while(true){
            if(i <= num)
            {
                System.out.println("5'in " + count + ".kuvveti: " + i);
            }else
            {
                break;
            }
            count++;
            i*=5;
        }
    }
}