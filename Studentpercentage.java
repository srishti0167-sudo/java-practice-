import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int total = a+b+c+d+e;
        double per = (double)total / 500 * 100; 
// (double) lagane se float ban jayega
        
        System.out.println("Percentage = " + per);
    }
}