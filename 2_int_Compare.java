import java.util.Scanner;
public class test {

public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
int x;
int y;
System.out.println("Enter The 1st Number");
x = input.nextInt();
System.out.println("Enter The 2nd Number");
y = input.nextInt();
if (x > y){
    System.out.println("1st Number is Bigger than the 2nd");
} 
else if (y > x) {
    System.out.println("2nd Number is Bigger than the 1st");
}
else {
    System.out.println("Both Are Equal");
}
}


}