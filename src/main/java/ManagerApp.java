public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("lala", 12);
        manager.sayHello("yamett");

        var vicePresident = new VicePresident("baba", 13);
        vicePresident.sayHello("ikeh");
    }
}
