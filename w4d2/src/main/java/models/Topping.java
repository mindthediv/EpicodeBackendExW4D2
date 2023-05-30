package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Topping extends Food {
    public enum toppings {Cheese,Ham,Onions,Pineapple,Salami,Tomato};
    toppings topping;

    @Override
    public String toString() {
        return this.getName() +" Cal "+this.getCal()+ " Price "+this.getPrice();
    }
}