package products;

import Category.Category;

public class Product {
    public Product(String name, double price, Category category) {
        super();
        this.name = name;
        this.price = price;
        this.setCategory(category);
    }

    private String name;
    private double price;
    private Category category;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
