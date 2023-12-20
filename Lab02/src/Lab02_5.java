public class Lab02_5 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        if (((++num1+10)>0) && (6+(--num2)>10)) {
            System.out.println("(A):"+ num1 +"|"+ num2);
        } else {
            System.out.println("(B):"+ num1 +"|"+ num2);
        }
        System.out.println("End");
    }
}
