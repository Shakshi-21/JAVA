import java.util.Scanner;
import java.util.HashSet;
public class Subset {
    public static boolean SubsetOfArray (int arr1[], int n, int arr2[], int m) {
        HashSet<Integer> mp=new HashSet<>();
        for(int i=0;i<n;i++) {
            mp.add(arr1[i]);
        } 
        for(int i=0;i<m;i++) {
            if(!mp.contains(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array 1: ");
        int n=sc.nextInt();
        System.out.println("Size of the array 2: ");
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        System.out.println("Array 1: ");
        for(int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Array 2: ");
        for(int i=0;i<m;i++) {
            arr2[i]=sc.nextInt();
        }
        boolean result=SubsetOfArray(arr1, n, arr2, m);
        if(result) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is NOT a subset of Array 1.");
        }
    }
}