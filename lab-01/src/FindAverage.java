public class FindAverage {
/*
    @ findAverageFromArr - the method to find the average value from the array
    @ a - the array from which will be taken elements
    @ i - iterator count, to count and check which element is it
    @ n - the length of the array, how many elements is the array consists of
    @ return - average value from the array
*/
    static double findAverageFromArr(int[] a, int i, int n)
    {
        if (i == n-1)
            return a[i];

        if (i == 0)
            return ((a[i] + findAverageFromArr(a, i+1, n))/n);

        return (a[i] + findAverageFromArr(a, i+1, n));
    }
}