
import java.util.Scanner;

public class If_Else {
    public void studentgrade(int marks) {
        // conditions to check the grades. Any number above 100 would show "Grade A"

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 70)
            System.out.println("Grade B");
        else if (marks >= 50)
            System.out.println("Grade C");
        else if (marks >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
    public static void main(String[] args) {
        // using try-with-resources to not close Scanner manually

        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            If_Else obj = new If_Else();
            obj.studentgrade(num);
        }
    }
}
