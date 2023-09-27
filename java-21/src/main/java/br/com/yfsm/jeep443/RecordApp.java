package br.com.yfsm.jeep443;

public class RecordApp {


    public static void main(String[] args) {

        var product = new Product("Bike", "Fast bike", 145.50).addTax(0.10);
        if (product instanceof Product(String name, String description, double price)) {
            System.out.println("Product name: " + name);
            System.out.println("Product description: " + description);
            System.out.println("Product price: " + price);
        }
        System.out.println(switchPattern(product));

    }

    static String switchPattern(Object obj){
    return switch (obj){
        case Product o -> "Product name: " + o;
        case Integer i -> "INT: " + i;
        case String s -> "String: " + s;
        default -> "Unknown";
        };
    }
}
