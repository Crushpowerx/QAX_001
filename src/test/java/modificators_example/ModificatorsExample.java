package modificators_example;

public class ModificatorsExample {
    final public int var1 = 1; // доступ со всех классов и всех пакетов
    final private int var2 = 2; // доступ только внутри текущего класса
    final protected int var3 = 3; // доступ со всех классов текущего пакета и для класса наследователя
    final int var4 = 4; // (default) доступ со всех классов текущего пакета НО НЕ для класса наследователя
}
