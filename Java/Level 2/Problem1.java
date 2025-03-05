public class Problem1 {
    public static String reverseString(String s) {
        String reversed = "";
        
        for (int i = s.length(); i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
