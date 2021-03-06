# Challenge 28: Quick Sort
# Challenge Summary
we need to implement the quick sort Algorithm .
QuickSort is a Divide and Conquer algorithm.
It picks an element as pivot and partitions the given array around the picked pivot.
There are many different versions of quickSort that pick pivot in different ways.

## Whiteboard Process
![mergeSort](./lib/src/main/resources/quick-sort.png)

## Approach & Efficiency
Algorithm
1- Find a “pivot” item in the array. This item is the basis for comparison for a single round.
2- Start a pointer (the left pointer) at the first item in the array.
3- Start a pointer (the right pointer) at the last item in the array.
4-While the value at the left pointer in the array is less than the pivot value, move the left pointer to the right (add 1). Continue until the value at the left pointer is greater than or equal to the pivot value.
5-While the value at the right pointer in the array is greater than the pivot value, move the right pointer to the left (subtract 1). Continue until the value at the right pointer is less than or equal to the pivot value.
6-If the left pointer is less than or equal to the right pointer, then swap the values at these locations in the array.
7-Move the left pointer to the right by one and the right pointer to the left by one.
8-If the left pointer and right pointer don’t meet, go to step 1.
## Solution
[solution](./lib/src/main/java/quick/sort/Library.java)
