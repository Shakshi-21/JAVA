import java.util.Scanner;
public class AscDesc {
    public static void Sorting(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n/2-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int j=n/2;j<n-1;j++) {
                if(arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void printArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
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
        Sorting(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}


