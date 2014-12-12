/**
 * Klasa za konverziju temperatura
 * @author nedimomerovic
 *
 */

public class Temperatura {
	
	public int vrstaMjere;
	public double unos;
	
	public int getVrstaMjere() {
		return vrstaMjere;
	}

	public void setVrstaMjere(int vrstaMjere) {
		this.vrstaMjere = vrstaMjere;
	}

	public double getUnos() {
		return unos;
	}

	public void setUnos(double unos) {
		this.unos = unos;
	}
	/**
	 * Koristi formule da isprinta rezultat na osnovu vrijednosti vrstaMjere
	 * @param vrstaMjere
	 * @param unos
	 * @return
	 */
	public double Konverzija(int vrstaMjere,double unos){
	
	if (vrstaMjere ==1){
		System.out.println("Konverzija "+unos+" Celziusa iznosi "+celziusUFarenhajt(unos)+" Farenhajta");
	}
	else if (vrstaMjere ==2){
		System.out.println(celziusUKelvin(unos));
	}
	else if (vrstaMjere==3){
		System.out.println(farnhajtUCelzius(unos));
	}
	else if (vrstaMjere==4)	{
		System.out.println(kelvinUCelzius(unos));
	}
	else if (vrstaMjere==5)	{
		System.out.println(kelvinUFarenhajt(unos));
	}
	else if (vrstaMjere==6){
		System.out.println(farenhajtUKelvin(unos));
	}else
		System.out.println("Niste unjeli dobru vrijednost za vrstu konverzije zelite");
	return 0;
	}
	/**
	 * formula za konverziju sistema temperatura
	 * C>F
	 * @param unos
	 * @return
	 */
	public static double celziusUFarenhajt(double unos) {
		return unos * 9 / 5 + 32;
	}

	public static double celziusUKelvin(double unos) {
		return unos + 273.15;

	}

	public static double farnhajtUCelzius(double unos) {
		return ((unos - 32) * 5 / 9);
	}

	public static double kelvinUCelzius(double unos) {
		return unos - 273.15;
	}

	public static double kelvinUFarenhajt(double unos) {
		return unos * 9 / 5 - 459.67;
	}

	public static double farenhajtUKelvin(double unos) {
		return ((unos + 459.67) * 5 / 9);
	}
	

}
