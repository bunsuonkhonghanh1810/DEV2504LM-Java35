package thailand;

import product.Product;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice(String prodId, String prodName, double prodPrice, String manufacturer, float taxImported, float importPriceSupport) {
        super(prodId, prodName, prodPrice, manufacturer);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice() {}

}
