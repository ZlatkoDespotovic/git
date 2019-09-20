package domaci_08272019;

public class GlavniProgramKnjige {
	    public static void main(String[] args) {
	        Knjige k1=new Knjige("Proces","Franc Kafka");
	        Knjige k2=new Knjige("Ana Karenjina","Lav Tolstoj");
	        Knjige k3=new Knjige("Lutke na bunjistu","Zivojin Pavlovic");
	        k1.setGodina(1925);
	        k2.setGodina(1877);
	        k3.setGodina(1991);
	        k1.setBrStr(252);
	        k2.setBrStr(700);
	        k3.setBrStr(261);
	        
	        
	        System.out.println("Naziv knjige: "+k1.getNazivK()+" Naziv autora: "+k1.getNazivA()+" Godina izdavanja: "+k1.getGodina()+" Broj strana: "+k1.getBrStr());
	        System.out.println("Naziv knjige: "+k2.getNazivK()+" Naziv autora: "+k2.getNazivA()+" Godina izdavanja: "+k2.getGodina()+" Broj strana: "+k2.getBrStr());
	        System.out.println("Naziv knjige: "+k3.getNazivK()+" Naziv autora: "+k3.getNazivA()+" Godina izdavanja: "+k3.getGodina()+" Broj strana: "+k3.getBrStr());
	        
	    }
	}


