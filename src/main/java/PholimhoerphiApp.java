public class PholimhoerphiApp {
    public static void main(String[] args) {
        Employee employee = new Employee("ekpo");
        employee.sayHello("budi");
        employee = new Manager("kon", 13);
        employee.sayHello("kin");
        employee =new VicePresident("ki", 89);
        employee.sayHello("khunnafa");

        sayHello(new Employee("eko"));
        sayHello(new Manager("ana",99));
        sayHello(new VicePresident("kiki",90));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello"+ employee.name);
    }
}

