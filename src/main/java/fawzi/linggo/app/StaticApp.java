package fawzi.linggo.app;

import fawzi.linggo.statickeyword.*;

public class StaticApp {
    public static void main(String[] args) {

        // Variabel
        System.out.println(constact.APPLICATION);
        System.out.println(constact.VERSION );

        //method
        System.out.println(
                MathUtil.sum(2,2,3,3)
        );

        Country.City city = new Country.City();
        city.setName("Yametteeee");
        System.out.println(city.getName());
    }
}
