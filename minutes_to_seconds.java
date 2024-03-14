import java.util.Scanner;

public class minutes_to_seconds {
public static void main (String[] args){
 float Seconds;
 float minutes;   
 Scanner input = new Scanner (System.in);
 System.out.println("Enter Seconds");
Seconds = input.nextFloat();
minutes = Seconds / 60;
System.out.println("Time in Minutes is");
System.out.println(minutes);
}
    
}