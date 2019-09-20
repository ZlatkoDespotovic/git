package fakultet;

public class Student extends Covek {
	
		private int brIndeks;
		private int godStudija;
		private double trenutniProsek;

		public Student(String ime, String prezime, int godinaRodjenja, int brIndeks, int godStudija,
				double trenutniProsek) {
			super(ime, prezime, godinaRodjenja);
			this.brIndeks=brIndeks;
			this.godStudija=godStudija;
			this.trenutniProsek=trenutniProsek;
		
		}

		public int getBrIndeks() {
			return brIndeks;
		}

		public int getGodStudija() {
			return godStudija;
		}

		public double getTrenutniProsek() {
			return trenutniProsek;
		}
		public String ispis() {
			String s="";
			s+=super.ispis()+"je student "+godStudija+" godine studija sa prosekom "+trenutniProsek;
			return s;
		}

	}



