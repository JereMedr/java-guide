# Java data types wrappers / non primitive data types


| Primitive Type | Wrapper Class |
|----------------|---------------|
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
| char           | Character     |
| boolean        | Boolean       |

In Java, wrapper classes are used to convert primitive data types into objects so that they can be included in activities reserved for objects, like collections. Java 8 introduced various features, but the concept of wrapper classes remains consistent.




---
### Invalid:
```
ArrayList<int> myNumbers = new ArrayList<int>();
```

### Valid
``` 
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
```