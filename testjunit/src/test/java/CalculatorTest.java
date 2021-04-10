import com.yc.biz.Calculator;
import org.junit.*;

public class CalculatorTest {

    private Calculator cal;

    @BeforeClass
    public static void bc(){
        System.out.println("beforeclass");
    }

    @Before
    public void setUp() throws Exception{
        System.out.println("before");
        cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("after");
    }

    @AfterClass
    public static void ac(){
        System.out.println("AfterClass");
    }

    @Test
    public void add(){
        System.out.println("add测试");
        Assert.assertEquals(3,cal.add(1,2));
    }

    @Test
    public void sub(){
        System.out.println("sub测试");
        Assert.assertEquals(3,cal.sub(2,1));
    }
}
