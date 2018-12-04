package week5;

public class QuaTao extends HoaQua {
	protected String color;
	
	public QuaTao(int p, String s, String d, int a, String c) {
		super(p,s,d,a);
		color=c;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\nprice: " + price + "\nsource: " + source 
				+ "\ndate: " + date + "\namount: " + amount + "\ncolor: " + color + "\n";
	}
}
