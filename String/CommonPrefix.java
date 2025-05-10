import java.util.Arrays;
public class CommonPrefix {
    public static String prefix(String[] arr) {
        Arrays.sort(arr);
        String first=arr[0];
        String last= arr[arr.length-1];
        int minLength = Math.min(first, last);
        
    }
    public static void main(String args[]) {
        String[] arr ={ "geeksforgeeks", "geeks", "geek", "geezer" };
        System.out.println(prefix(arr));
    }
}
