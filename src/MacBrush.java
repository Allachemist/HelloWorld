public class MacBrush {
    int size;
    public static final String BRAND = "MAC";
    String type;
    double price;

    public MacBrush() {
    }

    public MacBrush(int size, String type, double price) {
        this.size = size;
        this.type = type;
        this.price = price;

    }
    public MacBrush(int number) {
        this.size = number;
        this.type = "lips";
        this.price = number;

    }

    public String toString() {

        return "size:" + this.size + ",type:" + this.type + ", price:" + this.price;
    }
}


