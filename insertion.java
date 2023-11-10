import java.util.Scanner;
class A{
    Scanner scanf =new Scanner(System.in);
    int insertion(int arr[],int n){
        int x;
        System.out.print("\nEnter the postion you want to insert: ");
        x=scanf.nextInt();
        if(x<1||x>n){
            return(-1);
        }
        else{
            int ele;
            System.out.print("Enter the element you want to insert: ");
            ele=scanf.nextInt();
            for(int i=n;i>=x;i--){
                arr[i+1]=arr[i];
                if(i==x){
                    arr[i]=ele;
                    //break;
                }
               
            }
        }
        return(x);
    }
    public static void main(String[] args) {
        int arr[];
        int n;
        System.out.println("Enter the size of array: ");
        Scanner scanf =new Scanner(System.in);
        n=scanf.nextInt();
        arr=new int[n+n+n];
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
        System.out.print("\nEnter how many times you want to insert in array: ");
        count=scanf.nextInt();
        for(int i=1;i<=count;i++){
            A obj= new A();
            int res=obj.insertion(arr,n);
            n++;
            System.out.println("The element is inserted in array on postion "+res);
        }
       
        System.out.println("After the insertion operation: ");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}