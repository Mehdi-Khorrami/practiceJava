package ir.calculator;

public abstract class NumericCalculator<T extends  Number> extends GeneralCalculator<T>{


    public NumericCalculator(T[] arr) {
        super(arr);
    }

    public abstract Double avg();

    public abstract Double sum();

    public abstract T max();

    public abstract T min();

}
