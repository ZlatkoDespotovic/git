package fakultet;

public class Covek {

		protected String ime;
		protected String prezime;
		protected int godRodjenja;

		public Covek(String ime, String prezime, int godRodjenja) {
			this.ime = ime;
			this.prezime = prezime;
			this.godRodjenja = godRodjenja;

		}

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public String getPrezime() {
			return prezime;
		}

		public void setPrezime(String prezime) {
			this.prezime = prezime;
		}

		public int getGodRodjenja() {
			return godRodjenja;
		}

		public String ispis() {
			String s="";
			s+=this.ime+ " "+ this.prezime +"["+this.godRodjenja+"]";
			return s;
		}
	}


