import java.util.*;
public class Lab04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyAdd2 obj = new MyAdd2();
        
        System.out.println("Please insert number1 : ");
        int x = sc.nextInt();
        System.out.println("Please insert number2 : ");
        int num = sc.nextInt();
        
        int result = obj.AddTwo(x);
        System.out.println("The result#1 is "+ result);
        
        result = obj.AddNum(x+5, num);
        System.out.println("The result#2 is "+ result);
        
        result = obj.AddTwo(x*3+2);
        System.out.println("The result#3 is "+ result);
    }
}
