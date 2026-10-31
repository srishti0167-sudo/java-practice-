import java.util.Scanner;

public class StudentMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects (out of 100):");

        System.out.println("Subject 1:");
        int sub1 = sc.nextInt();
        System.out.println("Subject 2:");
        int sub2 = sc.nextInt();
        System.out.println("Subject 3:");
        int sub3 = sc.nextInt();
        
        System.out.println("Subject 4:");
        int sub4 = sc.nextInt();
        System.out.println("Subject 5:");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = total * 100.0f / 500;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}