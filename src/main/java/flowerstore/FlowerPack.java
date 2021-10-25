package flowerstore;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount){
        setFlower(flower);
        setAmount(amount);
    }

    public FlowerPack(){

    }

    public double getPrice(){
        return flower.getPrice() * amount;
    }

    public FlowerType getFlowerType(){
        return flower.getFlowertype();
    }

    public double getSepLen(){
        return flower.getSepalLength();
    }

    public int[] getColor(){
        return flower.getColor();
    }
}
