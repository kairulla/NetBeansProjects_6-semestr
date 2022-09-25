package oop;

public class AnswerQuEq {
    
    private final double x1;
    private final double x2;
    
    public AnswerQuEq(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public double getX1() {
        return x1;
    }
    
    public double getX2() {
        return x2;
    }
    
    @Override
    public String toString() {
        return String.format("x1=%.3f  x2=%.3f", getX1(), getX2());
    }
    
}
