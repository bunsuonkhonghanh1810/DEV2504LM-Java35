package vn.devmaster.lab02.dependency_injection;

import java.awt.*;

public class DrawShape {
    private Shape shape;

    public DrawShape(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape(new CircleShape());
        drawShape.draw();

        drawShape = new DrawShape(new RectangleShape());
        drawShape.draw();
    }
}
