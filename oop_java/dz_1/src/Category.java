import java.util.ArrayList;

public class Category {
    private String cat_name;
    private ArrayList<Product> cat_products;

    public Category(String name, ArrayList<Product> cat_products) {
        this.cat_name = name;
        this.cat_products = cat_products;;
    }

    public Category() {
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public ArrayList<Product> getCat_products() {
        return this.cat_products;
    }

    public void addCat_products(Product product) {
        this.cat_products.add(product);
    }

    public void printCat_products(){
        for (Product catProduct : getCat_products()) {
            System.out.printf("%s price: %s rating: %s количество: %s%n", catProduct.getName(), catProduct.getPrice(), catProduct.getRating(), catProduct.getCnt());
        }
    }
}
