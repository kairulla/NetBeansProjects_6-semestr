package resheniekvadratnogouravnenia;

class Znachenie {
    
    private Drob x; 
    
    Znachenie(Drob x) {
        this.x = x;        
    }
    
    public Drob getX() {
        return x;
    }

    public void setX(Drob x) {
        this.x = x;
    }       

    @Override
    public String toString() {
        return "Znachenie{" + " " + x + '}';
    }
    
}
