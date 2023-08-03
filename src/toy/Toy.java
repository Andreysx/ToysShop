package toy;

public class Toy {

    int id;
    String name;
    double dropchance;
    int quantity;


    public Toy(Integer id, String name, Integer dropchance, Integer quantity) {
        this.id = id;
        this.name = name;
        this.dropchance = dropchance;
        this.quantity = quantity;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDropchance() {
        return dropchance;
    }

    public int getQuantity() {
        return quantity;
    }
}
