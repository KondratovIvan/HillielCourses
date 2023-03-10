import java.util.Objects;

public final class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public static String message(String nullException) {
        return nullException;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}