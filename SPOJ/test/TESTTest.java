
import org.junit.Test;


/**
 *
 * @author eduardo
 */
public class TESTTest extends SPOJTest {

    public TESTTest() {
        super();
    }

    /**
     * TestCase01 - Original
     */
    @Test
    public void testTC01() {
        test(new TestCase(
                "1\n2\n88\n42\n99\n",
                "1\n2\n88\n"));
    }

    /**
     * TestCase02
     */
    @Test
    public void testTC02() {
        test(new TestCase(
                "1\n2\n88\n43\n99\n41\n33\n",
                "1\n2\n88\n43\n99\n41\n33\n"));
    }

    /**
     * TestCase03
     */
    @Test
    public void testTC03() {
        test(new TestCase(
                "42\n45\n563454354343436343443652222222222222222222222220\n",
                ""));
    }

    @Override
    protected void testMain() {
        TEST.main(null);
    }
}
