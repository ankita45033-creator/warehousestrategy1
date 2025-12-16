package warehouse.model;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    private double capacity;
    private double usedSpace;
    private List<Item> items;

    public Bin(double capacity) {
        this.capacity = capacity;
        this.usedSpace = 0;
        this.items = new ArrayList<>();
    }

    public boolean canFit(Item item) {
        return usedSpace + item.getWeight() <= capacity;
    }

    public void addItem(Item item) {
        items.add(item);
        usedSpace += item.getWeight();
    }

    public double getUtilization() {
        return usedSpace / capacity;
    }

    public List<Item> getItems() {
        return items;
    }
}



