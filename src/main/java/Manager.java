class Manager extends  Employee{
    int age;
    Manager(String name, int age ){
        super(name);
        this.age = age;
    }
    void sayHello(String name){
        System.out.println("hi " + name + "my name is " + this.name + " umurnya " + this.age);
    }

}
