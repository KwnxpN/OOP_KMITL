public class Lab01_10 {
    public static void main(String[] args) {
        int a = 9, b = 4, c, d;
        c = b++ * ++a ;
        d = ++b * a++ ;
        System.out.println("C is "+ c);
        System.out.println("D is "+ d);
    }
}
