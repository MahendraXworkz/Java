class FurnituresTester{ 
	public static void main(String args[]){
		Furnitures.setName("Swing Chair");
		Furnitures.setBrandName("Dmosaic");
		Furnitures.setPrice(16999);
		Furnitures.setColor("White,Black");
		Furnitures.setPerfectFor("Outdoor,Indoor,Balcony,Garden,Patio");
			System.out.println(Furnitures.getName() +" "+Furnitures.getBrandName() +" "+Furnitures.getPrice() +" "+Furnitures.getColor() +" "+Furnitures.getPerfectFor());
	}
}