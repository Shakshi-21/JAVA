import java.util.Scanner;
public class Sorting2 {
    static void InsertionSort(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++) {
            int key=arr[i]; //the element that will be compared
            int j=i-1;   //index of the previous element

            while(j>=0 && arr[j]> key)   
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        }
        
    }
    static void printArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Unsorted Array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
