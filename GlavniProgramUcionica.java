package ucionica;

public class GlavniProgramUcionica {
    public static void main(String[] args) {
        Polaznik p1= new Polaznik("Zlatko Despotovic");
        Laptop l1= new Laptop("Dell",p1);
        
        System.out.println(l1.ispisi()+" "+p1.ispisi());
    }
    
}


