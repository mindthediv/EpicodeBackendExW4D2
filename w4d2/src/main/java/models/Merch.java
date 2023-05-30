package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Merch extends Product {

    public void showMerch() {
        System.out.println(this.getName() + " Price " + this.getPrice());
    }
}
