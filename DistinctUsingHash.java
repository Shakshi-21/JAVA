import java.util.HashMap;
import java.util.Scanner;
public class DistinctUsingHash {
    public static void distElement (int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i])+1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        System.out.println("No of distinct elements: "+mp.size());
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        distElement(arr, n);
    }
}
