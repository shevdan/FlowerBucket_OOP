package flowerstore;

public class Main1 {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];

        int [] color = {127, 0, 0};
        for (int i = 0; i < flowers.length; i++){
            flowers[i] = new Flower();
            flowers[i].setColor(color);
            System.out.println(flowers[i]);

        }

        color = new int[]{0, 127, 0};

        flowers[2] = new Flower(0.0, 1.0, color, FlowerType.ROSE);

//        color = new int[]{0, 127, 0};

        color[1] = 127;

        for (int i = 0; i < flowers.length; i++){
            System.out.println(flowers[i]);

        }

        FlowerPack flowerPack = new FlowerPack(new Flower(10.0, 10.0, color, FlowerType.CHAMOMILE), 10);

        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack1 = new FlowerPack(
                new Flower(10.0, 10.0, color, FlowerType.CHAMOMILE), 10);
        FlowerPack flowerPack2 = new FlowerPack(
                new Flower(1.0, 1.0, color, FlowerType.ROSE), 20);
        FlowerPack flowerPack3 = new FlowerPack(
                new Flower(5.0, 5.0, color, FlowerType.TULIP), 100);


        flowerBucket.addPack(flowerPack1);
        flowerBucket.addPack(flowerPack2);
        flowerBucket.addPack(flowerPack3);

        Store store = new Store();

        store.addBucket(flowerBucket);
        store.setTypeFilter(FlowerType.CHAMOMILE);
        store.setColorFilter(new int[] {127, 0, 127});
        store.setSepLenFilter(5.0);
        store.setPriceFilter(1.0);

        System.out.println(store.search(0).size());

    }
}
