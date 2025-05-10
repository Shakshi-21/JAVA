import java.util.Scanner;
import java.util.ArrayList;
public class ZeroOneTwo {
    public static ArrayList<Integer> Count(int arr[], int n) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==0) {
                count0++;
            } else if(arr[i]==1) {
                count1++;
            } else if(arr[i]==2) {
                count2++;
            }
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<count0;i++) {
            arr1.add(0);
        }
        for(int i=0;i<count1;i++) {
            arr1.add(1);
        }
        for(int i=0;i<count2;i++) {
            arr1.add(2);
        }
        return arr1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> result=Count(arr, n);
        System.out.println("Sorted New Array: "+result);
    }
}
