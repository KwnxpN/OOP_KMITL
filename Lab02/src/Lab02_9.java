import java.util.*;
public class Lab02_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        
        if (n1.equals(n2)) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
    }
}
