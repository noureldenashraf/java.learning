import java.util.Scanner;
public class mile_to_kilos {
    public static void main (String [] args) {
Scanner input = new Scanner(System.in);
double km, miles;
System.out.println("Enter Distance in Miles");
miles = input.nextFloat();
km = miles * 1.60934;
System.out.print("Distance im kilos is :");
System.out.print(km);

    }
}