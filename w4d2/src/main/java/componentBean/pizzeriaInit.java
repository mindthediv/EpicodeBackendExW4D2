package componentBean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import configBean.MenuBeanConfig;
import lombok.NoArgsConstructor;
import models.Drink;
import models.Merch;
import models.Order;
import models.Pizza;
import models.Table;
import models.Topping;
import models.Topping.toppings;

@Component
@NoArgsConstructor
public class pizzeriaInit implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuBeanConfig.class);

		//Menu Beans
		Pizza margherita = (Pizza) appContext.getBean("margherita");
		Pizza hawaianPizza = (Pizza) appContext.getBean("hawaianPizza");
		Pizza salamiPizza = (Pizza) appContext.getBean("salamiPizza");
		Drink lemonade = (Drink) appContext.getBean("lemonade");
		Drink water = (Drink) appContext.getBean("water");
		Drink wine = (Drink) appContext.getBean("wine");
		Merch shirt = (Merch) appContext.getBean("shirt");
		Merch mug = (Merch) appContext.getBean("mug");
		Topping salami = (Topping) appContext.getBean("topping", toppings.Salami);
		Topping pineapple = (Topping) appContext.getBean("topping", toppings.Pineapple);
		Topping onions = (Topping) appContext.getBean("topping", toppings.Onions);
		Topping ham = (Topping) appContext.getBean("topping", toppings.Ham);
		Topping cheese = (Topping) appContext.getBean("topping", toppings.Cheese);
		
		//Output Menu
        System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
		System.out.println("Pizzas------------------------");
		margherita.showPizza();
		hawaianPizza.showPizza();
		salamiPizza.showPizza();
		System.out.println("Toppings------------------------");
		System.out.println(salami.toString()); 
		System.out.println(pineapple.toString()); 
		System.out.println(onions.toString()); 
		System.out.println(ham.toString()); 
		System.out.println(cheese.toString()); 
		System.out.println("Drinks------------------------");
		System.out.println(lemonade.toString()); 
		System.out.println(water.toString()); 
		System.out.println(wine.toString()); 
		System.out.println("Franchise------------------------");
		System.out.println(shirt.toString()); 
		System.out.println(mug.toString()); 
        System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
        System.out.println();

        // Order Beans
        Table table1 = (Table) appContext.getBean("table",1,5,true );
        Order order1 = (Order) appContext.getBean("order", 1,table1,5);
        order1.addProduct(hawaianPizza, "");
        order1.addProduct(salamiPizza, "");
        order1.addProduct(water, "sparkle");
        order1.printOrder();

		appContext.close();
    }
    
}
