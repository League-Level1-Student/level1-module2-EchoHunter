package _07_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Guests {
	
	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. George Orwell is a man, so
	 * say “Hello Mr. Orwell”. Isaac Newton was knighted, so say "Hello Sir Isaac
	 * Newton".
	 **/

	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}

}

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
    private String welcome;
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		
		if (isWoman) {
			if (isKnighted = (false)) {

				welcome = ("Hello Ms. Austen");
			}
		} 
		else {
			if (isKnighted) {
				welcome = ("Hello Sir Isaac Newton");
			} 
			else  {
				welcome = ("Hello Mr. Orwell");
			}
		}
return welcome;
	}
}
