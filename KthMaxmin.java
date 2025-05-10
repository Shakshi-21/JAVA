import java.util.Arrays;
import java.util.Scanner;
public class KthMaxmin {
    public static void Solution(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of K: ");
        int k=sc.nextInt();
        Arrays.sort(arr);
        if(k>0 && k<=n) {
            int kthMin=arr[k-1];
            System.out.println("Kth Min: "+kthMin);
            int kthMax=arr[n-k];
            System.out.println("Kth Min: "+kthMax);
        } else {
            System.out.println("Invalid Output");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Solution(arr, n);
    }
}
