package week5;

public class CamSanh extends QuaCam {
	public CamSanh(int p, String s, String d, int a, String c) {
		super(p,s,d,a,c);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\nprice: " + price + "\nsource: " + source 
				+ "\ndate: " + date + "\namount: " + amount + "\ncolor: " + color + "\n";
	}
}
