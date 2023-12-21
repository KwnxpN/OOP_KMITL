import java.util.*;
public class Lab03_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int userInput = sc.nextInt();
        for (int i = 1; i <= userInput; i++) {
            if (i%5 == 0) {
                System.out.println("| ");
            } else {
                System.out.print("| ");
            }
        }
    }
}
