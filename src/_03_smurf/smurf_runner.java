package _03_smurf;

public class smurf_runner {
public static void main(String[] args) {
	Smurf h = new Smurf("handy");
Smurf p = new Smurf("Papa Smurf");
Smurf s = new Smurf("Smurfette");
	
	h.eat();
	System.out.println(h.getName());
	System.out.println(p.getName());
	System.out.println(p.getHatColor());
	System.out.println(p.isGirlOrBoy());
	System.out.println(s.getName());
	System.out.println(s.getHatColor());
	System.out.println(s.isGirlOrBoy());
	
}
}
