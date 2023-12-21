import java.util.*;
public class Lab03_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int odd = 0, even = 0;
        while ((num = sc.nextInt()) != -1) {
            if (num%2 ==0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Odd number = "+odd + " and Even number = "+even);
    }
}
