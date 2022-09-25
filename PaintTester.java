class PaintTester{
	public static void main(String paint[]){
	Paint.setPaintId(1234);
	Paint.setName("Asian");
	Paint.setBrandName("Asian Paints");
	Paint.setColor("Green");
	
		System.out.println(Paint.getPaintId() +" "+Paint.getName() +" "+Paint.getBrandName() +" "+Paint.getColor());
	}
}