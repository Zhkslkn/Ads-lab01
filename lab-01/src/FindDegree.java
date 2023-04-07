public class FindDegree {
/*
    @ findDegreeFromArr - method to find degree of the number in a number
    @ a - the number
    @ n - degree of the number
    @ return - it will return the value of the finding degree
*/
    public static int findDegreeFromArr(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        return a * findDegreeFromArr(a, n - 1);
    }
}
