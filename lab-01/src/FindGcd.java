public class FindGcd {
/*
    @ findGcd - method to find the GCD of the number
    @ a - the first number
    @ b - the second number
    @ return - returning GCD value of the number
*/
    public static int findGcd(int a, int b) {
        if (b != 0)
            return findGcd(b, a % b);
        else
            return a;
    }
}
