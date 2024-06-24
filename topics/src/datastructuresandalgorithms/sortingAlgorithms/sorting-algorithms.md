# Sorting algorithms
- Sorting algorithms are fundamental in computer science and are used to arrange data in a particular order, typically in numerical or lexicographical (alphabetical) order. To order this algorithms use computing power and time. Each algorith has `time complexity`.
- Time complexity is a measure of the amount of computational time an algorithm takes to complete as a function of the size of the input data. Different types of time complexities describe how the runtime of an algorithm scales with the size of the input. 
Common sorting algorithms:
## Bubble Sort
- Description: Simple comparison-based algorithm. Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- Time Complexity: O(n^2)
- Best Use Case: Small datasets or educational purposes to illustrate basic sorting principles.
## Selection Sort
- Description: Divides the input list into two parts: a sorted and an unsorted region. Repeatedly selects the smallest (or largest) element from the unsorted region and moves it to the sorted region.
- Time Complexity: O(n^2)
- Best Use Case: Small datasets or when memory space is a concern.
## Insertion Sort
- Description: Builds the final sorted list one item at a time. Takes each element from the input and finds its appropriate position within the sorted list.
- Time Complexity: O(n^2)
- Best Use Case: Small datasets, or nearly sorted data.
## Merge Sort
- Description: A divide-and-conquer algorithm. Divides the list into two halves, recursively sorts each half, and then merges the sorted halves to produce the final sorted list.
- Time Complexity: O(n log n)
- Best Use Case: Large datasets, especially when stable sort is needed.
## Quick Sort
- Description: Another divide-and-conquer algorithm. Picks a 'pivot' element and partitions the array into elements less than and greater than the pivot, recursively sorting the partitions.
- Time Complexity: O(n log n) on average; O(n^2) in the worst case.
- Best Use Case: General-purpose sorting; often faster in practice than merge sort due to better cache performance.
## Heap Sort
- Description: Uses a binary heap data structure. Converts the list into a max heap, then repeatedly extracts the maximum element from the heap and rebuilds the heap.
- Time Complexity: O(n log n)
- Best Use Case: When constant space complexity is required.
## Counting Sort
- Description: Non-comparison based. Assumes the input consists of integers within a fixed range. Counts occurrences of each value, then calculates the starting index for each key, and places the elements in their correct positions.
- Time Complexity: O(n + k), where k is the range of the input.
- Best Use Case: When the range of input values is not significantly greater than the number of items.
## Radix Sort
- Description: Non-comparison based. Processes the digits of the numbers starting from the least significant digit to the most significant digit, using a stable sorting algorithm (like counting sort) at each digit level.
- Time Complexity: O(nk), where k is the number of digits in the largest number.
- Best Use Case: Large lists of numbers with a fixed range.
## Shell Sort
- Description: Generalization of insertion sort. Allows the exchange of far-apart elements. The list is initially divided into sublists using a gap sequence, and each sublist is sorted using insertion sort.
- Time Complexity: Depends on the gap sequence, generally between O(n^2) and O(n log n).
- Best Use Case: Medium-sized datasets where insertion sort performs poorly.

# Complexites in order (faster to more expensive)
## Constant Time: O(1)
- Description: The runtime of the algorithm is constant and does not change with the size of the input.
- Example: Accessing an element in an array by its index.
## Logarithmic Time: O(log n)
- Description: The runtime grows logarithmically with the input size. Common in algorithms that repeatedly divide the input in half.
- Example: Binary search in a sorted array.
## Linear Time: O(n)
- Description: The runtime grows linearly with the size of the input.
- Example: Iterating through all elements of an array.
## Linearithmic Time: O(n log n)
-Description: The runtime grows in proportion to `𝑛 log 𝑛`. Typical of efficient sorting algorithms.
- Example: Merge sort, heapsort, and quicksort (average case).
## Quadratic Time: O(n^2)
- Description: The runtime grows proportionally to the square of the input size. Often seen in algorithms with nested loops.
- Example: Bubble sort, insertion sort, and selection sort.
## Cubic Time: O(n^3)
- Description: The runtime grows proportionally to the cube of the input size.
- Example: Certain algorithms that involve three nested loops, such as some matrix multiplication algorithms.
## Exponential Time: O(2^n)
- Description: The runtime doubles with each additional element in the input. Often seen in algorithms that solve problems by trying all possible combinations.
- Example: The naive solution to the traveling salesman problem, recursive calculation of Fibonacci numbers (without memoization).
## Factorial Time: O(n!)
- Description: The runtime grows factorially with the input size. Typically seen in algorithms that generate all permutations of an input set.
- Example: Solving the traveling salesman problem by checking all possible routes.
## Polynomial Time: O(n^k)
- Description: A general form where k is a constant. The runtime grows at a rate proportional to 𝑛 raised to a constant power.
- Example: Algorithms with nested loops where the number of nested loops is fixed.