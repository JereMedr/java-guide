# Arrays
 Arrays in Java are fundamental data structures that allow you to store multiple values of the same type under a single variable name. 
## Declaring Arrays:
To declare an array in Java, you specify the type of elements it will hold, followed by square brackets [] and the array name. 
```
int[] myArray; // This declares an array named myArray that can hold integers.
```

## Initializing Arrays:
### Inline Initialization: 
You can initialize the array with values right when you declare it.
```
int[] myArray = {1, 2, 3, 4, 5};
```
### Using the new Keyword: 
Use the new keyword to create an array and then assign values to it.
```
int[] myArray = new int[5]; // Creates an array of size 5
myArray[0] = 1;
myArray[1] = 2;
// Continue assigning values...
```
## Accessing Elements:
You access elements of an array using square brackets [] with the index of the element you want to access. Remember, array indices start from 0.
```
int[] myArray = {10, 20, 30, 40, 50};
int firstElement = myArray[0]; // Retrieves the first element (10)
```

## Iterating Through Arrays:
Use loops to iterate through arrays and perform operations on each element.
```
int[] myArray = {10, 20, 30, 40, 50};
for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
```

## Multidimensional Arrays:
Java also supports multidimensional arrays, which are arrays of arrays.
```
int[][] multiArray = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```
## Arrays vs. ArrayList:
While arrays have a fixed size once initialized, the ArrayList class provides dynamic arrays in Java, which can grow or shrink in size dynamically.
import java.util.ArrayList;

```
ArrayList<Integer> arrayList = new ArrayList<Integer>();
arrayList.add(10);
arrayList.add(20);
// Continue adding elements...
```