package Prosek;

public class Covek {
		
		private String ime;
		private String prezime;
		private int index;
		
		public Covek() {
			ime=" ";
			prezime=" ";
			index=0;
		}
		public Covek(String ime,String prezime,int index) {
			this.ime=ime;
			this.prezime=prezime;
			this.index=index;
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
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		@Override
		public String toString() {
			return "Covek [ime=" + ime + ", prezime=" + prezime + ", index=" + index + "]";
		}
		

	}


}
