package Lab8;

public class Circle extends GraphicObject {
    private double r;
    final double PI = 3.14;

    @Override
    void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    double findArea() {
        return PI * (r * r);
    }
    public Circle (double);
    }//main

}//class
