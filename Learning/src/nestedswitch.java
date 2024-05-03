import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for employes, 2 for departments");
        int options = input.nextInt();
        // 1 for employes, 2 for departments
        switch (options){
            case 1:
                System.out.println("Enter emp_id");
                int empid = input.nextInt();
                switch (empid){
            case 1:
                System.out.println("Nour");
                System.out.println("Works in IT");
                        break;
            case 2:
                System.out.println("aya");
                System.out.println("Works in office");
                    break;
                }
                break;
            default:
                System.out.println("This id doesnt exist");
            case 2:
                System.out.println("Enter depid");
                String depid = input.next();
                switch (depid){
                    case "it":
                        System.out.println("Nour works at IT");
                        break;
                    case "office":
                        System.out.println("Aya Works at office");
                        break;
                    default:
                        System.out.println("This department doesnt exist");
                }

        }
    }
}
