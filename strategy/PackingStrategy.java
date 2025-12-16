package warehouse.strategy;

import  warehouse.model.Bin;
import warehouse.model.Item;
import java.util.List;

public interface PackingStrategy {
    void packItem(Item item, List<Bin> bins);
}