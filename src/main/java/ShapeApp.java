public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var recrangle = new Recrangle();
        System.out.println(recrangle);
        System.out.println(recrangle.getCorner());
        System.out.println(recrangle.getParentCorner());
    }
}
