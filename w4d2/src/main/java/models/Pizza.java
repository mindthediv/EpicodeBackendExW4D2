package models;

import models.Topping.toppings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pizza extends Food { 
    boolean isLarge = false;
    toppings[] base = {toppings.Tomato, toppings.Cheese};
    
    public void showPizza() {
        System.out.print(this.getName() + " (");
        for (toppings t : base) {
            System.out.print(t + ", ");
        }
        System.out.print(") Cal: "+this.getCal()+" Price "+this.getPrice());
        System.out.println();
    }
}