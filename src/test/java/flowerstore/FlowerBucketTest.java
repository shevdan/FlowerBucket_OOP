package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private FlowerBucket flowerBucket = new FlowerBucket();
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 0, 127} ;
        flowerPack = new FlowerPack(new Flower(10.0, 10.0, color, FlowerType.CHAMOMILE), 10);
        for (int i = 0; i < 10; i++)
            flowerBucket.addPack(flowerPack);
    }

    @Test
    void getPrice() {
        assertEquals(1000.0, flowerBucket.getPrice());
    }

    @Test
    void addPack() {
        flowerBucket.addPack(flowerPack);
        assertEquals(11, flowerBucket.flowerPacks.size());
    }
}