package oop;

import java.util.ArrayList;
import java.util.List;

public class ListSolverQuEq {
    
    private final List<ISolverQuEq> listSolverQuEq;
    //private final List<SolverQuEq> listSolverQuEq;
    
    {
        listSolverQuEq = new ArrayList<>();
    }
    
    public void addQuEq(double a, double b, double c) {
        listSolverQuEq.add(new SolverQuEq(a, b, c));
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < listSolverQuEq.size(); i++) {
            s.append(listSolverQuEq.get(i));
        }        
        return s.toString();
    }
    
}
