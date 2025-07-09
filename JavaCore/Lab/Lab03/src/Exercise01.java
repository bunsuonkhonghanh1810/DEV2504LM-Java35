public class Exercise01 {
    public Exercise01() {}

    private int sum1To100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = new Exercise01().sum1To100();
        System.out.println(sum);
    }
}
