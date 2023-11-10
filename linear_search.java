import java.util.Scanner;
class B{
    Scanner scanf =new Scanner(System.in);
    int search(int arr[],int n){
            int ele;
            System.out.print("Enter the element you want to insert: ");
            ele=scanf.nextInt();
            for(int i=n;i>=1;i--){
                if(arr[i]==ele){
                    return i;
                }
            }
        return(-1);
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
        int count;
        System.out.print("\nEnter how many times you want to search the array: ");
        count=scanf.nextInt();
        for(int i=1;i<=count;i++){
            B obj= new B();
            int res=obj.search(arr,n);
            if(res!=-1)
                System.out.println("The element is found in array on postion "+res);
            else
                System.out.println("The element is not found in array...");
        }
        scanf.close();
    }
}