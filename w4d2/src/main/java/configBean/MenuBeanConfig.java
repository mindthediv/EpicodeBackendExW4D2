package configBean;

import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import models.Drink;
import models.Food;
import models.Merch;
import models.Order;
import models.Pizza;
import models.Product;
import models.Table;
import models.Topping;
import models.Topping.toppings;

@Configuration
public class MenuBeanConfig {
    //MENU----------------------------------------------------------------------------------------------------
    //Pizzas
    toppings[] margherita = {toppings.Tomato, toppings.Cheese} ;
    toppings[] hawaian = {toppings.Tomato, toppings.Cheese, toppings.Ham, toppings.Pineapple} ;
    toppings[] salami = {toppings.Tomato, toppings.Cheese, toppings.Salami} ;
    @Bean
    @Scope("prototype")
    public Food margherita() {
        Pizza p =  new Pizza(false, margherita);
        p.setName("Pizza Margherita");
        p.setCal(1104);
		p.setPrice(4.99);
        return p;
    }
    @Bean
    @Scope("prototype")
    public Food hawaianPizza() {
        Pizza p =  new Pizza(false,hawaian );
        p.setName("Hawaian Pizza");
        p.setCal(1024);
		p.setPrice(6.49);
        return p;
    }
    @Bean
    @Scope("prototype")
    public Food salamiPizza() {
        Pizza p =  new Pizza(false,salami );
        p.setName("Salami Pizza");
        p.setCal(1160);
		p.setPrice(5.99);
        return p;
    }
    //Drinks
    @Bean
    @Scope("prototype")
    public Food lemonade() {
        Drink lemonade = new Drink();
        lemonade.setName("Lemonade");
        lemonade.setCal(128);
        lemonade.setPrice(1.29);
        return lemonade;
    }
    @Bean
    @Scope("prototype")
    public Food water() {
        Drink water = new Drink();
        water.setName("Water");
        water.setCal(0);
        water.setPrice(1.29);
        return water;
    }
    @Bean
    @Scope("prototype")
    public Food wine() {
        Drink wine = new Drink();
        wine.setName("Wine");
        wine.setCal(607);
        wine.setPrice(7.49);
        return wine;
    }
    //Merch
    @Bean
    @Scope("prototype")
    public Product shirt(){
        Merch shirt = new Merch();
        shirt.setName("Shirt");
        shirt.setPrice(21.99);
        return shirt;
    }
    @Bean
    @Scope("prototype")
    public Product mug(){
        Merch mug = new Merch();
        mug.setName("Mug");
        mug.setPrice(4.99);
        return mug;
    }
    //Toppings
    @Bean
    @Scope("prototype")
    public Food topping(toppings t){
        Topping top = new Topping(t);
        top.setName(top.getTopping().toString());
        switch (top.getName()) {
            case "Salami":
                top.setCal(86);
                top.setPrice(0.99);
                break;
            case "Pineapple":
                top.setCal(24);
                top.setPrice(0.79);
                break;
            case "Onions":
                top.setCal(22);
                top.setPrice(0.69);
                break;
            case "Ham":
                top.setCal(35);
                top.setPrice(0.99);
                break;
            case "Cheese":
                top.setCal(92);
                top.setPrice(0.69);
                break;
        
            default:
                break;
        }
        return top;
    }
    //ORDERS---------------------------------------------------------------------------------------------
    @Bean
    @Scope("prototype")
    public Table table(int id, int maxCust, boolean isBooked) {
        Table table = new Table(id, maxCust, isBooked);
        return table;
    }
    @Bean
    @Scope("prototype")
    public Order order(int id,Table table,int customers){
        Order order =
        new Order(
        id,
         table,
          new HashMap<Product, String>(),
           customers,
            LocalDateTime.now().getHour(),
               LocalDateTime.now().getMinute(),
              0.00
        );

        return order;
    }

}

