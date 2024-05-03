import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // for (int i = 0; i <= 3; i++) { // THE Number 4 Represents (The number of elements we compare) - 1
        int maximum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = input.nextInt();
        System.out.println("Enter 2nd number");
        int y = input.nextInt();
        System.out.println("Enter 3rd number");
        int z = input.nextInt();
        System.out.println("Enter 4th number");
        int w = input.nextInt();
        maximum = x;
       if (maximum < y){
           maximum = y;
       }
            if (maximum < z){
                maximum = z;
            }
            if (maximum < w){
                maximum = w;
            }
        System.out.println("Biggest is "+ maximum);
        }

    }
