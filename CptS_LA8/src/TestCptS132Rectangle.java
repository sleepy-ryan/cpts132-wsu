import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit 4 test class for CptS132Rectangle.
 * <p>
 * There is an error in CptS132Rectangle. The parameters for the
 * constructor are reversed from what's expected in the base class.
 * This was pretty obvious, you probably caught this one. This is
 * not the "extra-credit" error.
 *
 * @author Dan
 */
public class TestCptS132Rectangle {

    @Test
    public void testRectagle() {
        CptS132Rectangle rectangle = new CptS132Rectangle(5,10);
        double area = rectangle.getArea();
        System.out.println("Rectangle Area = " + area);
        Assert.assertNotNull(area);
    }

    @Test
    public void testRectangleArgument() {

        try {
            CptS132Rectangle rectangle = new CptS132Rectangle(1001,200);
            double area = rectangle.getArea();
            System.out.println("Area = " + area);
            Assert.assertNotNull(area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    // shared variables for the test cases
    private CptS132Rectangle rect2x1;
    private CptS132Rectangle rect0x3;
    private CptS132Rectangle rect5x5;

    /**
     * Normal case constructor test. <br/>
     * Parameter values: 5, 5
     */
    @Test
    public void testConstructor5() {
        new CptS132Rectangle(5, 5);
    }

    /**
     * Boundary case constructor test. <br/>
     * Parameter values: 0
     */
    @Test
    public void testConstructor0() {
        new CptS132Rectangle(0, 0);
    }

    /**
     * Error case constructor test. <br/>
     * Parameter value: -2, 5
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_2() {
        new CptS132Rectangle(-2, 5);
    }

    /**
     * Error case constructor test. <br/>
     * Parameter value: 2, -5
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_5() {
        new CptS132Rectangle(2, -5);
    }

    /**
     * Error case constructor test. <br/>
     * Parameter value: 20000, 5
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor20000() {
        new CptS132Rectangle(20000, 5);
    }

    /**
     * Error case constructor test. <br/>
     * Parameter value: 2, 50000
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor50000() {
        new CptS132Rectangle(2, 50000);
    }

    /**
     * Set up code to instantiate the shared variables
     * for testing. Yes, this routine would be problematic
     * if the constructor tests fail.
     */
    @Before
    public void setup() {
        rect2x1 = new CptS132Rectangle(2, 1);
        rect5x5 = new CptS132Rectangle(5, 5);
        rect0x3 = new CptS132Rectangle(0, 3);
    }

    /**
     * Testing getWidth, case 2x1
     */
    @Test
    public void testWidth2x1() {
        double expected = 1;
        assertEquals("Width 2x1", expected, rect2x1.getWidth(), 1e-9);
    }

    /**
     * Testing getWidth, case 5x5
     */
    @Test
    public void testWidth5x5() {
        double expected = 5;
        assertEquals("Width 5x5", expected, rect5x5.getWidth(), 1e-8);
    }

    /**
     * Testing getWidth, case 0x3
     */
    @Test
    public void testWidth0x3() {
        double expected = 3;
        assertEquals("Width 0x3", expected, rect0x3.getWidth(), 1e-9);
    }

    /**
     * Testing getHeight, case 2x1
     */
    @Test
    public void testHeight2x1() {
        double expected = 2;
        assertEquals("Height 2x1", expected, rect2x1.getHeight(), 1e-9);
    }

    /**
     * Testing getHeight, case 5x5
     */
    @Test
    public void testHeight5x5() {
        double expected = 5;
        assertEquals("Height 5x5", expected, rect5x5.getHeight(), 1e-8);
    }

    /**
     * Testing getHeight, case 0x3
     */
    @Test
    public void testHeight0x3() {
        double expected = 0;
        assertEquals("Height 0x3", expected, rect0x3.getHeight(), 1e-9);
    }

    /**
     * Testing getArea, case 2x1
     */
    @Test
    public void testArea2x1() {
        double expected = 2;
        assertEquals("Area 2x1", expected, rect2x1.getArea(), 1e-9);
    }

    /**
     * Testing getArea, case 5x5
     */
    @Test
    public void testArea5x5() {
        double expected = 25;
        assertEquals("Area 5x5", expected, rect5x5.getArea(), 1e-8);
    }

    /**
     * Testing getArea, case 0x3
     */
    @Test
    public void testArea0x3() {
        double expected = 0;
        assertEquals("Area 0x3", expected, rect0x3.getArea(), 1e-9);
    }

}