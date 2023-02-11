public class Main {
    public static void main(String[] args) {
        Person p = new Person("John", "123 Main St");
        Student s = new Student("Jane", "456 Main St", "Computer Science", 2022, 10000);
        Staff t = new Staff("Bob", "789 Main St", "ABC School", 50000);

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(t.toString());
    }
}