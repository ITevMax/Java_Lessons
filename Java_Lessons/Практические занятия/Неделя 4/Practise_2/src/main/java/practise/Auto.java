package practise;

import java.util.Objects;

public class Auto {
    private String name;
    private double price;
    private AutoCategory category;

    public Auto() {
        name = "Пустота";
        category = AutoCategory.Default;
    }

    public Auto(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = AutoCategory.Default;
    }

    public Auto(String name, double price, AutoCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public AutoCategory getCategory() {
        return category;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(AutoCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto that = (Auto) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", category=").append(category);
        sb.append('}');
        return sb.toString();
    }
}
