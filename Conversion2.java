import java.util.Scanner;

public class Conversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance into kilometer:");
        float Kilometer = sc.nextFloat();
        float miles = Kilometer * 0.621371f;
        System.out.println("Kilometer as " + Kilometer + " is converted into miles: " + miles);
        sc.close();
    }
}