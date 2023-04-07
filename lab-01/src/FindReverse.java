public class FindReverse {
/*
    @ findReverseFromArr - method to find the reverse order of the given array
    @ a - the array
    @ i - first element of the array
    @ j - the last element of the array
    @ return - reversed order of the array
*/
    public static int[] findReverseFromArr(int[] a, int i, int j){
        if(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            findReverseFromArr(a, i+1, j-1);
        }
        return a;
    }
}

