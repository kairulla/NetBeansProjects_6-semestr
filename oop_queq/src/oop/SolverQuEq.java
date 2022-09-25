package oop;

public class SolverQuEq implements ISolverQuEq {
    
    private double a, b, c;
    private AnswerQuEq answerQuEq;
    
    {
        answerQuEq = null;
    }
    
    public SolverQuEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double d = (b * b) - 4 * a * c;
        
        try {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1)) & (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                answerQuEq = new AnswerQuEq(x1, x2);
            }
        } catch (Exception e) {
            answerQuEq = null;
        }
    }
    
    public double getA() {
        return a;
    }
    
    public double getB() {
        return b;
    }
    
    public double getC() {
        return c;
    }
    
    public AnswerQuEq getSolutionQuEq() {
        return answerQuEq;
    }
    
    @Override
    public String toString() {
        String s = "Решение для " + "a=" +a + ", b=" + b + ", c=" + c + ":\t";
        if (answerQuEq != null) {
            return s + answerQuEq + "\n";
        } else {
            return s + "не существует\n";
        }
    }
    
}
