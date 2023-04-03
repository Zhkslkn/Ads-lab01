public class FindFibonacci {
    public static int findFibonacciFromArr(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return findFibonacciFromArr(num - 1) + findFibonacciFromArr(num - 2);
    }
}
