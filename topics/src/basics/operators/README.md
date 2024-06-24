# Operators
 Java supports various types of operators, including arithmetic, relational, logical, bitwise, assignment, and ternary operators.

 ## Arithmetic operators: 
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulus (%)
- Increment (++)
- Decrement (--)

## Relation operators :
- Equal to (==)
- Not equal to (!=)
- Greater than (>)
- Less than (<)
- Greater than or equal to (>=)
- Less than or equal to (<=)

## Logical operators :
- Logical AND (&&)
- Logical OR (||)
- Logical NOT (!)

## Bitwise Operators:
Bitwise operators perform operations at the bit level on integer operands. They manipulate individual bits of the operands.
- Bitwise AND (&)
- Bitwise OR (|)
- Bitwise XOR (^)
- Bitwise complement (~)
- Left shift (<<)
- Right shift (>>)
- Unsigned right shift (>>>)

## Bitwise Operators in Java

Bitwise operators are used to perform operations at the bit level on integer operands. They manipulate individual bits of the operands. While they might not be as commonly used as other types of operators, they are essential in scenarios where you need to work directly with binary representations of data or perform low-level manipulation of bits.

### Common Use Cases:

1. **Flag Manipulation:** In many programming scenarios, flags or sets of boolean values are represented compactly as a series of bits within an integer. Bitwise operators are used to set, clear, toggle, or check the status of these flags.

2. **Bit-level Operations:** Bitwise operators are often used in low-level programming tasks such as device drivers, network protocols, encryption algorithms, and hardware interaction. These tasks often involve operations on individual bits to perform specific tasks efficiently.

3. **Performance Optimization:** In some cases, bitwise operations can offer performance benefits over higher-level operations, especially when dealing with large sets of binary data or when optimizing critical sections of code.

4. **Data Compression and Encoding:** Bitwise operators are used in data compression algorithms (like Huffman coding) and encoding schemes (like UTF-8) to efficiently represent and manipulate data at the bit level.

5. **Graphics and Image Processing:** Bitwise operations are used in graphics programming and image processing to manipulate pixels, perform masking, apply filters, and perform other operations efficiently.

While bitwise operators are not used in every Java program, they are essential in certain domains where low-level manipulation of data is required. Understanding how bitwise operators work and when to use them can be valuable in such scenarios.


## Assignment operators :
- Assignment (=)
-Addition assignment (+=)
- Subtraction assignment (-=)
- Multiplication assignment (*=)
- Division assignment (/=)
- Modulus assignment (%=)
- Bitwise AND assignment (&=)
- Bitwise OR assignment (|=)
- Bitwise XOR assignment (^=)
- Left shift assignment (<<=)
- Right shift assignment (>>=)
- Unsigned right shift assignment (>>>=)

## Ternary operator : 
- Ternary operator (?:)
