public class Product extends Category {
    private String name;
    private Integer price;
    private Integer rating;
    private int cnt;

    public Product(String name, Integer price, Integer rating, int cnt){
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public Product buy_product() {
        Product pay_prod =  new Product(getName(), getPrice(), getRating(), 1);
        setCnt(cnt - 1);
        return pay_prod;
    }
}
