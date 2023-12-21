public class Lab03_1 {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        String res = "XXXXXXXXXX";
        
        for (int i = 0; i < max; i++) {
            if (i % 4 == 0) {
                System.out.print("X");
            }
        }
        System.out.println(res.length());
    }   
}
