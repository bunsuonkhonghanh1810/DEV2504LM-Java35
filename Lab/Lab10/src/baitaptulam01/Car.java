package baitaptulam01;

public class Car implements Icar {
    private String name;
    private String producer;
    private int year;
    private int seat;
    private float rootPrice;

    @Override
    public float calculateTax() {
        if (seat < 7) {
            return (float) (rootPrice * 0.6);
        }

        return (float) (rootPrice * 0.7);
    }

    @Override
    public float calculatePrice() {
        return rootPrice + calculateTax();
    }

    @Override
    public void getInfor() {
        System.out.println(name + " car produced by " + producer + " in " + year + " has " + seat + " seats with the total price is $" + calculatePrice());
    }

    public float getRootPrice() {
        return rootPrice;
    }
}



