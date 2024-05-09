# While Loop:
The while loop repeatedly executes a block of code as long as a specified condition is `true`.
```
while (condition) {
    // Code block
}
```
# Do-While Loop:
The do-while loop is similar to the while loop, but the condition is evaluated after the code block has been executed, ensuring that the block of code is executed at least once.
```
do {
    // Code block
} while (condition);
```
## when is apropiate to use ?
### Condition-Based Iteration: 
When you need to iterate over a block of code based on a condition, and the number of iterations is not known beforehand, while loops are useful. For example, reading input from a user until a specific condition is met:
```
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit")) {
    System.out.print("Enter a command (type 'quit' to exit): ");
    input = scanner.nextLine();
    // Process the input
}
```


### Dynamic Termination: 
while loops are suitable when you want to keep executing a block of code until a dynamic condition becomes false. For example, reading data from a stream until the end of the stream is reached:
```
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line = reader.readLine();
while (line != null) {
    // Process the line
    line = reader.readLine(); // Read the next line
}
reader.close();
```
### Condition-Dependent Computation:
 `while` loops are appropriate when you need to perform computations that depend on a certain condition being true. For instance, calculating `Fibonacci` numbers until a specific threshold is reached:
```
int a = 0, b = 1, temp;
while (b < 1000) {
    System.out.print(b + " ");
    temp = a + b;
    a = b;
    b = temp;
}
```

### Tasks with Indeterminate Length:
 When the number of iterations is not known in advance or depends on external factors, such as fetching data from a database until no more data is available or until a certain condition is met, `while` loops are appropriate.
### Event-Driven Programming: 
In event-driven programming or real-time systems, where the program waits for events to occur, `while` loops can be used to continuously monitor for events and react accordingly.