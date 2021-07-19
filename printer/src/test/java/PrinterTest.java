import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 60);
    }

    @Test
    public void hasPaper(){
        assertEquals(true, printer.hasPaper());
    }

    @Test
    public void canPrint(){
        assertEquals(6, printer.canPrint(2, 3));
    }

    @Test
    public void onlyPrintIfEnoughPaper(){
        assertEquals(true, printer.onlyPrintIfEnoughPaper(2, 3));
    }

    @Test
    public void notEnoughPaperTooPrint(){
        assertEquals(false, printer.onlyPrintIfEnoughPaper(20, 3));
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void reduceTonerWhenPrint(){
        assertEquals(true, printer.onlyPrintIfEnoughPaper(5, 2));
    }

    @Test
    public void doNotReduceTonerWhenPrint(){
        assertEquals(false, printer.onlyPrintIfEnoughPaper(50, 2));
    }

}
