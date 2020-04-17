package _02_sea_creature;

public class Seacreature_runner {
public static void main(String[] args) {
	SeaCreature s = new SeaCreature("spongebob");
	SeaCreature p = new SeaCreature ("patrick");
	SeaCreature sq = new SeaCreature ("squidward");
	s.eat();
	s.laugh();
	p.getName();
	p.eat();
	p.laugh();
	sq.getName();
	sq.eat();
	sq.laugh();
	
}
}
