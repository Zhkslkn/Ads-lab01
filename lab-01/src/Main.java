import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от функции, с которым вы хотите воспользоваться:");
        System.out.println("""
                1. Find the minimum value
                2. Find the average value
                3. Check for prime number
                4. Factorial
                5. Fibonacci value
                6. a in n degree
                7. Reverse the order
                8. Is all digits check
                9. Binomial coefficient
                10. Find the GCD
                """);
        int ln = scanner.nextInt();
        switch (ln) {
            case 1: case 2:
                System.out.println("Сколько чисел должно быть в массиве");
                int n = scanner.nextInt();
                int[] array = createArr(n);
                if (ln == 1) {
                    int min = FindMin.findMinFromArr(array, n);
                    System.out.println("Minimum is " + min);
                }
                if (ln == 2) {
                    double average = FindAverage.findAverageFromArr(array, 0, n);
                    System.out.println("Average is " + average);
                }
            case 3: case 4: case 5:
                System.out.println("Введите число..");
                int enterNum = scanner.nextInt();
                if (ln == 3) {
                    boolean isPrime = FindPrime.findPrimeFromArr(enterNum, 2);
                    if (isPrime) {
                        System.out.println("Prime");
                    } else {
                        System.out.println("Composite");
                    }
                }
                if (ln == 4) {
                    int factResNum = FindFactorial.findFactorialFromArr(enterNum);
                    System.out.println(factResNum);
                }
                if (ln == 5) {
                    int fibonacciNum = FindFibonacci.findFibonacciFromArr(enterNum);
                    System.out.println(fibonacciNum);
                }


            default:
                throw new IllegalStateException("Unexpected value: " + ln);
        }



    }

    public static int[] createArr(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Введите числа..");
        for (int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
}