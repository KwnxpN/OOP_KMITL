import java.util.*;
public class Lab02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        
        if (salary <= 50000) {
            System.out.println(salary * 0.05);
        } else {
            System.out.println(salary * 0.1);
        }
    }
}
