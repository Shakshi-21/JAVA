import java.util.Scanner;
public class DistinctElements {
    public static int differelement (int arr[], int n) {
        int count=1; //Consider at least one element is distinct in the array
        for(int i=1;i<n;i++) {
            boolean isDistinct=true;
            for(int j=0;j<i;j++) {
                if(arr[j]==arr[i]) {
                    isDistinct=false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int disntinctCount = differelement(arr, n);
        System.out.println("No of distinct elements: "+disntinctCount);
    }
}
