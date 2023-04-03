public class FindAverage {

    static double findAverageFromArr(int[] a, int i, int n)
    {
        if (i == n-1)
            return a[i];

        if (i == 0)
            return ((a[i] + findAverageFromArr(a, i+1, n))/n);

        return (a[i] + findAverageFromArr(a, i+1, n));
    }
}
