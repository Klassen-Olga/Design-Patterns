package md.design.patterns.factory;

public class Pharmacy {
	public Drug getDrug(String symptom){
		if (symptom.equals("allergy")){
			return new Nixar("This treatment protects against any kind of allergy");
		}
		else if (symptom.equals("headache")){
			return new Azinfexin("Headache medicament");
		}
		else throw new IllegalArgumentException();
	}
}
