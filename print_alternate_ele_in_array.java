import java.util.Scanner;
public class print_alternate_ele_in_array {
    void alternate(int arr[],int n){
        System.out.println("\nThe alternate array is: ");
        for(int i=1;i<=n;i+=2){
            System.out.print(arr[i]+" ");
        }
        return;
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
        print_alternate_ele_in_array obj=new print_alternate_ele_in_array();

        obj.alternate(arr,n);

        scanf.close();
    }
}
