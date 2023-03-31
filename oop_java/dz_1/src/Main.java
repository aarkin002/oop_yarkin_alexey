import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /** Создаем продукты, категории, баскеты и пользователей */

        Product hp = new Product("HP", 21000, 4, 14);
        Product lenovo = new Product("LENOVO", 11000, 3, 7);
        Product sony = new Product("Sony", 17000, 2, 11);
        ArrayList<Product> nout_arr = new ArrayList<>();
        ArrayList<Product> mon_arr = new ArrayList<>();
        ArrayList<Product> sw_arr = new ArrayList<>();
        Category noutbooks = new Category("n2016", nout_arr);
        Category monitors = new Category("17", mon_arr);
        Category swithes = new Category("smart", sw_arr);
        noutbooks.addCat_products(hp);
        noutbooks.addCat_products(lenovo);
        noutbooks.addCat_products(sony);
        ArrayList<Product> usr1_bsk_arr = new ArrayList<>();
        Basket usr1_bsk = new Basket(usr1_bsk_arr);
        User usr1 = new User("usr1", "pswrd1", usr1_bsk);
        ArrayList<Product> usr2_bsk_arr = new ArrayList<>();
        Basket usr2_bsk = new Basket(usr1_bsk_arr);
        User usr2 = new User("usr2", "pswrd2", usr2_bsk);
        ArrayList<Product> usr3_bsk_arr = new ArrayList<>();
        Basket usr3_bsk = new Basket(usr1_bsk_arr);
        User usr3 = new User("usr3", "pswrd3", usr3_bsk);
        //Выводим в консоль содержимое категории
        System.out.println("Изначальное содержимое категории:");
        noutbooks.printCat_products();

        /** Пользователь покупает продукт */

        usr1.addUserBasket(hp);
        usr1.addUserBasket(hp);
        usr1.addUserBasket(lenovo);
        usr1.addUserBasket(sony);

        /** Выводим в консоль актуальное содержимое категории */


        System.out.println("Содержимое категории после покупки пользователем:");
        noutbooks.printCat_products();

        /** Выводим в консоль содержимое Basket */

        System.out.println("Содержимое пользовательского Basket:");
        usr1.printUser_basket();
    }
}
