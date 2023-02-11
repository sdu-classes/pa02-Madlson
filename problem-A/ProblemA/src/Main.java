public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Bear");
        System.out.println(a);

        Mammal m = new Mammal("Horse");
        System.out.println(m);

        Cat c = new Cat("Boris");
        System.out.println(c);
        c.greets();

        Dog d = new Dog("Rex");
        System.out.println(d);
        d.greets();
        Dog d2 = new Dog("Aqtos");
        System.out.println(d2);
        d.greets(d2);

    }
}