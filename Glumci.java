package glumci;

public class Glumci {
	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
	 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 * 
	 */

	public String ime;
	public String prezime;
	public int rodjendan;
	public String pol;
	private boolean status;
	private double prosecnaZarada;
	private int brojSnimljenih;
	public double ukupnaZarada;

	public Glumci() {

	}

	public void setstatus(boolean status) {
		this.status = status;

	}

	public boolean getstatus() {

		return this.status;

	}

	// prosecna zarada
	public void setprosecnaZarada(double prosek) {
		this.prosecnaZarada = prosek;

	}

	public double getprosecnaZarada() {
		return this.prosecnaZarada;

	}

	// broj snimljenih filmova
	public void setbrojSnimljenih(int broj) {

		this.brojSnimljenih = broj;

	}

	public int getbrojSnimljenih() {

		return this.brojSnimljenih;

	}

	// ukupna zarada
	public double ukupnaZarada() {

		double ukupnaZarada = this.prosecnaZarada * this.brojSnimljenih;
		return ukupnaZarada;
	}

	// br godina 2022.g
	public int sledeceGodine() {

		int sledeceGodine = 2022 - this.rodjendan;
		return sledeceGodine;

	}

	// izracunati i odstampati sve && mr or ms
	public void stampanje() {

		if (pol.equals("M")) {

			System.out.println("Name: Mr. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Gender: " + pol + "\n"
					+ "Married: " + status + "\n" + "Average salary: " + prosecnaZarada + "\n"
					+ "Number of movies filmed: " + brojSnimljenih + "\n" + "Estimated worth: " + ukupnaZarada() + "\n"
					+ "Age next year: " + sledeceGodine());

		} else {

			System.out.println("Name: Mrs. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Gender: " + pol + "\n"
					+ "Married: " + status + "\n" + "Average salary: " + prosecnaZarada + "\n"
					+ "Number of movies filmed: " + brojSnimljenih + "\n" + "Estimated worth: " + ukupnaZarada() + "\n"
					+ "Age next year: " + sledeceGodine());

		}

	}

}
