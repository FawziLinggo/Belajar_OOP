class Shape {
    int getCorner(){
        return 0;
    }
}

class Recrangle extends Shape{
    @Override
    int getCorner() {
        return 4;
    }
    int getParentCorner(){
        return super.getCorner();
    }

}