package warehouse.strategy;
import warehouse.model.Bin;
import warehouse.model.Item;
import java.util.List;

public class BestFitStrategy implements PackingStrategy {

    @Override
    public void packItem(Item item, List<Bin> bins) {
        Bin bestBin = null;
        double minSpace = Double.MAX_VALUE;

        for (Bin bin : bins) {
            if (bin.canFit(item)) {
                double spaceLeft = (bin.getUtilization());
                if (spaceLeft < minSpace) {
                    minSpace = spaceLeft;
                    bestBin = bin;
                }
            }
        }

        if (bestBin != null) {
            bestBin.addItem(item);
        } else {
            Bin newBin = new Bin(100);
            newBin.addItem(item);
            bins.add(newBin);
        }
    }
}

