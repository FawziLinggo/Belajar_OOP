class Person {
    String name;
    String address;
    final String Country = "Arab Saudi";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    //constructor overloading
    Person(String paramName){
    this(paramName, null);
    }

    Person(){
        this(null);
    }
    //method
    void sayHello(String paraName){
        System.out.println("hallo " + paraName + " saya " + name);
    }

}
