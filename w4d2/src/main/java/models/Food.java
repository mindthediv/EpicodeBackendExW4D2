package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Food extends Product{
    int Cal;

    @Override
    public String toString() {
        return this.getName() + " Cal "+this.getCal()+" Price "+this.getPrice();
    }
}