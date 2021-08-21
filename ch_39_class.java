class square {
    int side;

    square(int side) {
        this.side = side;
    }

    public void perimeter() {
        System.out.println("Perimeter : " + (4 * side));
    }

    public void area() {
        System.out.println("Area : " + (side * side));
    }
}

public class ch_39_class {
    public static void main(String[] args) {
        square s = new square(5);
        s.perimeter();
        s.area();
    }

}