package warehouse.strategy;

import warehouse.model.Bin;
import warehouse.model.Item;
import java.util.List;

public class FirstFitStrategy implements PackingStrategy {

    @Override
    public void packItem(Item item, List<Bin> bins) {
        for (Bin bin : bins) {
            if (bin.canFit(item)) {
                bin.addItem(item);
                return;
            }
        }
        Bin newBin = new Bin(100);
        newBin.addItem(item);
        bins.add(newBin);
    }
}

