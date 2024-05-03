import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0;
        int y=1;
        int z=0;
        int i =2;
        int n = input.nextInt();
        while (i <= n){
            y = z;
            i++;
            z = x;
            z = x +y;
            x++;
            y++;
        }
        System.out.println(z);
    }
}
