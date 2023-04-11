import java.util.Scanner;

public class Main {
    /*
        in the function main, there are gathered all 10 tasks functions and the direct
        conversation with user will be done in this file. Firstly, when the user runs the program, he will be asked to
        choose one of the tasks he needed by entering number from 1 to 10, otherwise 0 if he wants to exit the program.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        /*
            The list of 10 tasks, which the program can solve, user can enter to the console.
        */
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
                0. To exit the program
                """);
        while (true) {
            System.out.println("Введите число от функции");
            int ln = scanner.nextInt();
            /*
                There is switch case to choose 1 of the 10 cases, and run the appropriate function.
            */
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
                        boolean isPrime = FindPrime.findPrimeNum(enterNum, 2);
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
                    int numFromDegree = FindDegree.findDegreeFromArr(a, degree);
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

                case 0:
                    System.exit(0);

                default:
                    throw new IllegalStateException("Unexpected value: " + ln);
            }
        }

    }

    /*
        The function createArr is creates an array by the given length.
    */
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