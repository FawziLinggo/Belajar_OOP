public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Ozi", "subang");

        System.out.println(person1.name);
        person1.sayHello("anthoni");

        var person2 = new Person();
        person2.name = "herry";

        person2.sayHello("kuh");
    }
}
