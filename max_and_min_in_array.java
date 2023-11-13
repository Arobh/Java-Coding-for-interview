import java.util.Scanner;
public class max_and_min_in_array {
    static int[] max_min(int arr[],int n){
        int min=1000000000;
        int max=-100;
        for(int i=1;i<=n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int res[]=new int[2];
        res[0]=min;
        res[1]=max;
        return res;
    }

    public static void main(String[] args) {
        int arr[];
        int n;
        System.out.println("Enter the size of array: ");
        Scanner scanf =new Scanner(System.in);
        n=scanf.nextInt();
        arr=new int[n+1];
        System.out.println("Enter the elements of array: ");
        for(int i=1;i<=n;i++){
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=scanf.nextInt();
        }
        System.out.println("You have entered the following: ");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        //max_and_min_in_array obj=new max_and_min_in_array();
        //int res2[]=new int[2];
        int []res2=max_min(arr,n);
        System.out.println("\nThe maximum and minimum element is: "+res2[1]+" "+res2[0]);
        scanf.close();
    }
}
