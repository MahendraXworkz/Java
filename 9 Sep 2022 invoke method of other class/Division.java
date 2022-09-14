class Division{
	public static void divide(double a,double b){
		double div=Math.round(a/b*100);
		double div0=div/100;
		System.out.println("\n"+a+" / " + b  +" = "+div0+"\n");
	}
}