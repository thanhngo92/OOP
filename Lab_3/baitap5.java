public class baitap5
{
     public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(2, 5);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f1 + f2 = " + f1.add(f2));
        System.out.println("f1 - f2 = " + f1.sub(f2));
        System.out.println("f1 * f2 = " + f1.mul(f2));
        System.out.println("f1 / f2 = " + f1.div(f2));
    }
}
