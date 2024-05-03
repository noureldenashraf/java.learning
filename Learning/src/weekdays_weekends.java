import java.util.Scanner;

public class weekdays_weekends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = input.nextInt();
        // day 1 = Saturday
        // day 2 = Sunday
        // day 3 = monday
        // day 4 = tuesday
        // day 5 = wednesday
        // day 6 = thursday
        // day 7 = friday
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("its weekday");
            case 6, 7 -> System.out.println("Its weekend");
        }
    }
}
