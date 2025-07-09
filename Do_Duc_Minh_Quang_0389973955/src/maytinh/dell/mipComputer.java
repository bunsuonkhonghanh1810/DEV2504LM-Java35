package maytinh.dell;

import exception.InvalidChoiceException;
import maytinh.Maytinh;
import maytinh.apple.Apple;

import java.util.*;

public class mipComputer {
    private boolean running;
    private ArrayList<Maytinh> computers;
    private ArrayList<Maytinh> arrangedComputers;

    public mipComputer() {
        running = true;
        computers = new ArrayList<>();

        while(running) {
            int choice = getChoice();
            handleChoice(choice);
        }
    }

    public int getChoice() {
        int choice;

        while (true) {
            try {
                System.out.println("\n-----MENU-----");
                System.out.println("1. Input\n2. Display\n3. Sort\n4. Search\n5. Exit");
                Scanner in = new Scanner(System.in);
                choice = in.nextInt();
                in.nextLine();
                if (choice < 1 || choice > 5) {
                    throw new InvalidChoiceException();
                }

                break;
            } catch (NumberFormatException | InvalidChoiceException e) {
                System.out.println("Invalid choice, please choose again");
            }
        }

        return choice;
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                inputComputerInfo();
                break;
            case 2:
                displayComputerInfo();
                break;
            case 3:
                sortComputers();
                break;
            case 4:
                searchComputers();
                break;
            case 5:
                running = false;
        }
    }

    public void inputComputerInfo() {
        int choice;

        while (true) {
            try {
                System.out.println("\n1. Dell\n2. Apple");
                Scanner in = new Scanner(System.in);
                choice = in.nextInt();
                in.nextLine();
                if (choice < 1 || choice > 2) {
                    throw new InvalidChoiceException();
                }
                break;
            } catch (NumberFormatException | InvalidChoiceException e) {
                System.out.println("Invalid choice, please choose again");
            }

        }

        if (choice == 1) {
            Dell temp = new Dell();
            temp.inputInfor();
            computers.add(temp);
        } else {
            Apple temp = new Apple();
            temp.inputInfor();
            computers.add(temp);
        }
    }

    public void displayComputerInfo() {
        for (Maytinh computer : computers) {
            System.out.println();
            computer.displayInfor();
        }
    }

    public void sortComputers() {
        arrangedComputers = new ArrayList<>();
        arrangedComputers.addAll(computers);

        for (int i = 0; i < arrangedComputers.size() - 1; i++) {
            for (int j = 0; j < arrangedComputers.size() - i - 1; j++) {
                int w1 = getWarranty(arrangedComputers.get(j));
                int w2 = getWarranty(arrangedComputers.get(j + 1));

                if (w1 > w2) {
                    Maytinh temp = arrangedComputers.get(j);
                    arrangedComputers.set(j, arrangedComputers.get(j + 1));
                    arrangedComputers.set(j + 1, temp);
                }
            }
        }

        int choice;

        while (true) {
            try {
                System.out.println("\n1. Ascending\n2. Descending");
                Scanner in = new Scanner(System.in);
                choice = in.nextInt();
                in.nextLine();
                if (choice < 1 || choice > 2) {
                    throw new InvalidChoiceException();
                }
                break;
            } catch (NumberFormatException | InvalidChoiceException e) {
                System.out.println("Invalid choice, please choose again");
            }

        }

        if (choice == 2) {
            Collections.reverse(arrangedComputers);
        }

        System.out.printf("%-30s | %-30s\n", "Before", "After");
        for (int i = 0; i < arrangedComputers.size(); i++) {
            System.out.printf("%-30s | %-30s\n", computers.get(i).getCode() + " - " + computers.get(i).getName() + "(" + getWarranty(computers.get(i)) + ")", arrangedComputers.get(i).getCode() + " - " + arrangedComputers.get(i).getName() + "(" + getWarranty(arrangedComputers.get(i)) + ")");
        }
    }

    private int getWarranty(Maytinh maytinh) {
        if (maytinh instanceof Dell) {
            return ((Dell) maytinh).getWarranty();
        }

        return ((Apple) maytinh).getWarranty();
    }

    public void searchComputers() {
        int choice;

        while (true) {
            try {
                System.out.println("\n1. Dell\n2. Apple");
                Scanner in = new Scanner(System.in);
                choice = in.nextInt();
                in.nextLine();
                if (choice < 1 || choice > 2) {
                    throw new InvalidChoiceException();
                }
                break;
            } catch (NumberFormatException | InvalidChoiceException e) {
                System.out.println("Invalid choice, please choose again");
            }

        }

        if (choice == 1) {
            for (Maytinh computer : computers) {
                if (Objects.equals(computer.getName(), "Dell")) {
                    System.out.println();
                    computer.displayInfor();
                }
            }
        } else {
            for (Maytinh computer : computers) {
                if (Objects.equals(computer.getName(), "Apple")) {
                    System.out.println();
                    computer.displayInfor();
                }
            }
        }
    }

    public static void main(String[] args) {
        mipComputer mipComputer = new mipComputer();
    }
}
