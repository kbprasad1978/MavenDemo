
import org.junit.Assert;
import org.junit.Test;
public class TestCalculator {

    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        Assert.assertEquals(7,c.add(2,5));
        System.out.println("TestFeatureBranch");
    }

}
