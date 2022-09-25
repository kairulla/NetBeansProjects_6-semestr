package resheniekvadratnogouravnenia;

class Drob {
    
    private int Tzeloe = 0;
    private int Chislitel = 0;
    private int Znamenatel = 1;
    
    Drob(int Tzeloe, int Chislitel, int Znamenatel) {
        this.Tzeloe = Tzeloe;
        this.Chislitel = Chislitel;
        this.Znamenatel = Znamenatel;
    }

    public int getTzeloe() {
        return Tzeloe;
    }

    public void setTzeloe(int Tzeloe) {
        this.Tzeloe = Tzeloe;
    }
    
    public int getChislitel() {
        return Chislitel;
    }

    public void setChislitel(int Chislitel) {
        this.Chislitel = Chislitel;
    }

    public int getZnamenatel() {
        return Znamenatel;
    }

    public void setZnamenatel(int Znamenatel) {
        if (Znamenatel != 0) {
            this.Znamenatel = Znamenatel;
        } else {
            this.Znamenatel = 1;
        }
    }

    @Override
    public String toString() {
        return "Tzeloe = " + Tzeloe + "\nChislitel = " + Chislitel + "\nZnamenatel = " + Znamenatel;
    }       
    
}
