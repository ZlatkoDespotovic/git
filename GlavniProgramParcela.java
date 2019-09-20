package parcela;

public class GlavniProgramParcela {

public static void main(String[] args) {
			Njiva n = new Njiva(600, 300);
			Njiva n1 = new Njiva(900, 400);
			Suma s = new Suma(700, 600, 200, 3);
			Suma s1 = new Suma(400, 200, 100, 2);
			Parcela[]niz= {n, n1,s, s1};
			for (int i=0; i<niz.length; i++) {
				System.out.println(niz[i]);

            }
	  }
}
