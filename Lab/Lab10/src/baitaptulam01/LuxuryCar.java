package baitaptulam01;

public class LuxuryCar extends Car {
    private float specialRate;

    @Override
    public float calculatePrice() {
        return super.calculatePrice() + specialRate * getRootPrice();
    }

    public float calculatePrice(float transportCost) {
        return super.calculatePrice() + specialRate * getRootPrice() + transportCost;
    }
}
