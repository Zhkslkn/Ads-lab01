public class FindMin {
    public static int findMinFromArr(int[] arr, int n){
//        3 5 6 2 8
        if(n==1)
            return arr[0];
        else{
            int min = findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}
