import java.util.Scanner;

public class q1_again {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = input.nextInt();
        System.out.println("Enter 2nd number");
        int y = input.nextInt();
        System.out.println("Enter 3rd number");
        int z = input.nextInt();

        int maximum = Math.max(z,Math.max(x,y));
        System.out.println("Biggest is " + maximum);
    }

}
