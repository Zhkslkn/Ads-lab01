public class FindPrime {
/*
    @ findPrimeNum - method to find prime number
    @ n - the number
    @ i - indexation of the stage, actually used to determine the dividers of the number
    @ return - it will return where is the number is Prime or not
*/
    public static boolean findPrimeNum(int n, int i)
    {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return findPrimeNum(n, i + 1);
    }
}
