import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            i++;
            System.out.println(i);
        }

    }
}
