import java.util.Scanner;
public class Rotate_array {
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr[i]=arr2[i+d];
        }
        for(int i=n-d,j=0;i<n;i++,j++){
            arr[i]=arr2[j];
        }
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
        int d;
        System.out.print("\nEnter the value of d: ");
        d=scanf.nextInt();
        rotateArr(arr,d,n);
        System.out.println("After the roatation: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        scanf.close();
    }
}
