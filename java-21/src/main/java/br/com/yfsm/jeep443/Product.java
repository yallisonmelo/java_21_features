package br.com.yfsm.jeep443;

import jakarta.validation.constraints.NotEmpty;

public record Product(@NotEmpty(message = "Name cannot be empty")
                      String name,
                      @NotEmpty(message = "Description cannot be empty")
                      String description,
                      @NotEmpty(message = "Price cannot be empty")
                      double price) {
    Product addTax(double taxRate) {
        double tax = price * taxRate;
        double total = price + tax;
        return new Product(name, description, total);
    }
    public Product{
        if (price < 1) {
            throw new IllegalArgumentException("Price cannot be less than 1");
        }
    }
}
