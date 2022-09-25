package resheniekvadratnogouravnenia;

class Otvet {
    
    private int a;
    private int b;
    private int c;
    
    private Znachenie x;
    private Znachenie x1;
    private Znachenie x2;
    
    private int diskriminant;
            
    Otvet(int a, int b, int c) {        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getDiskriminant() {
        diskriminant = (b * b) - (4 * a * c);
        return diskriminant;
    }
    
    public void getOtvet() {
//        if (this.getDiskriminant() > 0) {
//            x1 = -b + Math.pow(Double.parseDouble(deskriminant));
//        }
//        if (this.getDiskriminant() < 0) {
//        
//        }
//        if (this.getDiskriminant() == 0) {
//        
//        }
    }

    @Override
    public String toString() {
        return "Otvet{" + "diskriminant=" + diskriminant + '}';
    }
    
}
