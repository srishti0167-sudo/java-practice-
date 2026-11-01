import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Number is integer or not: ");
        boolean a = sc.hasNextInt();
        System.out.println(a);
        sc.close();
    }
}