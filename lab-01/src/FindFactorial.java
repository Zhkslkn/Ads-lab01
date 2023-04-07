public class FindFactorial {
/*
    @ findFactorialFromArr - method to find the factorial
    @ num - the number
    @ return - returning factorial value of the number
*/
    public static int findFactorialFromArr(int num)
    {
        if (num >= 1)
            return num * findFactorialFromArr(num - 1);
        else
            return 1;
    }
}
