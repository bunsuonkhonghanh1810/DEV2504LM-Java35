package baitaptulam01;

import java.util.Scanner;

public class Menu {
    private boolean running;
    private Scanner sc;

    public Menu() {
        this.running = true;
        this.sc = new Scanner(System.in);

        while (running) {
            int choice = getChoice();
            handleChoice(choice);
        }
    }

    public int getChoice() {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("1. Input a list of LuxuryCar\n2. Display the information of this list\n3. Sort list descending by rootPrice and display\n4. Search information by input car name\n5. Display totalPrice of all cars which transportCost is $20000\n6. Exit");
                System.out.print("- Nhập lựa chọn: ");
                String input = sc.nextLine().trim();
                choice = Integer.parseInt(input);

                if (choice < 1 || choice > 6) {
                    throw new InvalidChoiceException("Invalid choice");
                }

                validInput = true;

            } catch (NumberFormatException e) {
                System.out.println("----- Invalid choice  -----");
            } catch (InvalidChoiceException e) {
                System.out.println("----- " + e.getMessage() + " -----");
            }
        }

        return choice;
    }

     public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                running = false;
                break;
        }
     }
}