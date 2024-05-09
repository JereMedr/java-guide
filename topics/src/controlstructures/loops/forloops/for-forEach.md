# For Loop:
The traditional for loop in Java is a control flow statement that iterates over a range of values or a collection. It consists of three parts:

### Initialization: 
This part initializes the loop variable and is executed only once at the beginning of the loop.
### Condition: 
This part defines the condition that must be true for the loop to continue executing. If the condition evaluates to false, the loop terminates.
### Update: 
This part specifies how the loop variable should be updated after each iteration.

```
for (initialization; condition; update) {
    // Code block to be executed repeatedly
}
```
### example : 
```
for (int i = 0; i < 5; i++) {
    System.out.println("Value of i: " + i);
}
```

# for-each
The for-each loop, was introduced to simplify iteration over collections and arrays. It iterates through each element of a collection or array sequentially without needing an explicit loop variable. This loop is particularly useful when you don't need the index of each element, and you want to iterate over all elements of a collection or array.
```
for (type element : collectionOrArray) {
    // Code block to be executed for each element
}
```
### example : 
```
List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
for (String fruit : fruits) {
    System.out.println(fruit);
}
```
## When to Use Each:
### for Loop: 
Use the traditional for loop when you need to iterate over a range of values or when you need more control over the loop variable, such as incrementing or decrementing it by a specific amount.
### for-each Loop: 
Use the enhanced for loop when you want to iterate over all elements of a collection or array without needing the index of each element. It provides cleaner and more concise code, especially for iterating over collections.