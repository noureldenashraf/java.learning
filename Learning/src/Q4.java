import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // how many 5s
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int count =0;
        int rem;
        while (x > 0){
            rem = x % 10;
            if (rem == 5){
                count++;}
            x = x / 10;
        }
        System.out.println(count);
    }
}
