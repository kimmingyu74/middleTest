package shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 4);

        System.out.println("원 면적: " + circle.getArea());
        System.out.println("사각형 면적: " + rectangle.getArea());
        System.out.println("삼각형 면적: " + triangle.getArea());
    }
}
