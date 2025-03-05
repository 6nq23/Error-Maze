public class Problem1 {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        // BUG: Loop condition should use i < arr.length instead of i <= arr.length.
        for (int i = 0; i <= arr.length; i++) {  
            sum += arr[i];
        }
        return sum / (double) arr.length;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(calculateAverage(numbers));
    }
}
