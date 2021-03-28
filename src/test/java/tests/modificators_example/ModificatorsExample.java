package tests.modificators_example;

public class ModificatorsExample {
    final public int length1 = 2; // доступ со всех классов и всех пакетов
    final private int length2 = 2; // доступ только внутри текущего класса
    final protected int length3 = 2; // доступ со всех классов текущего пакета и для класса наследователя
    final int length4 = 2; // (default) доступ со всех классов текущего пакета НО НЕ для класса наследователя
}
