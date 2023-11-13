import java.util.Scanner;

public class Second_largest {
    static int sec_lar(int arr[],int n){
        int max=-100;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2=-100;
        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }
        }
        return(max2);
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
        int x=sec_lar(arr,n);
        System.out.println("\nThe second largest element in array is "+x);

        scanf.close();
    }

}
