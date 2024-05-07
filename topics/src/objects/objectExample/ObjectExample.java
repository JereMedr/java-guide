package objects.objectExample;
public class ObjectExample {
    public static void main(String[] args) {
        Object obj1 = new String("Hello"); // Creando un objeto de tipo String y asignándolo a una variable de tipo Object
        Object obj2 = new Integer(10); // Creando un objeto de tipo Integer y asignándolo a una variable de tipo Object

        System.out.println(obj1.toString()); // Imprimiendo el resultado del método toString() de obj1
        System.out.println(obj2.getClass()); // Imprimiendo el tipo de clase de obj2

        /* Aquí, el método parseInt() de la clase Integer se utiliza para convertir una cadena de texto que representa 
        un número en un objeto Integer. Operaciones aritméticas con Integer: */
        String str = "123";
        Integer num = Integer.parseInt(str);

        System.out.println("Class of variable num is: " + num.getClass());
        System.out.println("Value of variable num is: " + num );

        // int n = 9;
        // String s = n.toString(); //Cannot invoke toString() on the primitive type intJava(67108978)
    }
}
