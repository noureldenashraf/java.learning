import java.util.Scanner;

public class Switchq1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit name");
        String fruit = input.next();
        switch (fruit) {
            case "mango" -> System.out.println("mango is very good");
            case "apple" -> System.out.println("el tofa7 gamd neek");
            case "banana" -> System.out.println("banana ya banana");
            //default -> System.out.println("dh enta bdan");
        }
    }
}
