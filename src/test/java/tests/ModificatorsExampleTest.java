package tests;

import org.junit.jupiter.api.Test;
import modificators_example.ModificatorsExample;

public class ModificatorsExampleTest extends ModificatorsExample {

    @Test
    public void runModificatorsExampleTest() {
        System.out.println(var1);
//        System.out.println(length2); // переменная недоступна, так как модификатор доступа private
        System.out.println(var3);
//        System.out.println(length4); // переменная недоступна, так как модификатор доступа default
    }

}
