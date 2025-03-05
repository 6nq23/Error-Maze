public class Problem2 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            
            return n * fact(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
