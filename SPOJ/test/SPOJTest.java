
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import static junit.framework.Assert.fail;

/**
 *
 * @author eduardo
 */
public abstract class SPOJTest {

    protected final PrintStream stdout;
    protected ByteArrayOutputStream out;

    public SPOJTest() {
        this.stdout = System.out;
    }

    protected abstract void testMain();

    protected void test(TestCase tc) {
        setInput(new ByteArrayInputStream(tc.input.getBytes()));
        out = new ByteArrayOutputStream();
        setOutput(new PrintStream(out));

        try {
            testMain();
        } catch (NoSuchElementException ex) {
            // 
        }

        if (!tc.expected.equals(out.toString())) {
            fail("Failed: \n"
                    + "----------Expected----------\n"
                    + tc.expected + "\n"
                    + "----------------------------\n"
                    + "----------Output------------\n"
                    + out.toString() + "\n"
                    + "----------------------------\n");
        }
    }

    protected void setInput(InputStream in) {
        System.setIn(in);
    }

    protected void setOutput(PrintStream out) {
        System.setOut(out);
    }
}
