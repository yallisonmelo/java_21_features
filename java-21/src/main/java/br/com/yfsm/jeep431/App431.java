package br.com.yfsm.jeep431;

import br.com.yfsm.jeep443.Product;

import java.util.ArrayList;
import java.util.List;

public class App431 {

    public static void main(String[] args) {

        //This is sample using jeep431 Sequenced Collections

        List<Product> products = new ArrayList<>();
        products.add(new Product("Bike", "Fast bike", 145.50));
        products.add(new Product("Car", "Fast car", 100.00));
        products.add(new Product("Bus", "Fast bus", 10000.00));

        products.addFirst(new Product("Van", "Fast van", 10000.00));
        products.addLast(new Product("Motorcycle", "Fast motorcycle", 100.00));

        System.out.println("This is the first product: " + products.getFirst());
        System.out.println("This is the last product: " +products.getLast());
        products.forEach(System.out::println);

        products.removeFirst();
        System.out.println("removeFirst");
        products.removeLast();
        System.out.println("removeLast");
        System.out.println("After removeFirst and removeLast");
        products.forEach(System.out::println);
    }
}
