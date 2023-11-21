package upd_20;

import java.io.Serializable;

public class ThreeParameters<T extends Comparable<T>, V extends animal & Serializable, K> {
    private T firstParam;
    private V secondParam;
    private K thirdParam;

    public ThreeParameters(T firstParam, V secondParam, K thirdParam) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.thirdParam = thirdParam;
    }

    public T getFirstParam() {
        return firstParam;
    }

    public V getSecondParam() {
        return secondParam;
    }

    public K getThirdParam() {
        return thirdParam;
    }

    public void printClassNames() {
        System.out.println("First Parameter Class: " + firstParam.getClass().getName());
        System.out.println("Second Parameter Class: " + secondParam.getClass().getName());
        System.out.println("Third Parameter Class: " + thirdParam.getClass().getName());
    }
}
