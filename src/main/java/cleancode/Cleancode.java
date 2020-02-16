package cleancode;

public final class Cleancode {
	public static void main(String args[])
	{
		System.out.format("\n%s", "finding simple and compound interest:");
		int principal=1000;
		int rate=2;
		int term=6;
		double simple_interest=(principal*rate*term)/100;
		System.out.printf("\nsimple interest is:%.3f", simple_interest);
		double compound_interest=principal*Math.pow((1+rate),term)-principal;
		System.out.printf("\ncompound interest is:%.3f", compound_interest);
	System.exit(0);
	}
	

}
