public class Lab02_3 {
    public static void main(String[] args) {
        String fruits = "Banana" ;
        int priceX = 32 ;
        int priceY = 64 ;
        if (fruits.length() == 6) {
            if (priceX * 2 > priceY) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else {
            System.out.println("C");
        }
    }  
}
