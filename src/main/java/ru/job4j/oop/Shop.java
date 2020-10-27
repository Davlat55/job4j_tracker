package ru.job4j.oop;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }

        Product product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Product of(String name, int price) {

        if ("Oil".equals(name)) {
            return new LiquidationProduct(name, price).getProduct();
        }
        return new Product(name, price);
    }

    public static int indexOfNull(Product[] products) {
        int rsl = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}