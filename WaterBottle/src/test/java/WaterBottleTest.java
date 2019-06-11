import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void takesGulp(){
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(90, waterBottle.gulp());
    }

    @Test
    public void empties(){
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(0, waterBottle.chugIt());
    }

    @Test
    public void fillsUp(){
        WaterBottle waterBottle = new WaterBottle(55);
        assertEquals(100, waterBottle.takeATripToTheCooler());
    }


}
