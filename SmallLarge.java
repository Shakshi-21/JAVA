import java.util.Scanner;
public class SmallLarge {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0], min=arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]>max){
                max=arr[i];
            } else if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("The smallest element is "+min+" and the largest element is "+max);
        sc.close();
    }
}
