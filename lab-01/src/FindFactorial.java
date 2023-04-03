public class FindFactorial {
    public static int findFactorialFromArr(int num)
    {
        if (num >= 1)
            return num * findFactorialFromArr(num - 1);
        else
            return 1;
    }
}
