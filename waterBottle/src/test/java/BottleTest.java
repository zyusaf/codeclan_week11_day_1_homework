import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(true, bottle.volumeStartsAt100());
    }

    @Test
    public void drinkTakes10OffVolume(){
        assertEquals(90, bottle.drinkTakes10OffVolume());
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0, bottle.canEmptyBottle());
    }

    @Test
    public void canFillBottle(){
        assertEquals(100, bottle.canFillBottle());
    }

}
