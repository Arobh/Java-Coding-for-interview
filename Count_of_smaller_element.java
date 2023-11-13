public class Count_of_smaller_element {
    public long countOfElements(long arr[], long n, long x)
    {
        long count=0;   
        for(int i=0;i<arr.length;i++){
            if(x>=arr[i]){
                count++;
            }
        }
        return count;    
    }
    public static void main(String[] args) {
        long n=6;
        long a[] = new long[]{1, 2, 4, 5, 8, 10};
        long X =9;
        Count_of_smaller_element obj= new Count_of_smaller_element();
        long y=obj.countOfElements(a,n,X);
        System.out.println(y);
    }
}
