public class Literal2 {
    public static void main(String[] args) {
   
        long l = 100000L;
        float f = 5.5f;
        char c1 = 'A';
        String s1 = "A";
        boolean b = true;
        double d = 5.5;
        int bin = 0b1010;
        int oct = 012;
        int hex = 0xA;

        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Char: " + c1);
        System.out.println("String: " + s1);
        System.out.println("Boolean: " + b);
        System.out.println("Double: " + d);
        System.out.println("Binary 0b1010 = " + bin);
        System.out.println("Octal 012 = " + oct);
        System.out.println("Hex 0xA = " + hex);
    }
}