/** สินค้าหนึ่งชิ้น */
public record Product(String id, String name, double price) {
    public Product {
        if (price < 0) throw new IllegalArgumentException("price must be >= 0");
    }
 }
