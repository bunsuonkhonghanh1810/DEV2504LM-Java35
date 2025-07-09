import java.util.Scanner;

public class BaiThucHanh01 {
    public static void main(String[] args) {
        System.out.println("Nhập nhiệt độ cần chuyển đổi");
        Scanner sc = new Scanner(System.in);
        float nhietDo = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhiệt độ bạn vừa nhập là: (bấm C hoặc F)");
        char type = sc.next().charAt(0);
        ConvertTemperature convertTemp = new ConvertTemperature();
        switch (type) {
            case 'C':
                convertTemp.convert(nhietDo, false);
                break;
            case 'F':
                convertTemp.convert(nhietDo, true);
                break;
        }
    }
}
