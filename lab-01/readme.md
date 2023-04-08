# :milky_way: First Assignment

## Actually there are 10 tasks of the first laboratory work.
1. :icecream: Find the minimum value
2. :ice_cream: Find the average value
3. :shaved_ice: Check for prime number
4. :cookie: Factorial
5. :doughnut: Fibonacci value
6. :birthday: a in n degree
7. :cake: Reverse the order
8. :cupcake: Is all digits check
9. :pie: Binomial coefficient
10. :custard: Find the GCD

### :icecream: Task 1 module src
Description: Return the minimum value of an array

Explanation: Base case is n=1, then we return the first element of the array. Otherwise, we compare n-1 element with the recursive execution of the function to which n=n-1is passed and returned lesser

Solution:
```java
public static int findMinFromArr(int[] arr, int n){
    if(n==1)
        return arr[0];
    else{
        int min = findMinFromArr(arr, n-1);
        return Math.min(min, arr[n-1]);
    }
}
```

### :ice_cream: Task 2 module src
Description: Return the average value of an array

Explanation: Base case is i=n-1, then we return the i element of the array. When i=0, we return i element of the array with addition to the recursive function with i+1 value and divided by length of the array. Otherwise, returning i element of the array with with addition to the recursive function with i+1 value.

Solution:
```java
static double findAverageFromArr(int[] a, int i, int n){
    if (i == n-1)
        return a[i];

    if (i == 0)
        return ((a[i] + findAverageFromArr(a, i+1, n))/n);

    return (a[i] + findAverageFromArr(a, i+1, n));
}
```

### :shaved_ice: Task 3 module src
Description: return boolean value by checking is the number is prime or not

Explanation: There are actually 3 base cases to check the number for prime. Otherwise, it will return recursive function with i+1 argument till finding value.

Solution:
```java
public static boolean findPrimeNum(int n, int i){
    if (n <= 2)
        return n == 2;
    if (n % i == 0)
        return false;
    if (i * i > n)
        return true;

    return findPrimeNum(n, i + 1);
}
```

### :cookie: Task 4 module src
Description: return factorial value of the number

Explanation: Base case is when num<1. Otherwise, it will return num * recursive function with num-1 argument.  

Solution:
```java
public static int findFactorialFromArr(int num){
    if (num >= 1)
        return num * findFactorialFromArr(num - 1);
    else
        return 1;
}
```

### :doughnut: Task 5 module src
Description: return fibonacci value of the number

Explanation: Base cases are when num=0, it will return 0 and when num=1, returns 1. Otherwise, it will return recursive function with num-1 argument added recursive function with num-2 argument

Solution:
```java
public static int findFibonacciFromArr(int num) {
    if (num == 0) {
        return 0;
    }
    if (num == 1) {
        return 1;
    }
    return findFibonacciFromArr(num - 1) + findFibonacciFromArr(num - 2);
}
```

### :birthday: Task 6 module src
Description: return degree value of the number

Explanation: Base cases are when n=0, it will return 1 and when n=1, returns a. Otherwise, it will return a * recursive function with num-1 argument

Solution:
```java
public static int findDegreeFromArr(int a, int n) {
    if (n == 0) {
        return 1;
    }
    if (n == 1) {
        return a;
    }
    return a * findDegreeFromArr(a, n - 1);
}
```
### :cake: Task 7 module src
Description: return reverse order of the array

Explanation: the function will change the places of the array from start to the end, and with every itearion change the start +1, and end to -1. Base case is checking for is the end is bigger than start, it is used to find the middle point of the array.

Solution:
```java
public static int[] findReverseFromArr(int[] a, int i, int j){
    if(i<j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        findReverseFromArr(a, i+1, j-1);
    }
    return a;
}
```

### :cupcake: Task 8 module src
Description: return check for is all characters are digits

Explanation: the function will check for the digits. In this function was used the library StringUtils library, actually the method isNumeric.

Solution:
```java
public static boolean findDigitInString(String str) {
    if (str.length() == 1) {
        return StringUtils.isNumeric(str);
    }

    String lastIndex = str.substring(str.length() - 1);
    return StringUtils.isNumeric(lastIndex)
            && findDigitInString(str.substring(0, str.length() - 1));
}
```

### :pie: Task 9 module src
Description: return the binomial coefficient of the number

Explanation: the function will return the binomial coefficient of the number. Base cases are k=0, it will return 1, and n=k, it will return 1. Otherwise, it returns recursive function with arguments n-1 and k-1 added to recursive function with arguments n-1 and k.

Solution:
```java
public static int findBinomFromNums(int n, int k) {
    if (k == 0) {
        return 1;
    }
    if (n == k) {
        return 1;
    }
    return findBinomFromNums(n-1,k-1) + findBinomFromNums(n-1, k);
}
```

### :custard: Task 10 module src
Description: return the GCD value of the number

Explanation: the function will return the GCD value of the number. Base case is b=0, in this case it will return a. Otherwise, returns the recursive function with the arguments b and a%b.

Solution:
```java
public static int findGcd(int a, int b) {
    if (b != 0)
        return findGcd(b, a % b);
    else
        return a;
}
```
