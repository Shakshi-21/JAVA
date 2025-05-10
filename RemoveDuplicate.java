import java.util.Scanner;
public class RemoveDuplicate {
    static int Duplicate(int arr[], int n) {
        if(n==0 || n==1) 
            return n;
        int j=0;
        for(int i=0;i<n;i++) 
            if(arr[i]!=arr[j+1]) 
            arr[j++]=arr[i];
            arr[j++]=arr[n-1];
        return j;
    }
    static void printArray(int arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Before removing duplicates: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Duplicate(arr, n);
        System.out.println("After removing duplicates: ");
        printArray(arr, n);
    }
}