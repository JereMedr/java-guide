# Keywords to interrupt loops
## Break Statement:
The break statement terminates the loop it is in and transfers control to the statement immediately following the loop.

`break;`

```
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i equals 5
    }
    System.out.println(i);
}
```

## Continue Statement:
The continue statement skips the current iteration of a loop and proceeds to the next iteration.

`continue;`
