import java.util.Scanner;
public class c_to_f {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double Celsius;
double Fahrenheit;
        System.out.println("Enter Temperature in Celsius");
        Celsius = input.nextFloat();
        Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("Temperature in Fahrenheit is :"+ Fahrenheit);

    }
}
