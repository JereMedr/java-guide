package variables;
/* Descripción: En Java, Object es la superclase de todas las clases. Esto significa que 
cada clase en Java es, directa o indirectamente, una subclase de Object. Como resultado, 
cualquier objeto en Java se puede asignar a una variable de tipo Object. Uso en la vida 
real: La clase Object se utiliza para proporcionar funcionalidades comunes que son heredadas 
por todas las clases en Java. Algunos de los métodos más comunes de la clase Object incluyen 
toString(), equals(Object obj), hashCode(), getClass(), etc. Estos métodos se pueden 
sobrescribir en las subclases para personalizar su comportamiento según sea necesario. */
public class ObjectExample {
    public static void main(String[] args) {
        Object obj1 = new String("Hello"); // Creando un objeto de tipo String y asignándolo a una variable de tipo Object
        Object obj2 = new Integer(10); // Creando un objeto de tipo Integer y asignándolo a una variable de tipo Object

        System.out.println(obj1.toString()); // Imprimiendo el resultado del método toString() de obj1
        System.out.println(obj2.getClass()); // Imprimiendo el tipo de clase de obj2

        // ejemplo concreto con null :
        Integer number = new Integer(10);

        /* Aquí, el método parseInt() de la clase Integer se utiliza para convertir una cadena de texto que representa 
        un número en un objeto Integer. Operaciones aritméticas con Integer: */
        String str = "123";
        Integer num = Integer.parseInt(str);

        // int n = 9;
        // String s = n.toString(); //Cannot invoke toString() on the primitive type intJava(67108978)

    }
}
