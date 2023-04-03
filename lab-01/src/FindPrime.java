public class FindPrime {
    public static boolean findPrimeFromArr(int n, int i)
    {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return findPrimeFromArr(n, i + 1);
    }
}
