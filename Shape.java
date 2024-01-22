abstract class Shape {
    public int side1, side2;
    abstract void printArea();
}


class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.side1 = length;
        this.side2 = breadth;
    }
    void printArea() {
        System.out.println("The Area of Rectangle : " + (side1 * side2));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.side1 = base;
        this.side2 = height;
    }
    void printArea() {
        System.out.println("The Area of Triangle : " + (0.8* side1 * side2));
    }
}

class Circle extends Shape {
    Circle(int rad) {
        this.side1 = this.side2 = rad;
    }
    void printArea() {
        System.out.println("The Area of Circle : " + (3.14 * side1 * side2));
    }
}


class SRun{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        Triangle t = new Triangle(6, 10);
        Circle c = new Circle(6);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}