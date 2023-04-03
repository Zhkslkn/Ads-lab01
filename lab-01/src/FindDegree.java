public class FindDegree {
    public static int FindDegreeFromArr(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        return a * FindDegreeFromArr(a, n - 1);
    }
}
