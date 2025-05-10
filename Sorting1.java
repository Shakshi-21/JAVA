import java.util.Scanner;
public class Sorting1 {
    static void BubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }      
    }
    static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) 
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Unsorted Array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        BubbleSort(arr);
        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}
    
