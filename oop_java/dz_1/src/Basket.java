import java.util.ArrayList;

public class Basket{
    private ArrayList<Product> payed_products;

    public Basket(ArrayList<Product> payed_products) {
        this.payed_products = payed_products;
    }

    public ArrayList<Product> getPayed_products() {
        return payed_products;
    }

    public void addBasket_product(Product product){
        payed_products.add(product.buy_product());
    }
}
