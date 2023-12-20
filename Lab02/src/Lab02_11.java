import java.util.*;
public class Lab02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char type = sc.next().charAt(0);
        double result;
        if (type == 'A') {
            result = money + (money * 0.015);
            System.out.println("Your total money in one year = "+result);
        } else if (type == 'B') {
            result = money + (money * 0.02);
            System.out.println("Your total money in one year = "+result);
        } else if (type == 'C'){
            result = money + (money * 0.015);
            System.out.println("Your total money in one year = "+result);
        } else if (type == 'X') {
            result = money + (money * 0.05);
            System.out.println("Your total money in one year = "+result);
        }
    }
}
