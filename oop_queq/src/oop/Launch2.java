package oop;

public class Launch2 {
    
    public static void main(String[] args) {
        ListSolverQuEq listSolverQuEq = new ListSolverQuEq();
        listSolverQuEq.addQuEq(-12, 33, 14);
        listSolverQuEq.addQuEq(-2, 3, 4);
        listSolverQuEq.addQuEq(22,-3, 55);
        listSolverQuEq.addQuEq(12, 4, -7);
        System.out.println(listSolverQuEq);
    }
    
}
