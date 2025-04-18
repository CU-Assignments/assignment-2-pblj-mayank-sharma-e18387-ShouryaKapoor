class Product {
    int id;
    String name;
    double price;

    // Constructor
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    void displayDetails() {
        System.out.println("Product Details: ID: " + id + " Name: " + name + " Price: " + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", 75000);
        product.displayDetails();
    }
}
