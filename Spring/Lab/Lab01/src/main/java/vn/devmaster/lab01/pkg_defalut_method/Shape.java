package vn.devmaster.lab01.pkg_defalut_method;

public interface Shape {

    void draw();

    default void setColor(String color) {
        System.out.println("Vẽ hình với màu: " + color);
    }
}
