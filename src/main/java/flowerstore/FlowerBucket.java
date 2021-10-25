package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class FlowerBucket {

    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public double getPrice(){
        double price = 0;
        System.out.println(flowerPacks.size());
        if (flowerPacks.size() == 0)
            return 0.0;
        for (int i = 0; i < flowerPacks.size(); i++){
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    public void addPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }
}
