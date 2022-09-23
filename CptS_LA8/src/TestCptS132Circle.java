import org.junit.*;
import static org.junit.Assert.*;

public class TestCptS132Circle {
    // valid Test case
    @Test
    public void testCircle() {
        CptS132Circle circle = new CptS132Circle(10);
        double area = circle.getArea();
        System.out.println("Circle Area = " + area);
        Assert.assertNotNull(area);
    }

    // Exceptional testCase
    @Test
    public void testCircleArgument() {

        try {
            CptS132Circle circle = new CptS132Circle(-1);
            double area = circle.getArea();
            System.out.println("Circle Area = " + area);
            Assert.assertNotNull(area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
