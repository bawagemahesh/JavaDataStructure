package Basic;

abstract class AbstractTest {
    public void test(){
        System.out.println("Test");
    }
}

public class AbTest extends AbstractTest {
    public static void main(String[] args) {
        AbstractTest abstractTest = new AbTest();
        abstractTest.test();
    }
}
