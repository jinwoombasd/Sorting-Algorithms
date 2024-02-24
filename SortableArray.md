# SortableArray README

## Overview
The `SortableArray` class provides functionalities to manipulate and sort an array of long integers. It includes implementations of various sorting algorithms such as bubble sort, insertion sort, selection sort, and odd-even sort. Additionally, it provides a method to calculate the median of the array elements.

## Usage
1. **Constructor**
   - `SortableArray(int max)`: Initializes the array with a specified maximum size.

2. **Insertion**
   - `insert(long value)`: Inserts a new element into the array.

3. **Sorting**
   - `bubbleSort()`: Sorts the array using the bubble sort algorithm.
   - `insertionSort()`: Sorts the array using the insertion sort algorithm.
   - `selectionSort()`: Sorts the array using the selection sort algorithm.
   - `oddEvenSort()`: Sorts the array using the odd-even sort algorithm.

4. **Median Calculation**
   - `median()`: Calculates and returns the median value of the array elements.

5. **Display**
   - `display()`: Prints the current contents of the array.

6. **String Representation**
   - `toString()`: Returns a string representation of the array, including its capacity, the number of elements, and the actual content.

## Example Usage
```java
public class Main {
    public static void main(String[] args) {
        SortableArray sortableArray = new SortableArray(10);
        
        sortableArray.insert(5);
        sortableArray.insert(3);
        sortableArray.insert(8);
        sortableArray.insert(1);
        sortableArray.insert(6);
        
        System.out.println("Original Array:");
        sortableArray.display();
        
        System.out.println("Sorted Array (Bubble Sort):");
        sortableArray.bubbleSort();
        sortableArray.display();
        
        System.out.println("Median of the Array: " + sortableArray.median());
    }
}
