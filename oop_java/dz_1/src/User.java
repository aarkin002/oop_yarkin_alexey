public class User{
    private String login;
    private String pass;

    private Basket usr_bsk;

    public User(String login, String pass, Basket usr_bsk) {
        this.login = login;
        this.pass = pass;
        this.usr_bsk = usr_bsk;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Basket getUserBasket(){
        return this.usr_bsk;
    }

    public void addUserBasket(Product product) {
        usr_bsk.addBasket_product(product);
    }

    public void printUser_basket(){
        for (Product p : getUserBasket().getPayed_products()){
            System.out.printf("%s price: %s rating: %s количество: %s%n", p.getName(), p.getPrice(), p.getRating(), p.getCnt());
        }
    }
}
