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
### :shaved_ice: Task 3 module src
### :cookie: Task 4 module src
### :doughnut: Task 5 module src
### :birthday: Task 6 module src
### :cake: Task 7 module src
### :cupcake: Task 8 module src
### :pie: Task 9 module src
### :custard: Task 10 module src
