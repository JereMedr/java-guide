package interfaceAbstraction;
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meows");
    }
}