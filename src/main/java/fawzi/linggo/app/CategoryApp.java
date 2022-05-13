package fawzi.linggo.app;

import fawzi.linggo.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
