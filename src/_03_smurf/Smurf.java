package _03_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
<<<<<<< HEAD
		if (name .equals("Papa Smurf")){
			return "red";
		}
		else {
			return "white";
		}
=======
		if(name .equals("Papa Smurf")) {
		return "red hat";	
		}
		else {
		return "white hat";
	}
>>>>>>> 59a0af33ce84ff22d9fcd2398df0fd28329c44a9
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
<<<<<<< HEAD
		if (name .equals("Smurfette")) {
			return "girl";
		}
		else {
			
		
		return "Boy";
		}
		}
=======
	if (name .equals ("Smurfette")) {
		return "female";
	}
	else {
		return "male";
	}
	}
>>>>>>> 59a0af33ce84ff22d9fcd2398df0fd28329c44a9

}


