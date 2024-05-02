# Variables in Java are classified according to their nature and use 
---
### Instance Variables: 
Variables declared within a class, but outside any method. Each instance (object) 
of the class has its own copy of these variables.

`int instanceVariable;`
 ---

### Class Variables (or static): 
Variables declared with the static modifier in a class. These variables are associated with
the class rather than with individual instances and are shared among all instances of the class.

`static int classVariable;`
 ---

### Constants: 
Variables whose value cannot change once they have been assigned an initial value. In Java, 
they are usually defined using the final modifier and as a convention they are written in uppercase.

`final double PI = 3.14;`
---

### Method Parameters: 
Variables used to pass data to methods. They are defined in the parameter list of a method and their
scope is limited to the body of the method. 

```
static public void increaseAgeOneYear(int age) {
    age = age + 1;
    System.out.println("Your new age is " + age);
}
```

--- 

### Local Variables: 
Variables declared within a method, constructor, or block. They are only accessible within that scope 
and must be initialized before being used. 
    
static void localVaraibleExample() {
        int localVariable = 10;
        System.out.println(localVariable);
    }
```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
