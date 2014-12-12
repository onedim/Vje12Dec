


public class TemperaturaTest {

	public static void main(String[] args) {
		System.out.println("Unesite broj za koju vrstu konverzije zelite:");
		System.out.println("1: Celsius>>Farenhait\n2: Celsius>>Kelvin\n3: Farenhait>>Celsius\n4: Kelvin>>Celsius\n5: Kelvin>>Farenhait\n6: Farenhait>>Kelvin");
		
		
		/**
		 * konstruktor za koristenje klase Temperatura
		 */
		Temperatura t1=new Temperatura();{
			System.out.println ("Unesite vrstu konverzije");
			t1.Konverzija(TextIO.getlnInt(), TextIO.getlnDouble());
			
		}
			
	
	}

}
