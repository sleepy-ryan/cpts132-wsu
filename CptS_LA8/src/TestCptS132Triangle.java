import org.junit.*;
import static org.junit.Assert.*;

public class TestCptS132Triangle {
    @Test
    public void testTriangle() {
        CptS132Triangle triangle = new CptS132Triangle(6, 11);
        double area = triangle.getArea();
        System.out.println("Triangle Area = " + area);
        Assert.assertNotNull(area);
    }

    @Test
    public void testTriangleArugment() {

        try {
            CptS132Triangle triangle = new CptS132Triangle(101, 2000);
            double area = triangle.getArea();
            System.out.println("Tiangle Area = " + area);
            Assert.assertNotNull(area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}