import java.util.Scanner;
public class SumEleArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        System.out.println("The sum of all the elements is: "+sum);
        sc.close();
    }
}
