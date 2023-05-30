package models;

import java.util.HashMap;
import java.util.Map.Entry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class Order {
    int orderId;
    Table table;
    HashMap<Product,String> list;
    int customers;
    int atHour;
    int atMinute;
    double total;
    

    public void addProduct(Product p, String note) {
        this.getList().put(p, note);
        sumTotal();
    }
    public void sumTotal() {
        double sum = 0;
        for (Product p : this.getList().keySet()) {
            sum += p.getPrice();
        }
        double custFee = 1.00;
        sum += custFee*customers;
        setTotal(sum);
    }
    public void printOrder(){
        System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/");
        System.out.println("Orders list:");
        for (Entry<Product, String> es : this.getList().entrySet()) {
            System.out.println(es.getKey()+" Nb:"+es.getValue()+" Price "+es.getKey().getPrice()+"$"); 
        }
        System.out.println("+ customerFee = 1.00 x "+this.getCustomers()+" customers");
        System.out.println("Total ---------------");
        System.out.println(this.getTotal()+"$");
        System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/");
        System.out.println();
    }
}
