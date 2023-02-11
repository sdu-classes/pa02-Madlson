public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        this.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}