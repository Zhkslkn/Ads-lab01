public class FindBinom {
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
