public class FindBinom {
/*
    @ findBinomFromNums - method to find Binomial coefficient
    @ n - the first coefficient of the equation
    @ k - the second coefficient of the equation
    @ return - it will return the binomial coefficient
*/
    public static int findBinomFromNums(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (n == k) {
            return 1;
        }
        return findBinomFromNums(n-1,k-1) + findBinomFromNums(n-1, k);
    }
}