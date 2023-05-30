package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Drink extends Food {
    public void showDrink() {
        System.out.print(this.getName() + " Cal: "  +this.getCal()+" Price "+this.getPrice());
        System.out.println();
    }
}