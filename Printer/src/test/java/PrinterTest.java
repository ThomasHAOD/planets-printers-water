import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    @Test
    public void canPrint(){
        Printer printer = new Printer(10, 5);
        printer.print(2, 3);
        assertEquals(4, printer.sheetsLeft);
    }

    @Test
    public void tonerReduces(){
        Printer printer = new Printer(10, 6);
        printer.print(2, 3);
        assertEquals(0, printer.toner);
    }

}
