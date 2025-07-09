package baithuchanh1;

public class MainClass {
    public void phepTinh(ITinhToan phepTinh, float num1, float num2) {
        phepTinh.doOperation(num1, num2);
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        ImplOperationAdd add = new ImplOperationAdd();
        add.setAccuracy(IAccuracy.TWO_NUMBER);
        mainClass.phepTinh(add, 6, 9);

        ImplOperationSubstract sub = new ImplOperationSubstract();
        sub.setAccuracy(IAccuracy.THREE_NUMBER);
        mainClass.phepTinh(sub, 9, 6);

        ImplOperationMultiply multi = new ImplOperationMultiply();
        multi.setAccuracy(IAccuracy.FOUR_NUMBER);
        mainClass.phepTinh(multi, 3, 3);
    }
}
