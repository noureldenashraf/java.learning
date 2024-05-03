import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x = input.nextInt();
        int rem;
        int rev = 0;
        while (x > 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println(rev);
    }
}
