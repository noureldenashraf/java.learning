import java.sql.SQLOutput;
import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        // print from 1 to n -----> where n is user defined
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
