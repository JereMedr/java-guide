# Switch Statement:
The switch statement allows you to select one of many code blocks to be executed based on the value of a variable.
```
switch (expression) {
    case value1:
        // Code block
        break;
    case value2:
        // Code block
        break;
    // More cases
    default:
        // Default code block
}
```
## when use switch ?
The switch statement might be used in situations where you need to evaluate a single variable or expression against multiple distinct values or conditions. Here are some common scenarios where using a switch statement is appropriate:

### Menu Selection: 
    When creating a menu-driven program where the user selects options from a list, switch statements are often used to execute the corresponding actions based on the user's input.

### Enumeration Types: 
    When working with enums, switch statements can be used to handle different cases representing the possible states or values of the enum.

### Parsing Input: 
    When parsing input data with a limited number of possible values or tokens, switch statements can be employed to process each token differently.

### Mapping Constants: 
    If you have a set of constant values or codes that map to specific actions or behaviors, switch statements provide a concise and readable way to handle each case.

### Day-to-Day Scenarios: 
    For tasks like handling days of the week, months, or other fixed sets of values, switch statements offer a clean and efficient way to handle each possible value.

### Performance Considerations: 
    In certain scenarios where performance is critical and you're dealing with a large number of cases, switch statements may provide better performance compared to multiple nested if-else statements.