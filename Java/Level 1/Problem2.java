public class Problem2 {
    public static int sumNumbers(int[] arr) {
        int total = 0;
        
        for (int i = 0; i <= arr.length; i++) {  
            total += arr[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumNumbers(numbers));
    }
}
