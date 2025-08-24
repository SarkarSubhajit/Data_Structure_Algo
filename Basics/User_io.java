import java.util.Scanner;

public class User_io {
    public void printnumber (Scanner sc) {
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        User_io sol = new User_io();
        sol.printnumber(var);
    }
}