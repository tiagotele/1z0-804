class FormattingTest{
	public static void main(String ... args){
		System.out.println("Running");

		int i1 = -123;
		int i2 = 12345;
		System.out.printf(">%1$(7d< \n",i1);
		System.out.printf(">%0,7d< \n",i2);
		System.out.format(">%+-7d< \n",i2);
		System.out.printf(">%2$2b + %1$5d< \n",i1,false);
	}
}