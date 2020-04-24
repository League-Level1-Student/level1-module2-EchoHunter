package _04_tea_maker;



public class Tea_Runner {
public static void main(String[] args) {
	
	Cup c = new Cup();
Kettle k = new Kettle();
	TeaBag t = new TeaBag("Chamomile");
System.out.println(t.getFlavor());
k.getWater();
k.boil();
c.makeTea(t, k.getWater() );
















}
}
