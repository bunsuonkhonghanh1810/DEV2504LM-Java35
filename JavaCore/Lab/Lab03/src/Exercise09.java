import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise09 {
    private boolean running = true;

    private int selectChoice() {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("1. Đi học Java \n2. Đi chơi công viên ngắm gấu \n3. Đi về nhà nghỉ \n4. Ra sông Hồng tắm tiên \n5. Ngủ cả ngày \n6. Thoát");
                System.out.print("Nhập lựa chọn: ");
                choice = input.nextInt();

                if (choice < 1 || choice > 6) {
                    throw new InvalidChoiceException("Lỗi: Nhập số từ 1 đến 6!!");
                }

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên!!");
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }

        return choice;
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                learnJava();
                break;
            case 2:
                goToThePark();
                break;
            case 3:
                goHome();
                break;
            case 4:
                goToHongRiver();
                break;
            case 5:
                sleepAllDay();
                break;
            case 6:
                System.out.println("-- Kết thúc chương trình --");
                running = false;
        }
    }

    private void learnJava() {
        System.out.println("-- Đi học Java --");
    }

    private void goToThePark() {
        System.out.println("-- Đi công viên ngắm gấu --");
    }

    private void goHome() {
        System.out.println("-- Đi về nhà --");
    }

    private void goToHongRiver() {
        System.out.println("-- Ra sông Hồng tắm tiên --");
    }

    private void sleepAllDay() {
        System.out.println("-- Ngủ cả ngày --");
    }

    public static void main(String[] args) {
        Exercise09 ex = new Exercise09();
        while(ex.running) {
            ex.handleChoice(ex.selectChoice());
        }
    }
}

class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String message) {
        super(message);
    }
}
