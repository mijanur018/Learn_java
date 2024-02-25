import java.util.Scanner;

/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit of the number: ");
        int inp = sc.nextInt();
        int count = 0;
        System.out.println("enter numbers: ");
        for (int i = 0; i < inp; i++) {
            int n = sc.nextInt();
            for (int j = 2; j * j <= n; j++) // square root porjonto
            {
                if (n % j == 0) { // jodi akta devide hoi count bere jabe and break kore debe
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime number");
            } else {
                System.out.println("not prime number");
            }
        }
    }
}