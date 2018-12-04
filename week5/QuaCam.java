package week5;

public class QuaCam extends HoaQua{
	protected String color;
	
	public QuaCam() {}
	public QuaCam(int p, String s, String d, int a, String c) {
		super(p,s,d,a);
		color=c;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\nprice: " + price + "\nsource: " + source 
				+ "\ndate: " + date + "\namount: " + amount + "\ncolor: " + color + "\n";
	}
}
