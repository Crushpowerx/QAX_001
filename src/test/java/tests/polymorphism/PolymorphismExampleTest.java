package tests.polymorphism;

import org.junit.jupiter.api.Test;

public class PolymorphismExampleTest {

    @Test
    public void runPolymorphismExampleTest() {
        Aibolit aibolit = new Aibolit();
        Lion simba = new Lion();
        Tiger sherekhan = new Tiger();
        Cheetah chester = new Cheetah();

        aibolit.healAnimal(simba);
        aibolit.healAnimal(sherekhan);
        aibolit.healAnimal(chester);
    }

}
