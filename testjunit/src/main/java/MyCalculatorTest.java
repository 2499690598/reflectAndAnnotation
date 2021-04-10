import com.yc.biz.Calculator;
import junit.*;

public class MyCalculatorTest {

    private Calculator cal;

    @MyBeforeClass
    public static void bc(){
        System.out.println("beforeclass");
    }

    @MyBefore
    public void setUp() throws Exception{
        System.out.println("before");
        cal = new Calculator();
    }

    @MyAfter
    public void tearDown() throws Exception{
        System.out.println("after");
    }

    @MyAfterClass
    public static void ac(){
        System.out.println("AfterClass");
    }

    @MyTest
    public void add(){
        System.out.println("add测试");
    }

    @MyTest
    public void sub(){
        System.out.println("sub测试");
    }
}
