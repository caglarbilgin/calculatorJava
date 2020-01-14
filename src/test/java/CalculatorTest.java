import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {


    private Calculator cal;

    @BeforeTest
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(cal.add(1,1),2);
    }


}
