// 5장 실습문제 13번

interface Shape {
    final static double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다 ");
        draw();
    }
}

class Circle implements Shape {
    private int radius;
    public Circle(int r) {
        radius = r;
    }
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    public double getArea() {
        return radius * radius * PI;
    }
}

public class Example_5_13 {
    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}
