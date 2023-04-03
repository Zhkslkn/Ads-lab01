import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
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
        while (true) {
            int ln = scanner.nextInt();
            switch (ln) {
                case 1:
                case 2:
                case 7:
                    System.out.println("Сколько чисел должно быть в массиве");
                    int n = scanner.nextInt();
                    int[] array = createArr(n);
                    if (ln == 1) {
                        int min = FindMin.findMinFromArr(array, n);
                        System.out.println("Minimum is " + min);
                        continue;
                    }
                    if (ln == 2) {
                        double average = FindAverage.findAverageFromArr(array, 0, n);
                        System.out.println("Average is " + average);
                        continue;
                    }
                    if (ln == 7) {
                        int[] reverseOrder = FindReverse.findReverseFromArr(array, 0, n - 1);
                        for (int i : reverseOrder)
                            System.out.print(i + " ");
                        continue;
                    }
                case 3:
                case 4:
                case 5:
                    System.out.println("Введите число..");
                    int enterNum = scanner.nextInt();
                    if (ln == 3) {
                        boolean isPrime = FindPrime.findPrimeFromArr(enterNum, 2);
                        if (isPrime) {
                            System.out.println("Prime");
                        } else {
                            System.out.println("Composite");
                        }
                        continue;
                    }
                    if (ln == 4) {
                        int factResNum = FindFactorial.findFactorialFromArr(enterNum);
                        System.out.println(factResNum);
                        continue;
                    }
                    if (ln == 5) {
                        int fibonacciNum = FindFibonacci.findFibonacciFromArr(enterNum);
                        System.out.println(fibonacciNum);
                        continue;
                    }
                case 6:
                    System.out.println("Введите число a..");
                    int a = scanner.nextInt();
                    System.out.println("Введите число n..");
                    int degree = scanner.nextInt();
                    int numFromDegree = FindDegree.FindDegreeFromArr(a, degree);
                    System.out.println(numFromDegree);
                    continue;
                case 8:
                    System.out.println("Введите строку..");
                    String str = scan.nextLine();
                    boolean isDigit = FindDigit.findDigitInString(str);
                    if (isDigit) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    continue;
                case 9:
                    System.out.println("Введите число n..");
                    int koef = scanner.nextInt();
                    System.out.println("Введите число k..");
                    int k = scanner.nextInt();
                    int numFromBinom = FindBinom.findBinomFromNums(koef, k);
                    System.out.println(numFromBinom);
                    continue;
                case 10:
                    System.out.println("Введите число a..");
                    int first = scanner.nextInt();
                    System.out.println("Введите число b..");
                    int second = scanner.nextInt();
                    int numFromGcd = FindGcd.findGcd(first, second);
                    System.out.println(numFromGcd);
                    continue;

                default:
                    throw new IllegalStateException("Unexpected value: " + ln);
            }
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