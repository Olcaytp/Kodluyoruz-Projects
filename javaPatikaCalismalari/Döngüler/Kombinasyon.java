import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r;
        int nFac = 1, rFac = 1, nrFac = 1;

        System.out.print("n: ");
        n = input.nextInt();

        System.out.print("r: ");
        r = input.nextInt();

        for(int i = 1; i <= n; i++) {
            nFac *= i;
        }

        for(int i = 1; i <= r; i++) {
            rFac *= i;
        }

        for(int i = 1; i <= (n - r); i++) {
            nrFac *= i;
        }
        
        int comb = nFac / (rFac * nrFac);
        System.out.print("Combination: " + comb);
    }
}