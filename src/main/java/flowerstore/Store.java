package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Getter @Setter
public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();
    private FlowerType typeFilter;
    private double priceFilter, sepLenFilter;
    private int[] colorFilter;

    public Store(ArrayList<FlowerBucket> flowerBuckets){
        this.flowerBuckets = flowerBuckets;
    }

    public Store(){

    }

    public void addBucket(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }

    public List<FlowerPack> search(int filterParam){
        /*
        Params for search:
        0 - flower pack type
        1 - price of a flower pack
        2 - sepal length of flowers in flower pack
        3 - color of flowers in flower pack
         */
        FlowerBucket currBucket;
        FlowerPack currPack;
        List<FlowerPack> packsFound = new ArrayList<>();
        for (int i = 0; i < flowerBuckets.size(); i++){
            currBucket = flowerBuckets.get(i);
            for (int j = 0; j < currBucket.flowerPacks.size(); j++){
                currPack = currBucket.flowerPacks.get(j);
                if (filterParam == 0)
                    if (typeFilter.equals(currPack.getFlowerType()))
                        packsFound.add(currPack);

                if (filterParam == 1)
                    if (priceFilter == currPack.getPrice())
                        packsFound.add(currPack);

                if(filterParam == 2)
                    if (sepLenFilter == currPack.getSepLen())
                        packsFound.add(currPack);

                if (filterParam == 3)
                    if (Arrays.equals(colorFilter, currPack.getColor()))
                        packsFound.add(currPack);
            }
        }
        return packsFound;
    }

}
