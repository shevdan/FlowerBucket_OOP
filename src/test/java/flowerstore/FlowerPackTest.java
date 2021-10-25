package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 0, 127} ;
        flowerPack = new FlowerPack(new Flower(10.0, 10.0, color, FlowerType.CHAMOMILE), 10);
    }

    @Test
    void getPrice() {
        assertEquals(100.0, flowerPack.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flowerPack.getFlowerType());
    }

    @Test
    void getSepLen() {
        assertEquals(10.0, flowerPack.getSepLen());

    }

    @Test
    void getColor() {
        assertArrayEquals(new int[] {127, 0, 127}, flowerPack.getColor());
    }
}