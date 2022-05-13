package fawzi.linggo.app;

import fawzi.linggo.data.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("ikeh ikeh", 2500);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);
    }
}
