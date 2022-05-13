package fawzi.linggo.data;

public class Product {
    public String name;
    public int price;

    //dibuat publik biar bisa di akses di luar paket
    public Product(String name, int price){
        this.name = name;
        this.price =price;
    }
    public String toString(){
        return  "Produc name :" + name + ", price " + price;
    }

}
