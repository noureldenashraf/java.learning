import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        int x = ch;
        System.out.println(ch);
        if (x > 90){
            System.out.println("Character is small");
        }
        else {
            System.out.println("Character is Capital");
        }
        System.out.println("PROGRAM ENDS HER");

    }
}
