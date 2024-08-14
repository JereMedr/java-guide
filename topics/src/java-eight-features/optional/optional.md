# Optional 
it is a container object introduced in Java 8 that can hold either a value or null. It is a powerful tool 
for avoiding NullPointerException (NPE) by explicitly expressing the presence or absence of a value. 
Instead of returning null, methods can return an Optional to indicate the possibility of no result, thereby 
forcing the caller to handle the absence of a value more consciously.

## Why Optional?
Traditionally, null has been used to represent the absence of a value, but this approach is error-prone. 
Developers often forget to check for null, leading to NullPointerException at runtime. Optional provides a 
more expressive way of handling missing values and encourages better practices by making the possibility 
of null explicit.

## Creating an Optional
There are several ways to create an Optional:

### Empty Optional
You can create an empty Optional using Optional.empty(). This is equivalent to null, but safer.

```
Optional<String> emptyOptional = Optional.empty(); 
```

### Non-Empty Optional
To create an Optional with a non-null value, use Optional.of().

```
Optional<String> nonEmptyOptional = Optional.of("Hello");
```
Note: Optional.of() throws a NullPointerException if you pass a null value.

### Nullable Optional
If the value might be null, use Optional.ofNullable().

```
Optional<String> nullableOptional = Optional.ofNullable(null);
```
If the argument is null: Optional.ofNullable() returns an empty Optional.

## Working with Optional
Optional provides a variety of methods to work with the value it might contain.

### Checking Presence of Value
You can check if Optional contains a value using isPresent() or isEmpty().
```
if (optional.isPresent()) {
    System.out.println("Value is present: " + optional.get());
} else {
    System.out.println("Value is absent");
}
```

### Retrieving the Value
To retrieve the value, you can use get(). However, you should only do this after
checking `isPresent()` to avoid `NoSuchElementException`.

``` 
String value = optional.get(); // Use with caution, might throw NoSuchElementException 
```
Best Practice: Avoid using get() unless you’re sure the value is present. Prefer other methods 
like orElse() or ifPresent().

### Providing a Default Value
Use `orElse()` to provide a default value if `Optional` is empty.
``` 
String value = optional.orElse("Default Value"); 
```
Example: If optional contains "Hello", value will be "Hello". If optional is empty, value 
will be "Default Value".

### Throwing an Exception with orElseThrow()
You can throw an exception if the value is not present using orElseThrow().

```
String value = optional.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
```
Custom Exception: You can specify the type of exception to throw if the value is absent.

## Transforming Values with map()
`map()` allows you to transform the value inside `Optional` if it is present.
``` 
Optional<String> upperOptional = optional.map(String::toUpperCase);
```

## Chaining Optionals with flatMap()
If the mapping function itself returns an Optional, use `flatMap()` to avoid nested `Optional` instances.
```
Optional<String> result = optional.flatMap(value -> Optional.of(value.toUpperCase()));
```
Difference from map(): map() wraps the result in an Optional, while flatMap() flattens it to avoid nested 
Optional<Optional<T>>.

## Stream API and Optional
Optional works well with the Streams API. For example, you can use `findFirst()` to return an `Optional` 
with the first element that matches a condition.
```
Optional<Integer> firstEven = Stream.of(1, 2, 3, 4)
    .filter(n -> n % 2 == 0)
    .findFirst();
```
Example: firstEven will contain 2 as it is the first even number in the stream.

## Potential Pitfalls and Best Practices
While Optional is powerful, it should be used appropriately to avoid unnecessary complexity.

### Don’t Overuse Optional
- `Fields in Classes:` Don’t use Optional for fields in classes. It's designed for method 
return types, not as a replacement for null in class fields.
- `Collections of Optional:` Avoid using Optional in collections, such as` List<Optional<T>>`. 
Instead, consider filtering out null values before adding elements to the collection.

## Avoid Optional in Performance-Critical Code
While Optional adds safety, it can also add overhead. In performance-critical sections, using 
Optional might not be appropriate if it causes unnecessary object creation or method calls.

## Prefer Optional Over null
`Method Return Types:` Use Optional to signal that a method might not return a value. This encourages 
the caller to handle the possibility of an absent value.
`Expressiveness:` Optional makes the code more expressive and self-documenting, as it explicitly 
indicates the potential absence of a value.