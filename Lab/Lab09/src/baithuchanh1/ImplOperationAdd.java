package baithuchanh1;

public class ImplOperationAdd implements ITinhToan, IAccuracy {
    private int accuracy;

    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public void doOperation(float num1, float num2) {
        System.out.print("\n");
        System.out.printf("Result Add = %." + this.accuracy + "f", (num1 + num2));
    }
}
