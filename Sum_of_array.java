import java.util.Scanner;

public class Sum_of_array {
    static int sum_array(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[];
        int n;
        System.out.println("Enter the size of array: ");
        Scanner scanf =new Scanner(System.in);
        n=scanf.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=scanf.nextInt();
        }
        System.out.println("You have entered the following: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int x=sum_array(arr,n);
        System.out.println("\nThe sum of all elements in the array is "+x);

        scanf.close();
    }
}
