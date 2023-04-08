# :milky_way: First Assignment

## Actually there are 10 tasks of the first laboratory work.
1. :icecream: Find the minimum value[^1]
2. :ice_cream: Find the average value[^2]
3. :shaved_ice: Check for prime number[^3]
4. :cookie: Factorial[^4]
5. :doughnut: Fibonacci value[^5]
6. :birthday: a in n degree[^6]
7. :cake: Reverse the order[^7]
8. :cupcake: Is all digits check[^8]
9. :pie: Binomial coefficient[^9]
10. :custard: Find the GCD[^10]

[^1]: ### :icecream: Task 1 module src
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
[^2]: ### :ice_cream: Task 2 module src
[^3]: ### :shaved_ice: Task 3 module src
[^4]: ### :cookie: Task 4 module src
[^5]: ### :doughnut: Task 5 module src
[^6]: ### :birthday: Task 6 module src
[^7]: ### :cake: Task 7 module src
[^8]: ### :cupcake: Task 8 module src
[^9]: ### :pie: Task 9 module src
[^10]: ### :custard: Task 10 module src
