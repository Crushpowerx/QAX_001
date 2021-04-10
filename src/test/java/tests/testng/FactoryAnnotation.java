package tests.testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotation {

    @Factory()
    @Test
    public Object[] getTestFactoryMethod() {
        Object[] factoryTest = new Object[4];
        factoryTest[0] = new FactorySimplyTest1("CA");
        factoryTest[1] = new FactorySimplyTest1("DE");
        factoryTest[2] = new FactorySimpleTest2("FI");
        factoryTest[3] = new FactorySimpleTest2("NO");
        return factoryTest;
    }

}
