package ucionica;

public class Laptop {
    private Polaznik polaznik;
    private String model;
    
    public Laptop (String model, Polaznik polaznik) {
        this.model=model;
        this.polaznik=polaznik;
        
    }
    public Polaznik getPolaznik() {
        return polaznik;
    }
    public void setPolaznik(Polaznik polaznik) {
        if (this.polaznik!=null)
        this.polaznik = polaznik;
    }
    public void resetPolaznik() {
        polaznik=null;
    }
    public String getModel() {
        return model;
    }
    
    public String ispisi() {
        String s;
        if (polaznik==null) {
            s="NEMA POLAZNIKA";
        }
        else {
            s=polaznik.ispisi();
        }
        return model+"{"+s+"}";
    }
}


