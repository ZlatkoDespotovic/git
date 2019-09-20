package fakultet;

public class GlavniProgramFakultet {

		public static void main(String[] args) {
			Student s = new Student("Pera", "Peric", 1991, 98765, 4, 8.92);
			Student s1 = new Student("Dragana", "Draganic", 1992, 98521, 3, 7.73);
			Student s2 = new Student("Ana", "Ancic", 1993, 86576, 2, 9.00);
			Profesor p = new Profesor("Petar", "Petrovic", 1978, "Profesor");
			Profesor p1 = new Profesor("Mila", "Milovanovic", 1988, "Profesor");
			p.dodajPredmet("Slikanje");
			p.dodajPredmet("Slikarske tehnike");
			p1.dodajPredmet("Mozaik");
			p1.dodajPredmet("Fresko slikarstvo");
			System.out.println(s.ispis());
			System.out.println(s1.ispis());
			System.out.println(s2.ispis());
			System.out.println(p.ispisi());
			System.out.println(p1.ispisi());

		}

	}


