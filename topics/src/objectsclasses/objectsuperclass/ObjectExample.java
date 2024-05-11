package objectsclasses.objectsuperclass;

public class ObjectExample {
    public static void main(String[] args) {
        Object obj1 = new String("Hello"); // Creating a String object and assigning it to an Object variable
        Object obj2 = new Integer(10); // Creating an Integer object and assigning it to an Object variable

        System.out.println(obj1.toString()); // Printing the result of the toString() method of obj1
        System.out.println(obj2.getClass()); // Printing the class type of obj2

        /* Here, the parseInt() method of the Integer class is used to convert a string representing 
        a number into an Integer object. Arithmetic operations with Integer: */
        String str = "123";
        Integer num = Integer.parseInt(str);

        System.out.println("Class of variable num is: " + num.getClass());
        System.out.println("Value of variable num is: " + num );

        // int n = 9;
        // String s = n.toString(); //Cannot invoke toString() on the primitive type intJava(67108978)
    }
}
