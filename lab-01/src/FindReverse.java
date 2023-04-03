public class FindReverse {
    public static int[] findReverseFromArr(int[] a,int i,int j){
        //Tail Recursion.
        if(i<j){
            //swap elements a[i],a[j]
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            findReverseFromArr(a, i+1, j-1);
        }
        return a;
    }
}
