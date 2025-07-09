public class MainClass {
    /*final*/ float PI = 3.14f;

    public void display(float pi) {
        PI = pi;
        System.out.println("PI = " + PI);
    }

    public static void main(String[] args) {
        final MainClass obj = new MainClass();
        obj.display(22.7F);
    }
}
