package flowerstore;

import static org.junit.jupiter.api.Assertions.*;


class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        int[] color = new int[] {127, 0, 127} ;
        flower = new Flower(10.0, 10.0, color, FlowerType.CHAMOMILE);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(10, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertArrayEquals(new int[] {127, 0, 127}, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType(){
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowertype());
    }
}