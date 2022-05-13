package fawzi.linggo.app;

import fawzi.linggo.enumtes.*;

public class EnumApp {
    public static void main(String[] args) {
        Custommer custommer = new Custommer();
        custommer.setName("Eko");
        custommer.setLevel(Level.PREMIUM);

        System.out.println(custommer.getName() +" Levelnya "+ custommer.getLevel() + " dan kelasnya " + custommer.getLevel().getDesccription());
    }
}
