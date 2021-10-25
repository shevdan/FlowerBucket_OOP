package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store = new Store();
    FlowerBucket flowerBucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 0, 127} ;
        FlowerPack flowerPack1 = new FlowerPack(
                new Flower(10.0, 10.0, color, FlowerType.CHAMOMILE), 10);
        FlowerPack flowerPack2 = new FlowerPack(
                new Flower(1.0, 1.0, color, FlowerType.ROSE), 10);
        FlowerPack flowerPack3 = new FlowerPack(
                new Flower(5.0, 5.0, color, FlowerType.TULIP), 10);

        for (int i = 0; i < 10; i++)
            flowerBucket.addPack(flowerPack1);

        for (int i = 0; i < 5; i++)
            flowerBucket.addPack(flowerPack2);

        for (int i = 0; i < 20; i++)
            flowerBucket.addPack(flowerPack3);

        store.addBucket(flowerBucket);

        store.setTypeFilter(FlowerType.CHAMOMILE);
        store.setPriceFilter(10.0);
        store.setSepLenFilter(5.0);
        store.setColorFilter(new int[] {127, 0, 127});




    }

    @Test
    void search() {
        assertEquals(10, store.search(0).size());
        assertEquals(5, store.search(1).size());
        assertEquals(20, store.search(2).size());
        assertEquals(35, store.search(3).size());

    }
}