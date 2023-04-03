public class FindGcd {
    public static int findGcd(int a, int b) {
        if (b != 0)
            return findGcd(b, a % b);
        else
            return a;
    }
}
