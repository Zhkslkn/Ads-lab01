public class FindMin {
/*
    @ findMinFromArr - the method to find the minimum value
    @ arr - the array
    @ n - the length of the array
    @ return - returning minimum value of the function
*/
    public static int findMinFromArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        else{
            int min = findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}
